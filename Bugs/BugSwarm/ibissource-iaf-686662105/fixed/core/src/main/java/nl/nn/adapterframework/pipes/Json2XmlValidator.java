/*
   Copyright 2017, 2018 Nationale-Nederlanden, 2020 WeAreFrank!

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
package nl.nn.adapterframework.pipes;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonStructure;
import javax.xml.transform.Source;
import javax.xml.validation.ValidatorHandler;

import org.apache.commons.lang.StringUtils;
import org.apache.xerces.xs.XSModel;

import nl.nn.adapterframework.align.Json2Xml;
import nl.nn.adapterframework.align.Xml2Json;
import nl.nn.adapterframework.align.XmlAligner;
import nl.nn.adapterframework.align.XmlTypeToJsonSchemaConverter;
import nl.nn.adapterframework.configuration.ConfigurationException;
import nl.nn.adapterframework.core.HasPhysicalDestination;
import nl.nn.adapterframework.core.IPipeLineSession;
import nl.nn.adapterframework.core.PipeForward;
import nl.nn.adapterframework.core.PipeRunException;
import nl.nn.adapterframework.core.PipeRunResult;
import nl.nn.adapterframework.doc.IbisDoc;
import nl.nn.adapterframework.parameters.ParameterList;
import nl.nn.adapterframework.stream.Message;
import nl.nn.adapterframework.util.XmlUtils;
import nl.nn.adapterframework.validation.ValidationContext;
import nl.nn.adapterframework.validation.XmlValidatorException;

/**
*<code>Pipe</code> that validates the XML or JSON input message against a XML-Schema and returns either XML or JSON.
*
* <table border="1">
* <tr><th>state</th><th>condition</th></tr>
* <tr><td>"success"</td><td>default</td></tr>
* <tr><td><i>{@link #setForwardName(String) forwardName}</i></td><td>if specified, the value for "success"</td></tr>
* <tr><td>"parserError"</td><td>a parser exception occurred, probably caused by non-well-formed XML. If not specified, "failure" is used in such a case</td></tr>
* <tr><td>"illegalRoot"</td><td>if the required root element is not found. If not specified, "failure" is used in such a case</td></tr>
* <tr><td>"failure"</td><td>if a validation error occurred</td></tr>
* </table>
* <br>
* @author Gerrit van Brakel
*/
public class Json2XmlValidator extends XmlValidator implements HasPhysicalDestination {

	public static final String INPUT_FORMAT_SESSION_KEY_PREFIX = "Json2XmlValidator.inputformat ";
	
	public final String FORMAT_XML="xml";
	public final String FORMAT_JSON="json";
	
	private boolean compactJsonArrays=true;
	private boolean strictJsonArraySyntax=false;
	private boolean jsonWithRootElements=false;
	private boolean deepSearch=false;
	private String targetNamespace;
	private String outputFormat=FORMAT_XML;
	private boolean autoFormat=true;
	private String outputFormatSessionKey="outputFormat";
	private boolean failOnWildcards=true;
	private boolean acceptNamespaceLessXml=false;
	private boolean produceNamespaceLessXml=false;
	private boolean validateJsonToRootElementOnly=true;


	{
		setSoapNamespace("");
	}
	
	@Override
	public void configure() throws ConfigurationException {
		super.configure();
		if (StringUtils.isNotEmpty(getSoapNamespace())) {
			throw new ConfigurationException("soapNamespace attribute not supported");
		}
		if (log.isDebugEnabled()) log.debug(getLogPrefix(null)+getPhysicalDestinationName());
	}
	
	public String getOutputFormat(IPipeLineSession session, boolean responseMode) {
		String format=null;
		if (StringUtils.isNotEmpty(getOutputFormatSessionKey())) {
			format=(String)session.get(getOutputFormatSessionKey());
		}
		if (StringUtils.isEmpty(format) && isAutoFormat() && responseMode) {
			format=(String)session.get(INPUT_FORMAT_SESSION_KEY_PREFIX+getName());
		}	
		if (StringUtils.isEmpty(format)) {
			format=getOutputFormat();
		}	
		return format;
	}
	
	protected void storeInputFormat(String format, IPipeLineSession session, boolean responseMode) {
		if (!responseMode) {
			String sessionKey = INPUT_FORMAT_SESSION_KEY_PREFIX+getName();
			if (log.isDebugEnabled()) log.debug("storing inputFormat ["+format+"] under session key ["+sessionKey+"]");
			session.put(sessionKey, format);
		}
	}
	
	/**
	 * Validate the XML or JSON input, and align/convert it into JSON or XML according to a XML-Schema. 
	 * The format of the input message (XML or JSON) is automatically detected.
	 * @throws PipeRunException when <code>isThrowException</code> is true and a validationerror occurred.
	 */
	@Override
	public PipeRunResult doPipe(Message input, IPipeLineSession session, boolean responseMode) throws PipeRunException {
		String messageToValidate;
		try {
			messageToValidate=input==null || input.asObject()==null?"{}":input.asString();
		} catch (IOException e) {
			throw new PipeRunException(this, getLogPrefix(session)+"cannot open stream", e);
		}
		int i=0;
		while (i<messageToValidate.length() && Character.isWhitespace(messageToValidate.charAt(i))) i++;
		if (i>=messageToValidate.length()) {
			messageToValidate="{}";
			storeInputFormat(FORMAT_JSON,session, responseMode);
		} else {
			char firstChar=messageToValidate.charAt(i);
			if (firstChar=='<') {
				// message is XML
				if (isAcceptNamespaceLessXml()) {
					messageToValidate=addNamespace(messageToValidate); // TODO: do this via a filter
					//if (log.isDebugEnabled()) log.debug("added namespace to message ["+messageToValidate+"]");
				}
				storeInputFormat(FORMAT_XML,session, responseMode);
				if (!getOutputFormat(session,responseMode).equalsIgnoreCase(FORMAT_JSON)) {
					PipeRunResult result=super.doPipe(new Message(messageToValidate),session, responseMode);
					if (isProduceNamespaceLessXml()) {
						try {
							result.setResult(XmlUtils.removeNamespaces(result.getResult().asString()));
						} catch (IOException e) {
							throw new PipeRunException(this, "Cannot remove namespaces",e);
						}
					}
					return result;
				}
				try {
					return alignXml2Json(messageToValidate, session, responseMode);
				} catch (Exception e) {
					throw new PipeRunException(this, "Alignment of XML to JSON failed",e);
				}
			}
			if (firstChar!='{' && firstChar!='[') {
				throw new PipeRunException(this,"message is not XML or JSON, because it starts with ["+firstChar+"] and not with '<', '{' or '['");
			}
			storeInputFormat(FORMAT_JSON,session, responseMode);
		}
		try {
			return alignJson(messageToValidate, session, responseMode);
		} catch (XmlValidatorException e) {
			throw new PipeRunException(this, "Cannot align JSON", e);
		}
	}
	
	protected Set<List<String>> getJsonRootValidations(boolean responseMode) {
		if (isValidateJsonToRootElementOnly()) {
			String root=getMessageRoot(responseMode);
			if (StringUtils.isEmpty(root)) {
				return null;
			}
			List<String> resultList = new LinkedList<>();
			resultList.add(root);
			Set<List<String>> resultSet = new HashSet<>();
			resultSet.add(resultList);
			return resultSet;
		} 
		return getRootValidations(responseMode);
	}
	
	protected PipeRunResult alignXml2Json(String messageToValidate, IPipeLineSession session, boolean responseMode) throws XmlValidatorException, PipeRunException, ConfigurationException {

		ValidationContext context = validator.createValidationContext(session, getJsonRootValidations(responseMode), getInvalidRootNamespaces());
		ValidatorHandler validatorHandler = validator.getValidatorHandler(session,context);
		// Make sure to use Xerces' ValidatorHandlerImpl, otherwise casting below will fail.
		XmlAligner aligner = new XmlAligner(validatorHandler);
		Xml2Json xml2json = new Xml2Json(aligner, isCompactJsonArrays(), !isJsonWithRootElements());
		aligner.setContentHandler(xml2json);
		aligner.setErrorHandler(context.getErrorHandler());
		
		String resultEvent= validator.validate(messageToValidate, session, getLogPrefix(session), validatorHandler, xml2json, context);
		String out=xml2json.toString();
		PipeForward forward=determineForward(resultEvent, session, responseMode);
		PipeRunResult result=new PipeRunResult(forward,out);
		return result;
	}
	
	protected PipeRunResult alignJson(String messageToValidate, IPipeLineSession session, boolean responseMode) throws PipeRunException, XmlValidatorException {

		ValidationContext context;
		ValidatorHandler validatorHandler;
		try {
			context = validator.createValidationContext(session, getJsonRootValidations(responseMode), getInvalidRootNamespaces());
			validatorHandler = validator.getValidatorHandler(session, context);
		} catch (ConfigurationException e) {
			throw new PipeRunException(this,"Cannot create ValidationContext",e);
		}
		String resultEvent;
		String out=null;
		try {
			Json2Xml aligner = new Json2Xml(validatorHandler, context.getXsModels(), isCompactJsonArrays(), getMessageRoot(responseMode), isStrictJsonArraySyntax());
			if (StringUtils.isNotEmpty(getTargetNamespace())) {
				aligner.setTargetNamespace(getTargetNamespace());
			}
			aligner.setDeepSearch(isDeepSearch());
			aligner.setErrorHandler(context.getErrorHandler());
			aligner.setFailOnWildcards(isFailOnWildcards());
			ParameterList parameterList = getParameterList();
			if (parameterList!=null) {
				Map<String,Object> parametervalues = null;
				parametervalues = parameterList.getValues(new Message(messageToValidate), session).getValueMap();
				// remove parameters with null values, to support optional request parameters
				for(Iterator<String> it=parametervalues.keySet().iterator();it.hasNext();) {
					String key=it.next();
					if (parametervalues.get(key)==null) {
						it.remove();
					}
				}
				aligner.setOverrideValues(parametervalues);
			}
			JsonStructure jsonStructure = Json.createReader(new StringReader(messageToValidate)).read();
			
			if (getOutputFormat(session,responseMode).equalsIgnoreCase(FORMAT_JSON)) {
				Xml2Json xml2json = new Xml2Json(aligner, isCompactJsonArrays(), !isJsonWithRootElements());
				aligner.setContentHandler(xml2json);
				aligner.startParse(jsonStructure);
				out=xml2json.toString();
			} else {
				Source source = aligner.asSource(jsonStructure);
				out = XmlUtils.source2String(source,isProduceNamespaceLessXml());
			}
		} catch (Exception e) {
			resultEvent= validator.finalizeValidation(context, session, e);
		}
		resultEvent= validator.finalizeValidation(context, session, null);
		PipeForward forward=determineForward(resultEvent, session, responseMode);
		PipeRunResult result=new PipeRunResult(forward,out);
		return result;
	}

	public String addNamespace(String xml) {
		if (StringUtils.isEmpty(xml) || xml.indexOf("xmlns")>0) {
			return xml;
		}	
		String namespace = getSchemaLocation().split(" ")[0];
		if (log.isDebugEnabled()) log.debug("setting namespace ["+namespace+"]");
		int startPos=0;
		if (xml.trim().startsWith("<?")) {
			startPos=xml.indexOf("?>")+2;
		}
		int elementEnd=xml.indexOf('>',startPos);
		if (elementEnd<0) {
			return xml;
		}
		if (xml.charAt(elementEnd-1)=='/') {
			elementEnd--;
		}
		return xml.substring(0, elementEnd)+" xmlns=\""+namespace+"\""+xml.substring(elementEnd);
	}
	
	public JsonStructure createRequestJsonSchema() {
		return createJsonSchema(getRoot());
	}
	public JsonStructure createResponseJsonSchema() {
		return createJsonSchema(getResponseRoot());
 	}
	
	public JsonObject createJsonSchemaDefinitions(String definitionsPath) {
		List<XSModel> models = validator.getXSModels();
		XmlTypeToJsonSchemaConverter converter = new XmlTypeToJsonSchemaConverter(models, isCompactJsonArrays(), !isJsonWithRootElements(), schemaLocation, definitionsPath);
		JsonObject jsonschema = converter.getDefinitions();
		return jsonschema;
	}
	public JsonStructure createJsonSchema(String elementName) {
		return createJsonSchema(elementName, getTargetNamespace());
	}
	public JsonStructure createJsonSchema(String elementName, String namespace) {
		List<XSModel> models = validator.getXSModels();
		XmlTypeToJsonSchemaConverter converter = new XmlTypeToJsonSchemaConverter(models, isCompactJsonArrays(), !isJsonWithRootElements(), schemaLocation);
		JsonStructure jsonschema = converter.createJsonSchema(elementName, namespace);
		return jsonschema;
	}
	
	

	@Override
	public String getPhysicalDestinationName() {
		String result=null;
		if (StringUtils.isNotEmpty(getRoot())) {
			JsonStructure schema = createJsonSchema(getRoot());
			result="request message ["+getRoot()+"] JsonSchema ["+(schema==null?null:schema.toString())+"]";
		}
		if (StringUtils.isNotEmpty(getResponseRoot())) {
			if (result==null) {
				result = "";
			} else {
				result += "; ";
			}
			JsonStructure schema = createJsonSchema(getResponseRoot());
			result+="response message ["+getResponseRoot()+"] JsonSchema ["+(schema==null?null:schema.toString())+"]";
		}
		return result;
	}


	@IbisDoc({"1", "Only for json input: namespace of the resulting xml. Need only be specified when the namespace of root name is ambiguous in the schema", ""})
	public void setTargetNamespace(String targetNamespace) {
		this.targetNamespace = targetNamespace;
	}
	public String getTargetNamespace() {
		return targetNamespace;
	}

	@IbisDoc({"2", "Default format of the result. Either 'xml' or 'json'", "xml"})
	public void setOutputFormat(String outputFormat) {
		this.outputFormat = outputFormat;
	}
	public String getOutputFormat() {
		return outputFormat;
	}

	@IbisDoc({"3", "Session key to retrieve outputformat from.", "outputformat"})
	public void setOutputFormatSessionKey(String outputFormatSessionKey) {
		this.outputFormatSessionKey = outputFormatSessionKey;
	}
	public String getOutputFormatSessionKey() {
		return outputFormatSessionKey;
	}

	@IbisDoc({"4", "If true, the format on 'output' is set to the same as the format of the input message on 'input'. The format of the input message is stored in and retrieved from the session variable specified by outputFormatSessionKey", "true"})
	public void setAutoFormat(boolean autoFormat) {
		this.autoFormat = autoFormat;
	}
	public boolean isAutoFormat() {
		return autoFormat;
	}

	@IbisDoc({"5", "If true assume arrays in json do not have the element containers like in xml", "true"})
	public void setCompactJsonArrays(boolean compactJsonArrays) {
		this.compactJsonArrays = compactJsonArrays;
	}
	public boolean isCompactJsonArrays() {
		return compactJsonArrays;
	}

	@IbisDoc({"6", "If true check that incoming json adheres to the specified syntax (compact or full), otherwise both types are accepted for conversion from json to xml", "false"})
	public void setStrictJsonArraySyntax(boolean strictJsonArraySyntax) {
		this.strictJsonArraySyntax = strictJsonArraySyntax;
	}
	public boolean isStrictJsonArraySyntax() {
		return strictJsonArraySyntax;
	}

	@IbisDoc({"7", "If true, assume that json contains/must contain a root element", "false"})
	public void setJsonWithRootElements(boolean jsonWithRootElements) {
		this.jsonWithRootElements = jsonWithRootElements;
	}
	public boolean isJsonWithRootElements() {
		return jsonWithRootElements;
	}

	@IbisDoc({"8", "If true, and converting from json to xml, parameter substitutions are searched for in optional sub elements too. By default, only mandatory elements are searched for parameter substitutions", "false"})
	public void setDeepSearch(boolean deepSearch) {
		this.deepSearch = deepSearch;
	}
	public boolean isDeepSearch() {
		return deepSearch;
	}

	@IbisDoc({"9", "If true, an exception is thrown when a wildcard is found in the xml schema when parsing an object. This often indicates that an element is not properly typed in the xml schema, and could lead to ambuigities.", "true"})
	public void setFailOnWildcards(boolean failOnWildcards) {
		this.failOnWildcards = failOnWildcards;
	}
	public boolean isFailOnWildcards() {
		return failOnWildcards;
	}

	@IbisDoc({"10", "If true, all xml is allowed to be without namespaces. If no namespaces are detected (by the presence of the string 'xmlns') in the xml string, the root namespace is added to the xml", "false"})
	public void setAcceptNamespaceLessXml(boolean acceptNamespaceLessXml) {
		this.acceptNamespaceLessXml = acceptNamespaceLessXml;
	}
	public boolean isAcceptNamespaceLessXml() {
		return acceptNamespaceLessXml;
	}

	@IbisDoc({"11", "If true, all xml that is generated is without a namespace set", "false"})
	public void setProduceNamespaceLessXml(boolean produceNamespaceLessXml) {
		this.produceNamespaceLessXml = produceNamespaceLessXml;
	}
	public boolean isProduceNamespaceLessXml() {
		return produceNamespaceLessXml;
	}

	@IbisDoc({"12", "If true, and converting to or from json, then the message root is the only rootValidation", "true"})
	public void setValidateJsonToRootElementOnly(boolean validateJsonToRootElementOnly) {
		this.validateJsonToRootElementOnly = validateJsonToRootElementOnly;
	}
	public boolean isValidateJsonToRootElementOnly() {
		return validateJsonToRootElementOnly;
	}


}

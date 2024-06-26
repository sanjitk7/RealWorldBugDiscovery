/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 01 23:49:15 GMT 2024
 */

package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.Reader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NullifyingDeserializer_ESTest extends NullifyingDeserializer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NullifyingDeserializer nullifyingDeserializer0 = new NullifyingDeserializer();
      assertFalse(nullifyingDeserializer0.isCachable());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NullifyingDeserializer nullifyingDeserializer0 = NullifyingDeserializer.instance;
      JsonFactory jsonFactory0 = new JsonFactory();
      PipedWriter pipedWriter0 = new PipedWriter();
      PipedReader pipedReader0 = new PipedReader(pipedWriter0);
      JsonParser jsonParser0 = jsonFactory0.createParser((Reader) pipedReader0);
      ObjectMapper objectMapper0 = new ObjectMapper();
      DeserializationContext deserializationContext0 = objectMapper0.getDeserializationContext();
      Object object0 = nullifyingDeserializer0.deserialize(jsonParser0, deserializationContext0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NullifyingDeserializer nullifyingDeserializer0 = NullifyingDeserializer.instance;
      JsonFactory jsonFactory0 = new JsonFactory();
      PipedWriter pipedWriter0 = new PipedWriter();
      PipedReader pipedReader0 = new PipedReader(pipedWriter0);
      JsonParser jsonParser0 = jsonFactory0.createParser((Reader) pipedReader0);
      ObjectMapper objectMapper0 = new ObjectMapper();
      DeserializationContext deserializationContext0 = objectMapper0.getDeserializationContext();
      Object object0 = nullifyingDeserializer0.deserializeWithType(jsonParser0, deserializationContext0, (TypeDeserializer) null);
      assertNull(object0);
  }
}

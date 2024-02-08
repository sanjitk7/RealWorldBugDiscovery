package org.springframework.security.oauth2.common.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Serialization strategy based on {@link WhitelistedObjectInputStream}.
 */
public class WhitelistedSerializationStrategy implements SerializationStrategy {

	/**
	 * A list of classes which are allowed to deserialize by default.
	 */
	private static final List<String> DEFAULT_ALLOWED_CLASSES;

	static {
		List<String> classes = new ArrayList<String>();
		classes.add("java.lang.");
		classes.add("java.util.");
		classes.add("org.springframework.security.");
		DEFAULT_ALLOWED_CLASSES = Collections.unmodifiableList(classes);
	}

	/**
	 * A list of classes which allowed to deserialize.
	 */
	private final List<String> allowedClasses;

	/**
	 * Initializes {@link WhitelistedSerializationStrategy} with the default allowed classes.
	 */
	public WhitelistedSerializationStrategy() {
		this(DEFAULT_ALLOWED_CLASSES);
	}

	/**
	 * Initializes {@link WhitelistedSerializationStrategy} with specified allowed classes.
	 * 
	 * @param allowedClasses The allowed classes for deserialization.
	 */
	public WhitelistedSerializationStrategy(List<String> allowedClasses) {
		this.allowedClasses = Collections.unmodifiableList(allowedClasses);
	}

	public byte[] serialize(Object state) {
		ObjectOutputStream oos = null;
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream(512);
			oos = new ObjectOutputStream(bos);
			oos.writeObject(state);
			oos.flush();
			return bos.toByteArray();
		}
		catch (IOException e) {
			throw new IllegalArgumentException(e);
		}
		finally {
			if (oos != null) {
				try {
					oos.close();
				}
				catch (IOException e) {
					// eat it
				}
			}
		}
	}

	public <T> T deserialize(byte[] byteArray) {
		ObjectInputStream oip = null;
		try {
			oip = new WhitelistedObjectInputStream(new ByteArrayInputStream(byteArray),
					Thread.currentThread().getContextClassLoader(), allowedClasses);
			@SuppressWarnings("unchecked")
			T result = (T) oip.readObject();
			return result;
		}
		catch (IOException e) {
			throw new IllegalArgumentException(e);
		}
		catch (ClassNotFoundException e) {
			throw new IllegalArgumentException(e);
		}
		finally {
			if (oip != null) {
				try {
					oip.close();
				}
				catch (IOException e) {
					// eat it
				}
			}
		}
	}

}

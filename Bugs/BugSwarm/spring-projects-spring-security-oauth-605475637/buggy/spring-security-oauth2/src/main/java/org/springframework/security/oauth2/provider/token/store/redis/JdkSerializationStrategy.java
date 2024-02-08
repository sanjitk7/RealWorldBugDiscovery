package org.springframework.security.oauth2.provider.token.store.redis;

<<<<<<< HEAD
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;

/**
 * Serializes objects using {@link JdkSerializationRedisSerializer}
=======
import org.springframework.core.serializer.support.SerializationFailedException;

import java.io.Serializable;
import java.util.List;
import org.springframework.security.oauth2.common.util.SerializationStrategy;

/**
 * Serializes and deserializes allowed objects using {@link SerializationStrategy}.
>>>>>>> Allow specifying allowed classes for deserialization
 *
 * @author efenderbosch
 *
 */
public class JdkSerializationStrategy extends StandardStringSerializationStrategy {

<<<<<<< HEAD
	private static final JdkSerializationRedisSerializer OBJECT_SERIALIZER = new JdkSerializationRedisSerializer();

	@Override
	@SuppressWarnings("unchecked")
	protected <T> T deserializeInternal(byte[] bytes, Class<T> clazz) {
		return (T) OBJECT_SERIALIZER.deserialize(bytes);
	}

	@Override
	protected byte[] serializeInternal(Object object) {
		return OBJECT_SERIALIZER.serialize(object);
	}
=======
    private static final byte[] EMPTY_ARRAY = new byte[0];

    /**
     * The SerializationStrategy to be used.
     */
    private final SerializationStrategy serializationStrategy;

    /**
     * The default constructor initializes a {@link JdkSerializationStrategy}
     * with a default {@link SerializationStrategy};
     */
    public JdkSerializationStrategy() {
        this.serializationStrategy = new SerializationStrategy();
    }

    /**
     * Initializes a {@link JdkSerializationStrategy} with a list of allowed classes.
     *
     * @param allowedClasses The allowed classes.
     */
    public JdkSerializationStrategy(List<String> allowedClasses) {
        this.serializationStrategy = new SerializationStrategy(allowedClasses);
    }

    @Override
    @SuppressWarnings("unchecked")
    protected <T> T deserializeInternal(byte[] bytes, Class<T> clazz) {
        if (bytes == null || bytes.length == 0) {
            return null;
        }
        try {
            return (T) serializationStrategy.deserialize(bytes);
        } catch (Exception e) {
            throw new SerializationFailedException("Failed to deserialize payload", e);
        }
    }

    @Override
    protected byte[] serializeInternal(Object object) {
        if (object == null) {
            return EMPTY_ARRAY;
        }
        if (!(object instanceof Serializable)) {
            throw new IllegalArgumentException(this.getClass().getSimpleName()
                + " requires a Serializable payload but received an object of type ["
                + object.getClass().getName() + "]");
        }

        try {
            return serializationStrategy.serialize(object);
        } catch (Exception e) {
            throw new SerializationFailedException("Failed to serialize object", e);
        }
    }
>>>>>>> Allow specifying allowed classes for deserialization

}

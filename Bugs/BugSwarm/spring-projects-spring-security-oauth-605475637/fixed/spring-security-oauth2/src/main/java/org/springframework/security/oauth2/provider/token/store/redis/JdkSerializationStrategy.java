package org.springframework.security.oauth2.provider.token.store.redis;

import org.springframework.core.serializer.support.SerializationFailedException;

import java.io.Serializable;
import org.springframework.security.oauth2.common.util.SerializationStrategy;
import org.springframework.security.oauth2.common.util.WhitelistedSerializationStrategy;

/**
 * Serializes and deserializes allowed objects using {@link WhitelistedSerializationStrategy}.
 *
 * @author efenderbosch
 *
 */
public class JdkSerializationStrategy extends StandardStringSerializationStrategy {

    private static final byte[] EMPTY_ARRAY = new byte[0];

    /**
     * The {@link SerializationStrategy} to be used.
     */
    private SerializationStrategy serializationStrategy;

    /**
     * The default constructor initializes a {@link JdkSerializationStrategy}
     * with {@link WhitelistedSerializationStrategy}.
     */
    public JdkSerializationStrategy() {
        this.serializationStrategy = new WhitelistedSerializationStrategy();
    }

    /**
     * Sets {@link SerializationStrategy}.
     *
     * @param serializationStrategy The serialization strategy.
     */
    public void setSerializationStrategy(SerializationStrategy serializationStrategy) {
        this.serializationStrategy = serializationStrategy;
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

}

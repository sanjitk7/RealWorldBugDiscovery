package org.springframework.security.oauth2.common.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.Collections;
import java.util.List;
import org.springframework.util.ClassUtils;

public interface SerializationStrategy {

  /**
   * Serializes an object.
   *
   * @param object The object to be serialized.
   * @return A byte array.
   */
  byte[] serialize(Object object);

  /**
   * Deserializes an object from a byte array.
   *
   * @param byteArray The byte array.
   * @param <T> The type of the object.
   * @return The deserialized object.
   */
  <T> T deserialize(byte[] byteArray);

  /**
   * Special ObjectInputStream subclass that checks if classes are allowed to deserialize.
   * The class should be configured with a whitelist of only allowed (safe) classes to deserialize.
   *
   * @author Artem Smotrakov
   */
  class WhitelistedObjectInputStream extends ObjectInputStream {

      /**
       * The list of classes which are allowed for deserialization.
       */
      private final List<String> allowedClasses;

      /**
       * The class loader to use for loading local classes.
       */
      private final ClassLoader classLoader;

      /**
       * Create a new WhitelistedObjectInputStream for the given InputStream, class loader and  allowed class names.
       *
       * @param in             The InputStream to read from.
       * @param classLoader    The ClassLoader to use for loading local classes.
       * @param allowedClasses The list of allowed classes for deserialization.
       * @throws IOException
       */
      public WhitelistedObjectInputStream(InputStream in, ClassLoader classLoader, List<String> allowedClasses)
          throws IOException {

          super(in);
          this.classLoader = classLoader;
          this.allowedClasses = Collections.unmodifiableList(allowedClasses);
      }

      /**
       * Create a new WhitelistedObjectInputStream for the given InputStream and allowed class names.
       *
       * @param in             The InputStream to read from.
       * @param allowedClasses The list of allowed classes for deserialization.
       * @see ObjectInputStream#ObjectInputStream(InputStream)
       */
      public WhitelistedObjectInputStream(InputStream in, List<String> allowedClasses) throws IOException {
          this(in, null, allowedClasses);
      }

      /**
       * Resolve the class only if it's allowed to deserialize.
       *
       * @see ObjectInputStream#resolveClass(ObjectStreamClass)
       */
      @Override
      protected Class<?> resolveClass(ObjectStreamClass classDesc) throws IOException, ClassNotFoundException {
          if (isProhibited(classDesc.getName())) {
              throw new NotSerializableException("Not allowed to deserialize " + classDesc.getName());
          }
          if (this.classLoader != null) {
              return ClassUtils.forName(classDesc.getName(), this.classLoader);
          }
          return super.resolveClass(classDesc);
      }

      /**
       * Check if the class is allowed to be deserialized.
       *
       * @param className The class to check
       * @return True if the class is not allowed to be deserialized, false otherwise.
       */
      private boolean isProhibited(String className) {
          for (String allowedClass : this.allowedClasses) {
              if (className.startsWith(allowedClass)) {
                  return false;
              }
          }
          return true;
      }
  }
}

# Bears-Benchmark

### Bug Samples

#### Bears-1
```diff
diff --git a/release-notes/VERSION b/release-notes/VERSION
index c01c4b36c..52168f311 100644
--- a/release-notes/VERSION
+++ b/release-notes/VERSION
@@ -18,6 +18,8 @@ Project: jackson-databind
 #1456: `TypeFactory` type resolution broken in 2.7 for generic types
    when using `constructType` with context
  (reported by Dmitry S)
+#1476: Wrong constructor picked up when deserializing object
+ (reported by laurentgo@github)
 
 2.7.8 (26-Sep-2016)
 
diff --git a/src/main/java/com/fasterxml/jackson/databind/deser/impl/CreatorCollector.java b/src/main/java/com/fasterxml/jackson/databind/deser/impl/CreatorCollector.java
index 8e38f5dec..a530e4b20 100644
--- a/src/main/java/com/fasterxml/jackson/databind/deser/impl/CreatorCollector.java
+++ b/src/main/java/com/fasterxml/jackson/databind/deser/impl/CreatorCollector.java
@@ -162,36 +162,39 @@ public class CreatorCollector
             SettableBeanProperty[] injectables)
     {
         if (creator.getParameterType(0).isCollectionLikeType()) {
-            verifyNonDup(creator, C_ARRAY_DELEGATE, explicit);
-            _arrayDelegateArgs = injectables;
+            if (verifyNonDup(creator, C_ARRAY_DELEGATE, explicit)) {
+                _arrayDelegateArgs = injectables;
+            }
         } else {
-            verifyNonDup(creator, C_DELEGATE, explicit);
-            _delegateArgs = injectables;
+            if (verifyNonDup(creator, C_DELEGATE, explicit)) {
+                _delegateArgs = injectables;
+            }
         }
     }
     
     public void addPropertyCreator(AnnotatedWithParams creator, boolean explicit,
             SettableBeanProperty[] properties)
     {
-        verifyNonDup(creator, C_PROPS, explicit);
-        // Better ensure we have no duplicate names either...
-        if (properties.length > 1) {
-            HashMap<String,Integer> names = new HashMap<String,Integer>();
-            for (int i = 0, len = properties.length; i < len; ++i) {
-                String name = properties[i].getName();
-                /* [Issue-13]: Need to consider Injectables, which may not have
-                 *   a name at all, and need to be skipped
-                 */
-                if (name.length() == 0 && properties[i].getInjectableValueId() != null) {
-                    continue;
-                }
-                Integer old = names.put(name, Integer.valueOf(i));
-                if (old != null) {
-                    throw new IllegalArgumentException("Duplicate creator property \""+name+"\" (index "+old+" vs "+i+")");
+        if (verifyNonDup(creator, C_PROPS, explicit)) {
+            // Better ensure we have no duplicate names either...
+            if (properties.length > 1) {
+                HashMap<String,Integer> names = new HashMap<String,Integer>();
+                for (int i = 0, len = properties.length; i < len; ++i) {
+                    String name = properties[i].getName();
+                    /* [Issue-13]: Need to consider Injectables, which may not have
+                     *   a name at all, and need to be skipped
+                     */
+                    if (name.length() == 0 && properties[i].getInjectableValueId() != null) {
+                        continue;
+                    }
+                    Integer old = names.put(name, Integer.valueOf(i));
+                    if (old != null) {
+                        throw new IllegalArgumentException("Duplicate creator property \""+name+"\" (index "+old+" vs "+i+")");
+                    }
                 }
             }
+            _propertyBasedArgs = properties;
         }
-        _propertyBasedArgs = properties;
     }
 
     public void addIncompeteParameter(AnnotatedParameter parameter) {
@@ -293,7 +296,10 @@ public class CreatorCollector
         return member;
     }
 
-    protected void verifyNonDup(AnnotatedWithParams newOne, int typeIndex, boolean explicit)
+    /**
+     * @return True if specified Creator is to be used
+     */
+    protected boolean verifyNonDup(AnnotatedWithParams newOne, int typeIndex, boolean explicit)
     {
         final int mask = (1 << typeIndex);
         _hasNonDefaultCreator = true;
@@ -301,11 +307,10 @@ public class CreatorCollector
         // already had an explicitly marked one?
         if (oldOne != null) {
             boolean verify;
-
             if ((_explicitCreators & mask) != 0) { // already had explicitly annotated, leave as-is
                 // but skip, if new one not annotated
                 if (!explicit) {
-                    return;
+                    return false;
                 }
                 // both explicit: verify
                 verify = true;
@@ -327,7 +332,7 @@ public class CreatorCollector
                 // otherwise, which one to choose?
                 if (newType.isAssignableFrom(oldType)) {
                     // new type more generic, use old
-                    return;
+                    return false;
                 }
                 // new type more specific, use it
             }
@@ -336,6 +341,7 @@ public class CreatorCollector
             _explicitCreators |= mask;
         }
         _creators[typeIndex] = _fixAccess(newOne);
+        return true;
     }
 
     /*
diff --git a/src/test/java/com/fasterxml/jackson/databind/creators/Creator1476Test.java b/src/test/java/com/fasterxml/jackson/databind/creators/Creator1476Test.java
new file mode 100644
index 000000000..94a1eeef6
--- /dev/null
+++ b/src/test/java/com/fasterxml/jackson/databind/creators/Creator1476Test.java
@@ -0,0 +1,43 @@
+package com.fasterxml.jackson.databind.creators;
+
+import com.fasterxml.jackson.annotation.*;
+
+import com.fasterxml.jackson.databind.*;
+
+public class Creator1476Test extends BaseMapTest
+{
+    static final class SimplePojo {
+        private final int intField;
+        private final String stringField;
+
+        public SimplePojo(@JsonProperty("intField") int intField) {
+          this(intField, "empty");
+        }
+
+        public SimplePojo(@JsonProperty("stringField") String stringField) {
+          this(-1, stringField);
+        }
+
+        @JsonCreator
+        public SimplePojo(@JsonProperty("intField") int intField, @JsonProperty("stringField") String stringField) {
+          this.intField = intField;
+          this.stringField = stringField;
+        }
+
+        public int getIntField() {
+          return intField;
+        }
+
+        public String getStringField() {
+          return stringField;
+        }
+    }
+
+    public void testConstructorChoice() throws Exception {
+        ObjectMapper mapper = new ObjectMapper();
+        SimplePojo pojo = mapper.readValue("{ \"intField\": 1, \"stringField\": \"foo\" }", SimplePojo.class);
+
+        assertEquals(1, pojo.getIntField());
+        assertEquals("foo", pojo.getStringField());
+    }
+}
```

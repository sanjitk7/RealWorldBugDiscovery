# Bears-Benchmark

## Introduction

This project aims to provide a comprehensive dataset of software bugs and their fixes, collected from various open-source projects using the Bears-Benchmark. The Bears-Benchmark, or just Bears, is a benchmark of bugs for automatic program repair studies in Java 8. Bugs are collected from open-source projects hosted on GitHub through a process that scans pairs of builds from Travis Continuous Integration and reproduces bugs (by test failure) and their patches (passing test suite). The dataset contains detailed information about each bug, including unique identifiers, commit hashes, file paths, and repository URLs. Additionally, it includes metadata such as bug types, timestamps, and project names. Researchers and developers can leverage this dataset to analyze common types of bugs, study bug fix patterns, and develop automated bug detection and fixing tools. We strive to maintain the accuracy and integrity of the dataset, and contributions or suggestions for improvement are always welcome. Explore the dataset, conduct your research, and join us in advancing software quality and reliability.

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

#### Bears-2
```diff
diff --git a/release-notes/VERSION b/release-notes/VERSION
index b36d66226..d8049873a 100644
--- a/release-notes/VERSION
+++ b/release-notes/VERSION
@@ -1,4 +1,5 @@
 Project: jackson-databind
+
 ------------------------------------------------------------------------
 === Releases ===
 ------------------------------------------------------------------------
@@ -16,7 +17,6 @@ Project: jackson-databind
 #1456: `TypeFactory` type resolution broken in 2.7 for generic types
    when using `constructType` with context
 #1473: Add explicit deserializer for `StringBuilder` due to Java 9 changes
-#1493: `ACCEPT_CASE_INSENSITIVE_PROPERTIES` fails with `@JsonUnwrapped`
 
 2.8.5 (14-Nov-2016)
 
diff --git a/src/main/java/com/fasterxml/jackson/databind/deser/impl/BeanPropertyMap.java b/src/main/java/com/fasterxml/jackson/databind/deser/impl/BeanPropertyMap.java
index 8031ee0aa..fd30aaf82 100644
--- a/src/main/java/com/fasterxml/jackson/databind/deser/impl/BeanPropertyMap.java
+++ b/src/main/java/com/fasterxml/jackson/databind/deser/impl/BeanPropertyMap.java
@@ -92,7 +92,7 @@ public class BeanPropertyMap
     protected void init(Collection<SettableBeanProperty> props)
     {
         _size = props.size();
-
+        
         // First: calculate size of primary hash area
         final int hashSize = findSize(_size);
         _hashMask = hashSize-1;
@@ -423,8 +423,7 @@ System.err.println("And new propr #"+slot+" '"+key+"'");
      * Specialized method for removing specified existing entry.
      * NOTE: entry MUST exist, otherwise an exception is thrown.
      */
-    public void remove(SettableBeanProperty propToRm)
-    {
+    public void remove(SettableBeanProperty propToRm) {
         ArrayList<SettableBeanProperty> props = new ArrayList<SettableBeanProperty>(_size);
         String key = getPropertyName(propToRm);
         boolean found = false;
@@ -435,9 +434,7 @@ System.err.println("And new propr #"+slot+" '"+key+"'");
                 continue;
             }
             if (!found) {
-                // 09-Jan-2017, tatu: Important: must check name slot and NOT property name,
-                //   as only former is lower-case in case-insensitive case
-                found = key.equals(_hashArea[i-1]);
+                found = key.equals(prop.getName());
                 if (found) {
                     // need to leave a hole here
                     _propsInOrder[_findFromOrdered(prop)] = null;
diff --git a/src/test/java/com/fasterxml/jackson/databind/struct/TestUnwrapped.java b/src/test/java/com/fasterxml/jackson/databind/struct/TestUnwrapped.java
index dd373f6b9..59ac4e08f 100644
--- a/src/test/java/com/fasterxml/jackson/databind/struct/TestUnwrapped.java
+++ b/src/test/java/com/fasterxml/jackson/databind/struct/TestUnwrapped.java
@@ -97,20 +97,6 @@ public class TestUnwrapped extends BaseMapTest
         private Inner inner;
     }
 
-    // [databind#1493]: case-insensitive handling
-    static class Person {
-        @JsonUnwrapped(prefix = "businessAddress.")
-        public Address businessAddress;
-    }
-
-    static class Address {
-        public String street;
-        public String addon;
-        public String zip;
-        public String town;    
-        public String country;
-    }
-
     /*
     /**********************************************************
     /* Tests, serialization
@@ -206,13 +192,45 @@ public class TestUnwrapped extends BaseMapTest
         assertTrue(actual.contains("Zebra"));
         assertFalse(actual.contains("inner"));
     }
+    
+    // 22-Apr-2013, tatu: Commented out as it can't be simply fixed; requires implementing
+    //    deep-update/merge. But leaving here to help with that effort, if/when it proceeds.
 
-    // [databind#1493]: case-insensitive handling
-    public void testCaseInsensitiveUnwrap() throws Exception
-    {
-        ObjectMapper mapper = new ObjectMapper();
-        mapper.enable(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
-        Person p = mapper.readValue("{ }", Person.class);
-        assertNotNull(p);
+    /*
+    // [databind#211]: Actually just variant of #160
+
+    static class Issue211Bean {
+        public String test1;
+
+        public String test2;
+        @JsonUnwrapped
+        public Issue211Unwrapped unwrapped;
     }
+
+    static class Issue211Unwrapped {
+        public String test3;
+        public String test4;
+    }
+
+    public void testIssue211() throws Exception
+    {
+         Issue211Bean bean = new Issue211Bean();
+         bean.test1 = "Field 1";
+         bean.test2 = "Field 2";
+         Issue211Unwrapped tJackson2 = new Issue211Unwrapped();
+         tJackson2.test3 = "Field 3";
+         tJackson2.test4 = "Field 4";
+         bean.unwrapped = tJackson2;
+ 
+         final String JSON = "{\"test1\": \"Field 1 merged\", \"test3\": \"Field 3 merged\"}";
+         ObjectMapper o = new ObjectMapper();
+         Issue211Bean result = o.readerForUpdating(bean).withType(Issue211Bean.class).readValue(JSON);
+         assertSame(bean, result);
+         assertEquals("Field 1 merged", result.test1);
+         assertEquals("Field 2", result.test2);
+         assertNotNull(result.unwrapped);
+         assertEquals("Field 3 merged", result.unwrapped.test3);
+         assertEquals("Field 4", result.unwrapped.test4);
+    }
+    */
 }

```

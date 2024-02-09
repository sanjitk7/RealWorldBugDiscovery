# ManySStuBs4J

## Introduction

ManySStubs4j is a mined corpus of bugs from 100 Java Maven projects and 1000 Java projects. It contains a total of ~170,000 bug fixes, some of which that fall under any of the 16 commonly found categories have been classified as Simple Stupid Bugs (SStuBs). These bug-fixing changes were collected using the SZZ heuristic, and filtered to obtain the simple bugs. These bugs are all stored into JSON files bugs.json (100 Java Maven Projects - 25000 bugs) and bugsLarge.json (1000 Java Projects - 153,000 bugs). The SStuBs idenetified from these files are stored in sstubs.json (100 Java Maven Projects - 10000 SStuBs) and sstubsLarge.json (1000 Java Maven Projects - 63000 SStuBs).

The JSON files contain fields like 'fixCommitSHA1', 'fixCommitParentSHA1', 'bugFilePath' and 'projectName', which we use to clone the project repositories, checkout to the buggy and fixed versions to extract the buggy and fixed files, and create their diff file.

This subdirectory contains buggy, fixed and diff files for 5 of the bugs. The rest of files for all bugs have been zipped and uploaded to google drive (Illinois sign-in required): https://drive.google.com/file/d/1baUnX7gRNt7qfNY2-ClI4BP3QOkeQ6BV/view?usp=share_link

## Number of bugs

| File             | Bug Count                                          |
|------------------|----------------------------------------------------|
| bugs.json        | 25000 (Includes all bugs from sstubs.json)         | 
| bugsLarge.json   | 153,000 (Includes all bugs from sstubsLarge.json)  | 
| sstubs.json      | 10000                                              | 
| sstubsLarge.json | 63000                                              |

## Tests per bug

Since the number of projects is too high, it was not possible to automate building every project and getting the number of tests run per bug for all of them with our environment. The script was able to clone repositories, however, the builds failed due maven conflicts with the working environment.

## Bug Samples

### sstubs_0
```diff --git a/modules/activiti-secure-service-tasks/src/test/java/org/activiti/test/serviceTask/secure/SecureShellTaskTest.java b/modules/activiti-secure-service-tasks/src/test/java/org/activiti/test/serviceTask/secure/SecureShellTaskTest.java
index e288baedee..a5fa9b4bf5 100644
--- a/modules/activiti-secure-service-tasks/src/test/java/org/activiti/test/serviceTask/secure/SecureShellTaskTest.java
+++ b/modules/activiti-secure-service-tasks/src/test/java/org/activiti/test/serviceTask/secure/SecureShellTaskTest.java
@@ -38,7 +38,7 @@ public class SecureShellTaskTest extends SecureServiceTaskBaseTest {
         }
 
         try {
-            runtimeService.startProcessInstanceByKey("shellCommandStart");
+            runtimeService.startProcessInstanceByKey("shellCommandEcho");
             Assert.fail(); // Expecting exception
         } catch (Exception e) {
             e.printStackTrace();
```


### sstubs_1
``` diff --git a/modules/activiti-form-engine/src/main/java/org/activiti/form/engine/impl/cmd/GetRuntimeFormDefinitionCmd.java b/modules/activiti-form-engine/src/main/java/org/activiti/form/engine/impl/cmd/GetRuntimeFormDefinitionCmd.java
index a71cd4c178..93a8693636 100644
--- a/modules/activiti-form-engine/src/main/java/org/activiti/form/engine/impl/cmd/GetRuntimeFormDefinitionCmd.java
+++ b/modules/activiti-form-engine/src/main/java/org/activiti/form/engine/impl/cmd/GetRuntimeFormDefinitionCmd.java
@@ -181,7 +181,7 @@ public class GetRuntimeFormDefinitionCmd implements Command<FormDefinition>, Ser
       for (SubmittedForm otherForm : submittedForms) {
         try {
           JsonNode submittedNode = formEngineConfiguration.getObjectMapper().readTree(otherForm.getFormValueBytes());
-          if (submittedNode == null || submittedNode.get("values") != null) {
+          if (submittedNode == null || submittedNode.get("values") == null) {
             continue;
           }
          
@@ -221,7 +221,7 @@ public class GetRuntimeFormDefinitionCmd implements Command<FormDefinition>, Ser
         try {
           if (StringUtils.isNotEmpty(fieldValue)) {
             LocalDate dateValue = LocalDate.parse(fieldValue);
-            variables.put(field.getId(), dateValue);
+            variables.put(field.getId(), dateValue.toString("yyyy-M-d"));
           }
         } catch (Exception e) {
           logger.error("Error parsing form date value for process instance " + processInstanceId + " with value " + fieldValue, e);
```


### sstubs_2
``` diff --git a/modules/activiti-form-engine/src/main/java/org/activiti/form/engine/impl/cmd/GetRuntimeFormDefinitionCmd.java b/modules/activiti-form-engine/src/main/java/org/activiti/form/engine/impl/cmd/GetRuntimeFormDefinitionCmd.java
index a71cd4c178..93a8693636 100644
--- a/modules/activiti-form-engine/src/main/java/org/activiti/form/engine/impl/cmd/GetRuntimeFormDefinitionCmd.java
+++ b/modules/activiti-form-engine/src/main/java/org/activiti/form/engine/impl/cmd/GetRuntimeFormDefinitionCmd.java
@@ -181,7 +181,7 @@ public class GetRuntimeFormDefinitionCmd implements Command<FormDefinition>, Ser
       for (SubmittedForm otherForm : submittedForms) {
         try {
           JsonNode submittedNode = formEngineConfiguration.getObjectMapper().readTree(otherForm.getFormValueBytes());
-          if (submittedNode == null || submittedNode.get("values") != null) {
+          if (submittedNode == null || submittedNode.get("values") == null) {
             continue;
           }
          
@@ -221,7 +221,7 @@ public class GetRuntimeFormDefinitionCmd implements Command<FormDefinition>, Ser
         try {
           if (StringUtils.isNotEmpty(fieldValue)) {
             LocalDate dateValue = LocalDate.parse(fieldValue);
-            variables.put(field.getId(), dateValue);
+            variables.put(field.getId(), dateValue.toString("yyyy-M-d"));
           }
         } catch (Exception e) {
           logger.error("Error parsing form date value for process instance " + processInstanceId + " with value " + fieldValue, e);
```


### sstubs_3
``` diff --git a/modules/activiti-secure-service-tasks/src/test/java/org/activiti/test/serviceTask/secure/SecureServiceTaskBaseTest.java b/modules/activiti-secure-service-tasks/src/test/java/org/activiti/test/serviceTask/secure/SecureServiceTaskBaseTest.java
index 0531c3e0c3..e515670bed 100644
--- a/modules/activiti-secure-service-tasks/src/test/java/org/activiti/test/serviceTask/secure/SecureServiceTaskBaseTest.java
+++ b/modules/activiti-secure-service-tasks/src/test/java/org/activiti/test/serviceTask/secure/SecureServiceTaskBaseTest.java
@@ -28,7 +28,7 @@ public abstract class SecureServiceTaskBaseTest extends ServiceTaskBaseTest {
     @Override
     protected List<ProcessEngineConfigurator> getConfigurators() {
         ProcessEngineConfigurator configurator = new SecureServiceTaskConfigurator()
-                .setWhiteListedShellCommands(new HashSet<String>(Arrays.asList("ls", "pwd")));
+                .setWhiteListedShellCommands(new HashSet<String>(Arrays.asList("cmd","ls", "pwd")));
 
         return Arrays.asList(configurator);
     }
```


### sstubs_4
``` diff --git a/modules/activiti-secure-service-tasks/src/test/java/org/activiti/test/serviceTask/secure/SecureShellTaskTest.java b/modules/activiti-secure-service-tasks/src/test/java/org/activiti/test/serviceTask/secure/SecureShellTaskTest.java
index 7061345a98..e288baedee 100644
--- a/modules/activiti-secure-service-tasks/src/test/java/org/activiti/test/serviceTask/secure/SecureShellTaskTest.java
+++ b/modules/activiti-secure-service-tasks/src/test/java/org/activiti/test/serviceTask/secure/SecureShellTaskTest.java
@@ -28,7 +28,7 @@ public class SecureShellTaskTest extends SecureServiceTaskBaseTest {
     @Test
     public void testClassWhiteListingNotAllowed() {
         if (osType == OsType.WINDOWS) {
-            deployProcessDefinition("ShellTaskTest.testEchoShellWindows.bpmn20.xml");
+            deployProcessDefinition("ShellTaskTest.testShellWindows.bpmn20.xml");
         } else if (osType == OsType.LINUX) {
             deployProcessDefinition("ShellTaskTest.testEchoShellLinux.bpmn20.xml");
         } else if (osType == OsType.MAC) {
@@ -38,7 +38,7 @@ public class SecureShellTaskTest extends SecureServiceTaskBaseTest {
         }
 
         try {
-            runtimeService.startProcessInstanceByKey("shellCommandEcho");
+            runtimeService.startProcessInstanceByKey("shellCommandStart");
             Assert.fail(); // Expecting exception
         } catch (Exception e) {
             e.printStackTrace();
```


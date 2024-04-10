package org.apache.commons.cli;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray4 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine6 = posixParser0.parse(options3, strArray4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.util.Properties properties11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = posixParser0.parse(options3, strArray10, properties11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        org.apache.commons.cli.Options options3 = posixParser0.getOptions();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = posixParser0.parse(options4, strArray11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(options3);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray6 = posixParser0.flatten(options3, strArray4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        java.util.ListIterator listIterator21 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processOption("", listIterator21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        org.apache.commons.cli.PosixParser posixParser3 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean9 = option8.hasOptionalArg();
        int int10 = option8.getArgs();
        boolean boolean11 = option8.hasOptionalArg();
        org.apache.commons.cli.Options options12 = options4.addOption(option8);
        java.util.Collection collection13 = options4.getOptionGroups();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties21 = null;
        org.apache.commons.cli.CommandLine commandLine22 = posixParser3.parse(options4, strArray20, properties21);
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option28 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean29 = option28.hasOptionalArg();
        int int30 = option28.getArgs();
        boolean boolean31 = option28.hasOptionalArg();
        org.apache.commons.cli.Options options32 = options24.addOption(option28);
        java.util.Collection collection33 = options24.getOptionGroups();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties41 = null;
        org.apache.commons.cli.CommandLine commandLine42 = posixParser23.parse(options24, strArray40, properties41);
        java.lang.String[] strArray44 = posixParser0.flatten(options4, strArray40, true);
        org.apache.commons.cli.OptionGroup optionGroup45 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options46 = options4.addOptionGroup(optionGroup45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(strArray44);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        java.lang.String[] strArray44 = commandLine42.getOptionValues('a');
        java.lang.Object obj46 = commandLine42.getOptionObject("");
        java.util.Iterator iterator47 = commandLine42.iterator();
        java.lang.String str50 = commandLine42.getOptionValue('\000', "org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str50, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        org.apache.commons.cli.PosixParser posixParser3 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean9 = option8.hasOptionalArg();
        int int10 = option8.getArgs();
        boolean boolean11 = option8.hasOptionalArg();
        org.apache.commons.cli.Options options12 = options4.addOption(option8);
        java.util.Collection collection13 = options4.getOptionGroups();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties21 = null;
        org.apache.commons.cli.CommandLine commandLine22 = posixParser3.parse(options4, strArray20, properties21);
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option28 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean29 = option28.hasOptionalArg();
        int int30 = option28.getArgs();
        boolean boolean31 = option28.hasOptionalArg();
        org.apache.commons.cli.Options options32 = options24.addOption(option28);
        java.util.Collection collection33 = options24.getOptionGroups();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties41 = null;
        org.apache.commons.cli.CommandLine commandLine42 = posixParser23.parse(options24, strArray40, properties41);
        java.lang.String[] strArray44 = posixParser0.flatten(options4, strArray40, true);
        org.apache.commons.cli.Option option48 = new org.apache.commons.cli.Option("", true, "hi!");
        java.lang.String str49 = option48.getKey();
        option48.setRequired(true);
        option48.setLongOpt("");
        boolean boolean54 = option48.hasOptionalArg();
        org.apache.commons.cli.OptionGroup optionGroup55 = options4.getOptionGroup(option48);
        boolean boolean56 = option48.hasArgName();
        option48.setValueSeparator('#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(optionGroup55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        java.lang.Class<?> wildcardClass43 = posixParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        org.apache.commons.cli.PosixParser posixParser3 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean9 = option8.hasOptionalArg();
        int int10 = option8.getArgs();
        boolean boolean11 = option8.hasOptionalArg();
        org.apache.commons.cli.Options options12 = options4.addOption(option8);
        java.util.Collection collection13 = options4.getOptionGroups();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties21 = null;
        org.apache.commons.cli.CommandLine commandLine22 = posixParser3.parse(options4, strArray20, properties21);
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option28 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean29 = option28.hasOptionalArg();
        int int30 = option28.getArgs();
        boolean boolean31 = option28.hasOptionalArg();
        org.apache.commons.cli.Options options32 = options24.addOption(option28);
        java.util.Collection collection33 = options24.getOptionGroups();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties41 = null;
        org.apache.commons.cli.CommandLine commandLine42 = posixParser23.parse(options24, strArray40, properties41);
        java.lang.String[] strArray44 = posixParser0.flatten(options4, strArray40, true);
        java.util.ListIterator listIterator46 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processOption("org.apache.commons.cli.ParseException: ", listIterator46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(strArray44);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.CommandLine commandLine20 = posixParser0.cmd;
        java.util.ListIterator listIterator22 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processOption("org.apache.commons.cli.ParseException: ", listIterator22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.UnrecognizedOptionException; message: Unrecognized option: org.apache.commons.cli.ParseException: ");
        } catch (org.apache.commons.cli.UnrecognizedOptionException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine20);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        org.apache.commons.cli.Option[] optionArray43 = commandLine42.getOptions();
        java.util.Iterator iterator44 = commandLine42.iterator();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(optionArray43);
        org.junit.Assert.assertNotNull(iterator44);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        java.util.ListIterator listIterator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processOption("[ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]", listIterator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        org.apache.commons.cli.Option option11 = options1.getOption("");
        java.lang.String[] strArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray14 = posixParser0.flatten(options1, strArray12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(option11);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        org.apache.commons.cli.Option option43 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options44 = options20.addOption(option43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        commandLine42.addArg("");
        java.lang.String str46 = commandLine42.getOptionValue("org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        java.lang.String[] strArray44 = commandLine42.getOptionValues('a');
        java.lang.Object obj46 = commandLine42.getOptionObject("");
        java.lang.String str49 = commandLine42.getOptionValue('4', "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        org.apache.commons.cli.PosixParser posixParser3 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean9 = option8.hasOptionalArg();
        int int10 = option8.getArgs();
        boolean boolean11 = option8.hasOptionalArg();
        org.apache.commons.cli.Options options12 = options4.addOption(option8);
        java.util.Collection collection13 = options4.getOptionGroups();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties21 = null;
        org.apache.commons.cli.CommandLine commandLine22 = posixParser3.parse(options4, strArray20, properties21);
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option28 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean29 = option28.hasOptionalArg();
        int int30 = option28.getArgs();
        boolean boolean31 = option28.hasOptionalArg();
        org.apache.commons.cli.Options options32 = options24.addOption(option28);
        java.util.Collection collection33 = options24.getOptionGroups();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties41 = null;
        org.apache.commons.cli.CommandLine commandLine42 = posixParser23.parse(options24, strArray40, properties41);
        java.lang.String[] strArray44 = posixParser0.flatten(options4, strArray40, true);
        org.apache.commons.cli.PosixParser posixParser45 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options46 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option50 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean51 = option50.hasOptionalArg();
        int int52 = option50.getArgs();
        boolean boolean53 = option50.hasOptionalArg();
        org.apache.commons.cli.Options options54 = options46.addOption(option50);
        java.util.Collection collection55 = options46.getOptionGroups();
        java.lang.String[] strArray62 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties63 = null;
        org.apache.commons.cli.CommandLine commandLine64 = posixParser45.parse(options46, strArray62, properties63);
        org.apache.commons.cli.PosixParser posixParser65 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options66 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option70 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean71 = option70.hasOptionalArg();
        int int72 = option70.getArgs();
        boolean boolean73 = option70.hasOptionalArg();
        org.apache.commons.cli.Options options74 = options66.addOption(option70);
        java.util.Collection collection75 = options66.getOptionGroups();
        java.lang.String[] strArray82 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties83 = null;
        org.apache.commons.cli.CommandLine commandLine84 = posixParser65.parse(options66, strArray82, properties83);
        org.apache.commons.cli.CommandLine commandLine86 = posixParser0.parse(options46, strArray82, false);
        org.apache.commons.cli.CommandLine commandLine87 = posixParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine88 = posixParser0.cmd;
        posixParser0.burstToken("hi!", false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(options54);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(commandLine64);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(options74);
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(commandLine84);
        org.junit.Assert.assertNotNull(commandLine86);
        org.junit.Assert.assertNotNull(commandLine87);
        org.junit.Assert.assertNotNull(commandLine88);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        org.apache.commons.cli.PosixParser posixParser3 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean9 = option8.hasOptionalArg();
        int int10 = option8.getArgs();
        boolean boolean11 = option8.hasOptionalArg();
        org.apache.commons.cli.Options options12 = options4.addOption(option8);
        java.util.Collection collection13 = options4.getOptionGroups();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties21 = null;
        org.apache.commons.cli.CommandLine commandLine22 = posixParser3.parse(options4, strArray20, properties21);
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option28 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean29 = option28.hasOptionalArg();
        int int30 = option28.getArgs();
        boolean boolean31 = option28.hasOptionalArg();
        org.apache.commons.cli.Options options32 = options24.addOption(option28);
        java.util.Collection collection33 = options24.getOptionGroups();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties41 = null;
        org.apache.commons.cli.CommandLine commandLine42 = posixParser23.parse(options24, strArray40, properties41);
        java.lang.String[] strArray44 = posixParser0.flatten(options4, strArray40, true);
        org.apache.commons.cli.PosixParser posixParser45 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options46 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option50 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean51 = option50.hasOptionalArg();
        int int52 = option50.getArgs();
        boolean boolean53 = option50.hasOptionalArg();
        org.apache.commons.cli.Options options54 = options46.addOption(option50);
        java.util.Collection collection55 = options46.getOptionGroups();
        java.lang.String[] strArray62 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties63 = null;
        org.apache.commons.cli.CommandLine commandLine64 = posixParser45.parse(options46, strArray62, properties63);
        org.apache.commons.cli.PosixParser posixParser65 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options66 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option70 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean71 = option70.hasOptionalArg();
        int int72 = option70.getArgs();
        boolean boolean73 = option70.hasOptionalArg();
        org.apache.commons.cli.Options options74 = options66.addOption(option70);
        java.util.Collection collection75 = options66.getOptionGroups();
        java.lang.String[] strArray82 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties83 = null;
        org.apache.commons.cli.CommandLine commandLine84 = posixParser65.parse(options66, strArray82, properties83);
        org.apache.commons.cli.CommandLine commandLine86 = posixParser0.parse(options46, strArray82, false);
        org.apache.commons.cli.CommandLine commandLine87 = posixParser0.cmd;
        java.lang.String str89 = commandLine87.getOptionValue('\000');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(options54);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(commandLine64);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(options74);
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(commandLine84);
        org.junit.Assert.assertNotNull(commandLine86);
        org.junit.Assert.assertNotNull(commandLine87);
        org.junit.Assert.assertNull(str89);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        org.apache.commons.cli.PosixParser posixParser3 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean9 = option8.hasOptionalArg();
        int int10 = option8.getArgs();
        boolean boolean11 = option8.hasOptionalArg();
        org.apache.commons.cli.Options options12 = options4.addOption(option8);
        java.util.Collection collection13 = options4.getOptionGroups();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties21 = null;
        org.apache.commons.cli.CommandLine commandLine22 = posixParser3.parse(options4, strArray20, properties21);
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option28 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean29 = option28.hasOptionalArg();
        int int30 = option28.getArgs();
        boolean boolean31 = option28.hasOptionalArg();
        org.apache.commons.cli.Options options32 = options24.addOption(option28);
        java.util.Collection collection33 = options24.getOptionGroups();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties41 = null;
        org.apache.commons.cli.CommandLine commandLine42 = posixParser23.parse(options24, strArray40, properties41);
        java.lang.String[] strArray44 = posixParser0.flatten(options4, strArray40, true);
        org.apache.commons.cli.PosixParser posixParser45 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options46 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option50 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean51 = option50.hasOptionalArg();
        int int52 = option50.getArgs();
        boolean boolean53 = option50.hasOptionalArg();
        org.apache.commons.cli.Options options54 = options46.addOption(option50);
        java.util.Collection collection55 = options46.getOptionGroups();
        java.lang.String[] strArray62 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties63 = null;
        org.apache.commons.cli.CommandLine commandLine64 = posixParser45.parse(options46, strArray62, properties63);
        org.apache.commons.cli.PosixParser posixParser65 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options66 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option70 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean71 = option70.hasOptionalArg();
        int int72 = option70.getArgs();
        boolean boolean73 = option70.hasOptionalArg();
        org.apache.commons.cli.Options options74 = options66.addOption(option70);
        java.util.Collection collection75 = options66.getOptionGroups();
        java.lang.String[] strArray82 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties83 = null;
        org.apache.commons.cli.CommandLine commandLine84 = posixParser65.parse(options66, strArray82, properties83);
        org.apache.commons.cli.CommandLine commandLine86 = posixParser0.parse(options46, strArray82, false);
        boolean boolean88 = commandLine86.hasOption("hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(options54);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(commandLine64);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(options74);
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(commandLine84);
        org.junit.Assert.assertNotNull(commandLine86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        commandLine42.addArg("");
        java.lang.String str47 = commandLine42.getOptionValue("hi!", "hi!");
        java.lang.String[] strArray48 = commandLine42.getArgs();
        java.lang.String str50 = commandLine42.getOptionValue('4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.CommandLine commandLine20 = posixParser0.cmd;
        org.apache.commons.cli.Option[] optionArray21 = commandLine20.getOptions();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine20);
        org.junit.Assert.assertNotNull(optionArray21);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        java.lang.String[] strArray44 = commandLine42.getOptionValues('a');
        java.lang.Object obj46 = commandLine42.getOptionObject("");
        java.util.Iterator iterator47 = commandLine42.iterator();
        org.apache.commons.cli.Option option51 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean52 = option51.hasOptionalArg();
        org.apache.commons.cli.MissingArgumentException missingArgumentException53 = new org.apache.commons.cli.MissingArgumentException(option51);
        commandLine42.addOption(option51);
        // The following exception was thrown during execution in test generation
        try {
            int int55 = option51.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.burstToken("org.apache.commons.cli.UnrecognizedOptionException: [ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.OptionGroup optionGroup20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options21 = options1.addOptionGroup(optionGroup20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        org.apache.commons.cli.PosixParser posixParser3 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean9 = option8.hasOptionalArg();
        int int10 = option8.getArgs();
        boolean boolean11 = option8.hasOptionalArg();
        org.apache.commons.cli.Options options12 = options4.addOption(option8);
        java.util.Collection collection13 = options4.getOptionGroups();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties21 = null;
        org.apache.commons.cli.CommandLine commandLine22 = posixParser3.parse(options4, strArray20, properties21);
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option28 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean29 = option28.hasOptionalArg();
        int int30 = option28.getArgs();
        boolean boolean31 = option28.hasOptionalArg();
        org.apache.commons.cli.Options options32 = options24.addOption(option28);
        java.util.Collection collection33 = options24.getOptionGroups();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties41 = null;
        org.apache.commons.cli.CommandLine commandLine42 = posixParser23.parse(options24, strArray40, properties41);
        java.lang.String[] strArray44 = posixParser0.flatten(options4, strArray40, true);
        org.apache.commons.cli.PosixParser posixParser45 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options46 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option50 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean51 = option50.hasOptionalArg();
        int int52 = option50.getArgs();
        boolean boolean53 = option50.hasOptionalArg();
        org.apache.commons.cli.Options options54 = options46.addOption(option50);
        java.util.Collection collection55 = options46.getOptionGroups();
        java.lang.String[] strArray62 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties63 = null;
        org.apache.commons.cli.CommandLine commandLine64 = posixParser45.parse(options46, strArray62, properties63);
        org.apache.commons.cli.PosixParser posixParser65 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options66 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option70 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean71 = option70.hasOptionalArg();
        int int72 = option70.getArgs();
        boolean boolean73 = option70.hasOptionalArg();
        org.apache.commons.cli.Options options74 = options66.addOption(option70);
        java.util.Collection collection75 = options66.getOptionGroups();
        java.lang.String[] strArray82 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties83 = null;
        org.apache.commons.cli.CommandLine commandLine84 = posixParser65.parse(options66, strArray82, properties83);
        org.apache.commons.cli.CommandLine commandLine86 = posixParser0.parse(options46, strArray82, false);
        org.apache.commons.cli.CommandLine commandLine87 = posixParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine88 = posixParser0.cmd;
        posixParser0.checkRequiredOptions();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(options54);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(commandLine64);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(options74);
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(commandLine84);
        org.junit.Assert.assertNotNull(commandLine86);
        org.junit.Assert.assertNotNull(commandLine87);
        org.junit.Assert.assertNotNull(commandLine88);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options47 = options20.addOption("org.apache.commons.cli.UnrecognizedOptionException: [ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]", "org.apache.commons.cli.ParseException: ", false, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: opt contains illegal character value '.'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        java.util.List list3 = posixParser0.getRequiredOptions();
        org.apache.commons.cli.PosixParser posixParser4 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options5 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option9 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean10 = option9.hasOptionalArg();
        int int11 = option9.getArgs();
        boolean boolean12 = option9.hasOptionalArg();
        org.apache.commons.cli.Options options13 = options5.addOption(option9);
        java.util.Collection collection14 = options5.getOptionGroups();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties22 = null;
        org.apache.commons.cli.CommandLine commandLine23 = posixParser4.parse(options5, strArray21, properties22);
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser25 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options26 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option30 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean31 = option30.hasOptionalArg();
        int int32 = option30.getArgs();
        boolean boolean33 = option30.hasOptionalArg();
        org.apache.commons.cli.Options options34 = options26.addOption(option30);
        java.util.Collection collection35 = options26.getOptionGroups();
        java.lang.String[] strArray42 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties43 = null;
        org.apache.commons.cli.CommandLine commandLine44 = posixParser25.parse(options26, strArray42, properties43);
        org.apache.commons.cli.CommandLine commandLine46 = posixParser4.parse(options24, strArray42, false);
        commandLine46.addArg("");
        java.lang.String str51 = commandLine46.getOptionValue("hi!", "hi!");
        java.lang.String[] strArray52 = commandLine46.getArgs();
        posixParser0.cmd = commandLine46;
        org.junit.Assert.assertNull(list3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(commandLine23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(options34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(commandLine44);
        org.junit.Assert.assertNotNull(commandLine46);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(strArray52);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        org.apache.commons.cli.PosixParser posixParser3 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean9 = option8.hasOptionalArg();
        int int10 = option8.getArgs();
        boolean boolean11 = option8.hasOptionalArg();
        org.apache.commons.cli.Options options12 = options4.addOption(option8);
        java.util.Collection collection13 = options4.getOptionGroups();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties21 = null;
        org.apache.commons.cli.CommandLine commandLine22 = posixParser3.parse(options4, strArray20, properties21);
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option28 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean29 = option28.hasOptionalArg();
        int int30 = option28.getArgs();
        boolean boolean31 = option28.hasOptionalArg();
        org.apache.commons.cli.Options options32 = options24.addOption(option28);
        java.util.Collection collection33 = options24.getOptionGroups();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties41 = null;
        org.apache.commons.cli.CommandLine commandLine42 = posixParser23.parse(options24, strArray40, properties41);
        java.lang.String[] strArray44 = posixParser0.flatten(options4, strArray40, true);
        java.lang.Class<?> wildcardClass45 = options4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.ListIterator listIterator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processOption("", listIterator2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        org.apache.commons.cli.CommandLine commandLine43 = posixParser0.cmd;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(commandLine43);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        java.lang.String[] strArray44 = commandLine42.getOptionValues('a');
        java.lang.String str47 = commandLine42.getOptionValue('a', "");
        commandLine42.addArg("hi!");
        java.util.Iterator iterator50 = commandLine42.iterator();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(iterator50);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.PosixParser posixParser20 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options21 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option25 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean26 = option25.hasOptionalArg();
        int int27 = option25.getArgs();
        boolean boolean28 = option25.hasOptionalArg();
        org.apache.commons.cli.Options options29 = options21.addOption(option25);
        java.util.Collection collection30 = options21.getOptionGroups();
        java.lang.String[] strArray37 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties38 = null;
        org.apache.commons.cli.CommandLine commandLine39 = posixParser20.parse(options21, strArray37, properties38);
        org.apache.commons.cli.Options options40 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options42 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option46 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean47 = option46.hasOptionalArg();
        int int48 = option46.getArgs();
        boolean boolean49 = option46.hasOptionalArg();
        org.apache.commons.cli.Options options50 = options42.addOption(option46);
        java.util.Collection collection51 = options42.getOptionGroups();
        java.lang.String[] strArray58 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties59 = null;
        org.apache.commons.cli.CommandLine commandLine60 = posixParser41.parse(options42, strArray58, properties59);
        org.apache.commons.cli.CommandLine commandLine62 = posixParser20.parse(options40, strArray58, false);
        posixParser0.setOptions(options40);
        org.apache.commons.cli.Options options64 = posixParser0.getOptions();
        org.apache.commons.cli.Options options65 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option69 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean70 = option69.hasOptionalArg();
        int int71 = option69.getArgs();
        boolean boolean72 = option69.hasOptionalArg();
        org.apache.commons.cli.Options options73 = options65.addOption(option69);
        posixParser0.setOptions(options73);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(commandLine39);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(options50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(commandLine60);
        org.junit.Assert.assertNotNull(commandLine62);
        org.junit.Assert.assertNotNull(options64);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(options73);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        java.util.Properties properties44 = commandLine42.getOptionProperties("org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(properties44);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        commandLine42.addArg("");
        java.util.Properties properties46 = commandLine42.getOptionProperties("");
        org.apache.commons.cli.Option[] optionArray47 = commandLine42.getOptions();
        java.lang.String str50 = commandLine42.getOptionValue('#', "org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertNotNull(optionArray47);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str50, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        commandLine42.addArg("");
        java.lang.String str47 = commandLine42.getOptionValue("hi!", "hi!");
        org.apache.commons.cli.Option[] optionArray48 = commandLine42.getOptions();
        java.util.Iterator iterator49 = commandLine42.iterator();
        org.apache.commons.cli.Option[] optionArray50 = commandLine42.getOptions();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(optionArray48);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertNotNull(optionArray50);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.CommandLine commandLine20 = posixParser0.cmd;
        java.util.Properties properties22 = commandLine20.getOptionProperties("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine20);
        org.junit.Assert.assertNotNull(properties22);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean5 = option4.hasOptionalArg();
        int int6 = option4.getArgs();
        boolean boolean7 = option4.hasOptionalArg();
        org.apache.commons.cli.Options options8 = options0.addOption(option4);
        org.apache.commons.cli.Option option10 = options8.getOption("");
        java.util.Collection collection11 = options8.getOptions();
        org.apache.commons.cli.PosixParser posixParser12 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties13 = null;
        posixParser12.processProperties(properties13);
        org.apache.commons.cli.PosixParser posixParser15 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option20 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean21 = option20.hasOptionalArg();
        int int22 = option20.getArgs();
        boolean boolean23 = option20.hasOptionalArg();
        org.apache.commons.cli.Options options24 = options16.addOption(option20);
        java.util.Collection collection25 = options16.getOptionGroups();
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties33 = null;
        org.apache.commons.cli.CommandLine commandLine34 = posixParser15.parse(options16, strArray32, properties33);
        org.apache.commons.cli.PosixParser posixParser35 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options36 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option40 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean41 = option40.hasOptionalArg();
        int int42 = option40.getArgs();
        boolean boolean43 = option40.hasOptionalArg();
        org.apache.commons.cli.Options options44 = options36.addOption(option40);
        java.util.Collection collection45 = options36.getOptionGroups();
        java.lang.String[] strArray52 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties53 = null;
        org.apache.commons.cli.CommandLine commandLine54 = posixParser35.parse(options36, strArray52, properties53);
        java.lang.String[] strArray56 = posixParser12.flatten(options16, strArray52, true);
        org.apache.commons.cli.Option option60 = new org.apache.commons.cli.Option("", true, "hi!");
        java.lang.String str61 = option60.getKey();
        option60.setRequired(true);
        option60.setLongOpt("");
        boolean boolean66 = option60.hasOptionalArg();
        org.apache.commons.cli.OptionGroup optionGroup67 = options16.getOptionGroup(option60);
        boolean boolean68 = option60.hasArgName();
        java.lang.String str69 = option60.getLongOpt();
        org.apache.commons.cli.OptionGroup optionGroup70 = options8.getOptionGroup(option60);
        java.lang.String str71 = options8.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(commandLine34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(options44);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(commandLine54);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(optionGroup67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNull(optionGroup70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "[ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]" + "'", str71, "[ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        java.lang.String str20 = options1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options25 = options1.addOption("hi!", "", true, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: opt contains illegal character value '!'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]" + "'", str20, "[ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        commandLine42.addArg("");
        java.lang.String str47 = commandLine42.getOptionValue("hi!", "hi!");
        org.apache.commons.cli.Option[] optionArray48 = commandLine42.getOptions();
        java.lang.String str51 = commandLine42.getOptionValue('a', "[ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]");
        java.util.Iterator iterator52 = commandLine42.iterator();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(optionArray48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "[ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]" + "'", str51, "[ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(iterator52);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        commandLine42.addArg("");
        java.lang.String str47 = commandLine42.getOptionValue("hi!", "hi!");
        java.lang.String[] strArray48 = commandLine42.getArgs();
        boolean boolean50 = commandLine42.hasOption('a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Option option21 = options1.getOption("org.apache.commons.cli.UnrecognizedOptionException: [ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNull(option21);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        commandLine42.addArg("");
        org.apache.commons.cli.Option option48 = new org.apache.commons.cli.Option("", true, "hi!");
        commandLine42.addOption(option48);
        java.lang.String str51 = commandLine42.getOptionValue('\000');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNull(str51);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean5 = option4.hasOptionalArg();
        int int6 = option4.getArgs();
        boolean boolean7 = option4.hasOptionalArg();
        org.apache.commons.cli.Options options8 = options0.addOption(option4);
        org.apache.commons.cli.Option option10 = options8.getOption("");
        java.util.Collection collection11 = options8.getOptions();
        org.apache.commons.cli.PosixParser posixParser12 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties13 = null;
        posixParser12.processProperties(properties13);
        org.apache.commons.cli.PosixParser posixParser15 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option20 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean21 = option20.hasOptionalArg();
        int int22 = option20.getArgs();
        boolean boolean23 = option20.hasOptionalArg();
        org.apache.commons.cli.Options options24 = options16.addOption(option20);
        java.util.Collection collection25 = options16.getOptionGroups();
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties33 = null;
        org.apache.commons.cli.CommandLine commandLine34 = posixParser15.parse(options16, strArray32, properties33);
        org.apache.commons.cli.PosixParser posixParser35 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options36 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option40 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean41 = option40.hasOptionalArg();
        int int42 = option40.getArgs();
        boolean boolean43 = option40.hasOptionalArg();
        org.apache.commons.cli.Options options44 = options36.addOption(option40);
        java.util.Collection collection45 = options36.getOptionGroups();
        java.lang.String[] strArray52 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties53 = null;
        org.apache.commons.cli.CommandLine commandLine54 = posixParser35.parse(options36, strArray52, properties53);
        java.lang.String[] strArray56 = posixParser12.flatten(options16, strArray52, true);
        org.apache.commons.cli.Option option60 = new org.apache.commons.cli.Option("", true, "hi!");
        java.lang.String str61 = option60.getKey();
        option60.setRequired(true);
        option60.setLongOpt("");
        boolean boolean66 = option60.hasOptionalArg();
        org.apache.commons.cli.OptionGroup optionGroup67 = options16.getOptionGroup(option60);
        boolean boolean68 = option60.hasArgName();
        java.lang.String str69 = option60.getLongOpt();
        org.apache.commons.cli.OptionGroup optionGroup70 = options8.getOptionGroup(option60);
        option60.setDescription("[ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]");
        option60.setValueSeparator('\000');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(option10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(commandLine34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(options44);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(commandLine54);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(optionGroup67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNull(optionGroup70);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        commandLine42.addArg("");
        org.apache.commons.cli.Option option48 = new org.apache.commons.cli.Option("", true, "hi!");
        commandLine42.addOption(option48);
        java.util.Iterator iterator50 = commandLine42.iterator();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(iterator50);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        org.apache.commons.cli.PosixParser posixParser3 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean9 = option8.hasOptionalArg();
        int int10 = option8.getArgs();
        boolean boolean11 = option8.hasOptionalArg();
        org.apache.commons.cli.Options options12 = options4.addOption(option8);
        java.util.Collection collection13 = options4.getOptionGroups();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties21 = null;
        org.apache.commons.cli.CommandLine commandLine22 = posixParser3.parse(options4, strArray20, properties21);
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option28 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean29 = option28.hasOptionalArg();
        int int30 = option28.getArgs();
        boolean boolean31 = option28.hasOptionalArg();
        org.apache.commons.cli.Options options32 = options24.addOption(option28);
        java.util.Collection collection33 = options24.getOptionGroups();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties41 = null;
        org.apache.commons.cli.CommandLine commandLine42 = posixParser23.parse(options24, strArray40, properties41);
        java.lang.String[] strArray44 = posixParser0.flatten(options4, strArray40, true);
        org.apache.commons.cli.PosixParser posixParser45 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options46 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option50 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean51 = option50.hasOptionalArg();
        int int52 = option50.getArgs();
        boolean boolean53 = option50.hasOptionalArg();
        org.apache.commons.cli.Options options54 = options46.addOption(option50);
        java.util.Collection collection55 = options46.getOptionGroups();
        java.lang.String[] strArray62 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties63 = null;
        org.apache.commons.cli.CommandLine commandLine64 = posixParser45.parse(options46, strArray62, properties63);
        org.apache.commons.cli.PosixParser posixParser65 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options66 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option70 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean71 = option70.hasOptionalArg();
        int int72 = option70.getArgs();
        boolean boolean73 = option70.hasOptionalArg();
        org.apache.commons.cli.Options options74 = options66.addOption(option70);
        java.util.Collection collection75 = options66.getOptionGroups();
        java.lang.String[] strArray82 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties83 = null;
        org.apache.commons.cli.CommandLine commandLine84 = posixParser65.parse(options66, strArray82, properties83);
        org.apache.commons.cli.CommandLine commandLine86 = posixParser0.parse(options46, strArray82, false);
        org.apache.commons.cli.CommandLine commandLine87 = posixParser0.cmd;
        posixParser0.checkRequiredOptions();
        org.apache.commons.cli.CommandLine commandLine89 = posixParser0.cmd;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(options54);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(commandLine64);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(options74);
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(commandLine84);
        org.junit.Assert.assertNotNull(commandLine86);
        org.junit.Assert.assertNotNull(commandLine87);
        org.junit.Assert.assertNotNull(commandLine89);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        org.apache.commons.cli.PosixParser posixParser3 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean9 = option8.hasOptionalArg();
        int int10 = option8.getArgs();
        boolean boolean11 = option8.hasOptionalArg();
        org.apache.commons.cli.Options options12 = options4.addOption(option8);
        java.util.Collection collection13 = options4.getOptionGroups();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties21 = null;
        org.apache.commons.cli.CommandLine commandLine22 = posixParser3.parse(options4, strArray20, properties21);
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option28 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean29 = option28.hasOptionalArg();
        int int30 = option28.getArgs();
        boolean boolean31 = option28.hasOptionalArg();
        org.apache.commons.cli.Options options32 = options24.addOption(option28);
        java.util.Collection collection33 = options24.getOptionGroups();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties41 = null;
        org.apache.commons.cli.CommandLine commandLine42 = posixParser23.parse(options24, strArray40, properties41);
        java.lang.String[] strArray44 = posixParser0.flatten(options4, strArray40, true);
        org.apache.commons.cli.PosixParser posixParser45 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options46 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option50 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean51 = option50.hasOptionalArg();
        int int52 = option50.getArgs();
        boolean boolean53 = option50.hasOptionalArg();
        org.apache.commons.cli.Options options54 = options46.addOption(option50);
        java.util.Collection collection55 = options46.getOptionGroups();
        java.lang.String[] strArray62 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties63 = null;
        org.apache.commons.cli.CommandLine commandLine64 = posixParser45.parse(options46, strArray62, properties63);
        org.apache.commons.cli.PosixParser posixParser65 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options66 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option70 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean71 = option70.hasOptionalArg();
        int int72 = option70.getArgs();
        boolean boolean73 = option70.hasOptionalArg();
        org.apache.commons.cli.Options options74 = options66.addOption(option70);
        java.util.Collection collection75 = options66.getOptionGroups();
        java.lang.String[] strArray82 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties83 = null;
        org.apache.commons.cli.CommandLine commandLine84 = posixParser65.parse(options66, strArray82, properties83);
        org.apache.commons.cli.CommandLine commandLine86 = posixParser0.parse(options46, strArray82, false);
        org.apache.commons.cli.CommandLine commandLine87 = posixParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine88 = posixParser0.cmd;
        org.apache.commons.cli.Options options89 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.setOptions(options89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(options54);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(commandLine64);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(options74);
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(commandLine84);
        org.junit.Assert.assertNotNull(commandLine86);
        org.junit.Assert.assertNotNull(commandLine87);
        org.junit.Assert.assertNotNull(commandLine88);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        java.lang.String[] strArray44 = commandLine42.getOptionValues('a');
        java.lang.Object obj46 = commandLine42.getOptionObject("");
        java.util.Iterator iterator47 = commandLine42.iterator();
        org.apache.commons.cli.Option option51 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean52 = option51.hasOptionalArg();
        org.apache.commons.cli.MissingArgumentException missingArgumentException53 = new org.apache.commons.cli.MissingArgumentException(option51);
        commandLine42.addOption(option51);
        java.lang.String[] strArray56 = commandLine42.getOptionValues('\000');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(strArray56);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        commandLine42.addArg("");
        java.util.Properties properties46 = commandLine42.getOptionProperties("");
        org.apache.commons.cli.Option[] optionArray47 = commandLine42.getOptions();
        java.util.List list48 = commandLine42.getArgList();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertNotNull(optionArray47);
        org.junit.Assert.assertNotNull(list48);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option7 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean8 = option7.hasOptionalArg();
        int int9 = option7.getArgs();
        boolean boolean10 = option7.hasOptionalArg();
        org.apache.commons.cli.Options options11 = options3.addOption(option7);
        java.util.Collection collection12 = options3.getOptionGroups();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties20 = null;
        org.apache.commons.cli.CommandLine commandLine21 = posixParser2.parse(options3, strArray19, properties20);
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option28 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean29 = option28.hasOptionalArg();
        int int30 = option28.getArgs();
        boolean boolean31 = option28.hasOptionalArg();
        org.apache.commons.cli.Options options32 = options24.addOption(option28);
        java.util.Collection collection33 = options24.getOptionGroups();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties41 = null;
        org.apache.commons.cli.CommandLine commandLine42 = posixParser23.parse(options24, strArray40, properties41);
        org.apache.commons.cli.CommandLine commandLine44 = posixParser2.parse(options22, strArray40, false);
        commandLine44.addArg("");
        java.lang.String str49 = commandLine44.getOptionValue("hi!", "hi!");
        java.lang.String[] strArray50 = commandLine44.getArgs();
        org.apache.commons.cli.PosixParser posixParser51 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options52 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option56 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean57 = option56.hasOptionalArg();
        int int58 = option56.getArgs();
        boolean boolean59 = option56.hasOptionalArg();
        org.apache.commons.cli.Options options60 = options52.addOption(option56);
        java.util.Collection collection61 = options52.getOptionGroups();
        java.lang.String[] strArray68 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties69 = null;
        org.apache.commons.cli.CommandLine commandLine70 = posixParser51.parse(options52, strArray68, properties69);
        org.apache.commons.cli.Options options71 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser72 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options73 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option77 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean78 = option77.hasOptionalArg();
        int int79 = option77.getArgs();
        boolean boolean80 = option77.hasOptionalArg();
        org.apache.commons.cli.Options options81 = options73.addOption(option77);
        java.util.Collection collection82 = options73.getOptionGroups();
        java.lang.String[] strArray89 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties90 = null;
        org.apache.commons.cli.CommandLine commandLine91 = posixParser72.parse(options73, strArray89, properties90);
        org.apache.commons.cli.CommandLine commandLine93 = posixParser51.parse(options71, strArray89, false);
        commandLine93.addArg("");
        java.util.Properties properties97 = commandLine93.getOptionProperties("");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine98 = posixParser0.parse(options1, strArray50, properties97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(commandLine44);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(options60);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(commandLine70);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(options81);
        org.junit.Assert.assertNotNull(collection82);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertNotNull(commandLine91);
        org.junit.Assert.assertNotNull(commandLine93);
        org.junit.Assert.assertNotNull(properties97);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        commandLine42.addArg("");
        java.lang.String str47 = commandLine42.getOptionValue("hi!", "hi!");
        java.util.Iterator iterator48 = commandLine42.iterator();
        org.apache.commons.cli.Option option52 = new org.apache.commons.cli.Option("", true, "hi!");
        java.lang.String str53 = option52.getKey();
        org.apache.commons.cli.MissingArgumentException missingArgumentException54 = new org.apache.commons.cli.MissingArgumentException(option52);
        org.apache.commons.cli.Option option55 = missingArgumentException54.getOption();
        commandLine42.addOption(option55);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(iterator48);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(option55);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        org.apache.commons.cli.Options options43 = posixParser0.getOptions();
        boolean boolean45 = options43.hasOption("org.apache.commons.cli.ParseException: ");
        org.apache.commons.cli.OptionGroup optionGroup46 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options47 = options43.addOptionGroup(optionGroup46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(options43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        org.apache.commons.cli.PosixParser posixParser3 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean9 = option8.hasOptionalArg();
        int int10 = option8.getArgs();
        boolean boolean11 = option8.hasOptionalArg();
        org.apache.commons.cli.Options options12 = options4.addOption(option8);
        java.util.Collection collection13 = options4.getOptionGroups();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties21 = null;
        org.apache.commons.cli.CommandLine commandLine22 = posixParser3.parse(options4, strArray20, properties21);
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option28 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean29 = option28.hasOptionalArg();
        int int30 = option28.getArgs();
        boolean boolean31 = option28.hasOptionalArg();
        org.apache.commons.cli.Options options32 = options24.addOption(option28);
        java.util.Collection collection33 = options24.getOptionGroups();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties41 = null;
        org.apache.commons.cli.CommandLine commandLine42 = posixParser23.parse(options24, strArray40, properties41);
        java.lang.String[] strArray44 = posixParser0.flatten(options4, strArray40, true);
        org.apache.commons.cli.PosixParser posixParser45 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options46 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option50 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean51 = option50.hasOptionalArg();
        int int52 = option50.getArgs();
        boolean boolean53 = option50.hasOptionalArg();
        org.apache.commons.cli.Options options54 = options46.addOption(option50);
        java.util.Collection collection55 = options46.getOptionGroups();
        java.lang.String[] strArray62 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties63 = null;
        org.apache.commons.cli.CommandLine commandLine64 = posixParser45.parse(options46, strArray62, properties63);
        org.apache.commons.cli.PosixParser posixParser65 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options66 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option70 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean71 = option70.hasOptionalArg();
        int int72 = option70.getArgs();
        boolean boolean73 = option70.hasOptionalArg();
        org.apache.commons.cli.Options options74 = options66.addOption(option70);
        java.util.Collection collection75 = options66.getOptionGroups();
        java.lang.String[] strArray82 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties83 = null;
        org.apache.commons.cli.CommandLine commandLine84 = posixParser65.parse(options66, strArray82, properties83);
        org.apache.commons.cli.CommandLine commandLine86 = posixParser0.parse(options46, strArray82, false);
        org.apache.commons.cli.CommandLine commandLine87 = posixParser0.cmd;
        posixParser0.burstToken("arg", true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(options54);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(commandLine64);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(options74);
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(commandLine84);
        org.junit.Assert.assertNotNull(commandLine86);
        org.junit.Assert.assertNotNull(commandLine87);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        org.apache.commons.cli.PosixParser posixParser3 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean9 = option8.hasOptionalArg();
        int int10 = option8.getArgs();
        boolean boolean11 = option8.hasOptionalArg();
        org.apache.commons.cli.Options options12 = options4.addOption(option8);
        java.util.Collection collection13 = options4.getOptionGroups();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties21 = null;
        org.apache.commons.cli.CommandLine commandLine22 = posixParser3.parse(options4, strArray20, properties21);
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option28 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean29 = option28.hasOptionalArg();
        int int30 = option28.getArgs();
        boolean boolean31 = option28.hasOptionalArg();
        org.apache.commons.cli.Options options32 = options24.addOption(option28);
        java.util.Collection collection33 = options24.getOptionGroups();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties41 = null;
        org.apache.commons.cli.CommandLine commandLine42 = posixParser23.parse(options24, strArray40, properties41);
        java.lang.String[] strArray44 = posixParser0.flatten(options4, strArray40, true);
        posixParser0.burstToken("[ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]", false);
        org.apache.commons.cli.PosixParser posixParser48 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options49 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option53 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean54 = option53.hasOptionalArg();
        int int55 = option53.getArgs();
        boolean boolean56 = option53.hasOptionalArg();
        org.apache.commons.cli.Options options57 = options49.addOption(option53);
        java.util.Collection collection58 = options49.getOptionGroups();
        java.lang.String[] strArray65 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties66 = null;
        org.apache.commons.cli.CommandLine commandLine67 = posixParser48.parse(options49, strArray65, properties66);
        java.lang.String str68 = options49.toString();
        org.apache.commons.cli.PosixParser posixParser69 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options70 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option74 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean75 = option74.hasOptionalArg();
        int int76 = option74.getArgs();
        boolean boolean77 = option74.hasOptionalArg();
        org.apache.commons.cli.Options options78 = options70.addOption(option74);
        java.util.Collection collection79 = options70.getOptionGroups();
        java.lang.String[] strArray86 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties87 = null;
        org.apache.commons.cli.CommandLine commandLine88 = posixParser69.parse(options70, strArray86, properties87);
        org.apache.commons.cli.CommandLine commandLine90 = posixParser0.parse(options49, strArray86, true);
        org.apache.commons.cli.OptionGroup optionGroup91 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options92 = options49.addOptionGroup(optionGroup91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(options57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(commandLine67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "[ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]" + "'", str68, "[ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(options78);
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertNotNull(commandLine88);
        org.junit.Assert.assertNotNull(commandLine90);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.List list10 = options9.getRequiredOptions();
        org.apache.commons.cli.Option option14 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean15 = option14.hasOptionalArg();
        boolean boolean16 = option14.hasArg();
        option14.setArgs((-1));
        org.apache.commons.cli.OptionGroup optionGroup19 = options9.getOptionGroup(option14);
        org.apache.commons.cli.MissingArgumentException missingArgumentException20 = new org.apache.commons.cli.MissingArgumentException(option14);
        int int21 = option14.getArgs();
        java.util.ListIterator listIterator22 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option14, listIterator22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(optionGroup19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        java.lang.String[] strArray44 = commandLine42.getOptionValues('a');
        java.lang.Object obj46 = commandLine42.getOptionObject("");
        java.util.Iterator iterator47 = commandLine42.iterator();
        org.apache.commons.cli.Option option51 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean52 = option51.hasOptionalArg();
        org.apache.commons.cli.MissingArgumentException missingArgumentException53 = new org.apache.commons.cli.MissingArgumentException(option51);
        commandLine42.addOption(option51);
        boolean boolean56 = commandLine42.hasOption("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean4 = option3.hasOptionalArg();
        java.lang.String str6 = option3.getValue((int) ' ');
        char char7 = option3.getValueSeparator();
        org.apache.commons.cli.PosixParser posixParser8 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options9 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option13 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean14 = option13.hasOptionalArg();
        int int15 = option13.getArgs();
        boolean boolean16 = option13.hasOptionalArg();
        org.apache.commons.cli.Options options17 = options9.addOption(option13);
        java.util.Collection collection18 = options9.getOptionGroups();
        java.lang.String[] strArray25 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties26 = null;
        org.apache.commons.cli.CommandLine commandLine27 = posixParser8.parse(options9, strArray25, properties26);
        org.apache.commons.cli.Options options28 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser29 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options30 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option34 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean35 = option34.hasOptionalArg();
        int int36 = option34.getArgs();
        boolean boolean37 = option34.hasOptionalArg();
        org.apache.commons.cli.Options options38 = options30.addOption(option34);
        java.util.Collection collection39 = options30.getOptionGroups();
        java.lang.String[] strArray46 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties47 = null;
        org.apache.commons.cli.CommandLine commandLine48 = posixParser29.parse(options30, strArray46, properties47);
        org.apache.commons.cli.CommandLine commandLine50 = posixParser8.parse(options28, strArray46, false);
        commandLine50.addArg("");
        java.lang.String str55 = commandLine50.getOptionValue("hi!", "hi!");
        java.util.Iterator iterator56 = commandLine50.iterator();
        option3.setType((java.lang.Object) commandLine50);
        java.lang.Object obj59 = commandLine50.getOptionObject("org.apache.commons.cli.MissingOptionException: Missing required options: ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(commandLine27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(options38);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(commandLine48);
        org.junit.Assert.assertNotNull(commandLine50);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNotNull(iterator56);
        org.junit.Assert.assertNull(obj59);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        org.apache.commons.cli.PosixParser posixParser3 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean9 = option8.hasOptionalArg();
        int int10 = option8.getArgs();
        boolean boolean11 = option8.hasOptionalArg();
        org.apache.commons.cli.Options options12 = options4.addOption(option8);
        java.util.Collection collection13 = options4.getOptionGroups();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties21 = null;
        org.apache.commons.cli.CommandLine commandLine22 = posixParser3.parse(options4, strArray20, properties21);
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option28 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean29 = option28.hasOptionalArg();
        int int30 = option28.getArgs();
        boolean boolean31 = option28.hasOptionalArg();
        org.apache.commons.cli.Options options32 = options24.addOption(option28);
        java.util.Collection collection33 = options24.getOptionGroups();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties41 = null;
        org.apache.commons.cli.CommandLine commandLine42 = posixParser23.parse(options24, strArray40, properties41);
        java.lang.String[] strArray44 = posixParser0.flatten(options4, strArray40, true);
        java.util.ListIterator listIterator46 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processOption("org.apache.commons.cli.MissingArgumentException: ", listIterator46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(strArray44);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        org.apache.commons.cli.PosixParser posixParser3 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean9 = option8.hasOptionalArg();
        int int10 = option8.getArgs();
        boolean boolean11 = option8.hasOptionalArg();
        org.apache.commons.cli.Options options12 = options4.addOption(option8);
        java.util.Collection collection13 = options4.getOptionGroups();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties21 = null;
        org.apache.commons.cli.CommandLine commandLine22 = posixParser3.parse(options4, strArray20, properties21);
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option28 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean29 = option28.hasOptionalArg();
        int int30 = option28.getArgs();
        boolean boolean31 = option28.hasOptionalArg();
        org.apache.commons.cli.Options options32 = options24.addOption(option28);
        java.util.Collection collection33 = options24.getOptionGroups();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties41 = null;
        org.apache.commons.cli.CommandLine commandLine42 = posixParser23.parse(options24, strArray40, properties41);
        java.lang.String[] strArray44 = posixParser0.flatten(options4, strArray40, true);
        org.apache.commons.cli.Option option48 = new org.apache.commons.cli.Option("", true, "hi!");
        java.lang.String str49 = option48.getKey();
        option48.setRequired(true);
        option48.setLongOpt("");
        boolean boolean54 = option48.hasOptionalArg();
        org.apache.commons.cli.OptionGroup optionGroup55 = options4.getOptionGroup(option48);
        boolean boolean56 = option48.hasArgName();
        java.lang.String str58 = option48.getValue((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int59 = option48.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(optionGroup55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(str58);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        java.lang.String[] strArray44 = commandLine42.getOptionValues('a');
        java.lang.String str47 = commandLine42.getOptionValue('a', "");
        commandLine42.addArg("hi!");
        java.lang.String str52 = commandLine42.getOptionValue("hi!", "");
        java.lang.Object obj54 = commandLine42.getOptionObject('a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(obj54);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        commandLine42.addArg("");
        java.lang.String str47 = commandLine42.getOptionValue("hi!", "hi!");
        org.apache.commons.cli.Option[] optionArray48 = commandLine42.getOptions();
        java.util.Iterator iterator49 = commandLine42.iterator();
        java.lang.String str51 = commandLine42.getOptionValue('a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(optionArray48);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertNull(str51);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        org.apache.commons.cli.PosixParser posixParser3 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean9 = option8.hasOptionalArg();
        int int10 = option8.getArgs();
        boolean boolean11 = option8.hasOptionalArg();
        org.apache.commons.cli.Options options12 = options4.addOption(option8);
        java.util.Collection collection13 = options4.getOptionGroups();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties21 = null;
        org.apache.commons.cli.CommandLine commandLine22 = posixParser3.parse(options4, strArray20, properties21);
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option28 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean29 = option28.hasOptionalArg();
        int int30 = option28.getArgs();
        boolean boolean31 = option28.hasOptionalArg();
        org.apache.commons.cli.Options options32 = options24.addOption(option28);
        java.util.Collection collection33 = options24.getOptionGroups();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties41 = null;
        org.apache.commons.cli.CommandLine commandLine42 = posixParser23.parse(options24, strArray40, properties41);
        java.lang.String[] strArray44 = posixParser0.flatten(options4, strArray40, true);
        org.apache.commons.cli.CommandLine commandLine45 = posixParser0.cmd;
        org.apache.commons.cli.Options options46 = posixParser0.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.checkRequiredOptions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNull(commandLine45);
        org.junit.Assert.assertNull(options46);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        org.apache.commons.cli.PosixParser posixParser3 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean9 = option8.hasOptionalArg();
        int int10 = option8.getArgs();
        boolean boolean11 = option8.hasOptionalArg();
        org.apache.commons.cli.Options options12 = options4.addOption(option8);
        java.util.Collection collection13 = options4.getOptionGroups();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties21 = null;
        org.apache.commons.cli.CommandLine commandLine22 = posixParser3.parse(options4, strArray20, properties21);
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option28 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean29 = option28.hasOptionalArg();
        int int30 = option28.getArgs();
        boolean boolean31 = option28.hasOptionalArg();
        org.apache.commons.cli.Options options32 = options24.addOption(option28);
        java.util.Collection collection33 = options24.getOptionGroups();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties41 = null;
        org.apache.commons.cli.CommandLine commandLine42 = posixParser23.parse(options24, strArray40, properties41);
        java.lang.String[] strArray44 = posixParser0.flatten(options4, strArray40, true);
        org.apache.commons.cli.PosixParser posixParser45 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options46 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option50 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean51 = option50.hasOptionalArg();
        int int52 = option50.getArgs();
        boolean boolean53 = option50.hasOptionalArg();
        org.apache.commons.cli.Options options54 = options46.addOption(option50);
        java.util.Collection collection55 = options46.getOptionGroups();
        java.lang.String[] strArray62 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties63 = null;
        org.apache.commons.cli.CommandLine commandLine64 = posixParser45.parse(options46, strArray62, properties63);
        org.apache.commons.cli.PosixParser posixParser65 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options66 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option70 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean71 = option70.hasOptionalArg();
        int int72 = option70.getArgs();
        boolean boolean73 = option70.hasOptionalArg();
        org.apache.commons.cli.Options options74 = options66.addOption(option70);
        java.util.Collection collection75 = options66.getOptionGroups();
        java.lang.String[] strArray82 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties83 = null;
        org.apache.commons.cli.CommandLine commandLine84 = posixParser65.parse(options66, strArray82, properties83);
        org.apache.commons.cli.CommandLine commandLine86 = posixParser0.parse(options46, strArray82, false);
        org.apache.commons.cli.CommandLine commandLine87 = posixParser0.cmd;
        java.util.Iterator iterator88 = commandLine87.iterator();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(options54);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(commandLine64);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(options74);
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(commandLine84);
        org.junit.Assert.assertNotNull(commandLine86);
        org.junit.Assert.assertNotNull(commandLine87);
        org.junit.Assert.assertNotNull(iterator88);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        java.util.Collection collection43 = options20.getOptionGroups();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(collection43);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        org.apache.commons.cli.PosixParser posixParser11 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options12 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option16 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean17 = option16.hasOptionalArg();
        int int18 = option16.getArgs();
        boolean boolean19 = option16.hasOptionalArg();
        org.apache.commons.cli.Options options20 = options12.addOption(option16);
        java.util.Collection collection21 = options12.getOptionGroups();
        java.lang.String[] strArray28 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties29 = null;
        org.apache.commons.cli.CommandLine commandLine30 = posixParser11.parse(options12, strArray28, properties29);
        org.apache.commons.cli.CommandLine commandLine31 = posixParser11.cmd;
        org.apache.commons.cli.CommandLine commandLine32 = posixParser11.cmd;
        org.apache.commons.cli.Options options33 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option37 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean38 = option37.hasOptionalArg();
        int int39 = option37.getArgs();
        boolean boolean40 = option37.hasOptionalArg();
        org.apache.commons.cli.Options options41 = options33.addOption(option37);
        java.util.Collection collection42 = options33.getOptionGroups();
        org.apache.commons.cli.Options options46 = options33.addOption("", false, "");
        java.lang.String str47 = options33.toString();
        org.apache.commons.cli.PosixParser posixParser48 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties49 = null;
        posixParser48.processProperties(properties49);
        org.apache.commons.cli.PosixParser posixParser51 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options52 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option56 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean57 = option56.hasOptionalArg();
        int int58 = option56.getArgs();
        boolean boolean59 = option56.hasOptionalArg();
        org.apache.commons.cli.Options options60 = options52.addOption(option56);
        java.util.Collection collection61 = options52.getOptionGroups();
        java.lang.String[] strArray68 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties69 = null;
        org.apache.commons.cli.CommandLine commandLine70 = posixParser51.parse(options52, strArray68, properties69);
        org.apache.commons.cli.PosixParser posixParser71 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options72 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option76 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean77 = option76.hasOptionalArg();
        int int78 = option76.getArgs();
        boolean boolean79 = option76.hasOptionalArg();
        org.apache.commons.cli.Options options80 = options72.addOption(option76);
        java.util.Collection collection81 = options72.getOptionGroups();
        java.lang.String[] strArray88 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties89 = null;
        org.apache.commons.cli.CommandLine commandLine90 = posixParser71.parse(options72, strArray88, properties89);
        java.lang.String[] strArray92 = posixParser48.flatten(options52, strArray88, true);
        org.apache.commons.cli.CommandLine commandLine94 = posixParser11.parse(options33, strArray92, false);
        java.lang.String[] strArray96 = posixParser0.flatten(options1, strArray92, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(options20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(commandLine30);
        org.junit.Assert.assertNotNull(commandLine31);
        org.junit.Assert.assertNotNull(commandLine32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(options41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(options46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "[ Options: [ short {=[ option:   ::  ]} ] [ long {} ]" + "'", str47, "[ Options: [ short {=[ option:   ::  ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(options60);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(commandLine70);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(options80);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertNotNull(commandLine90);
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertNotNull(commandLine94);
        org.junit.Assert.assertNotNull(strArray96);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.CommandLine commandLine20 = posixParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine21 = posixParser0.cmd;
        java.lang.String[] strArray23 = commandLine21.getOptionValues('a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine20);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNull(strArray23);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        java.lang.String[] strArray44 = commandLine42.getOptionValues('a');
        java.lang.String str46 = commandLine42.getOptionValue('a');
        boolean boolean48 = commandLine42.hasOption('#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean4 = option3.hasOptionalArg();
        org.apache.commons.cli.MissingArgumentException missingArgumentException5 = new org.apache.commons.cli.MissingArgumentException(option3);
        org.apache.commons.cli.Option option9 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean10 = option9.hasOptionalArg();
        int int11 = option9.getArgs();
        option3.setType((java.lang.Object) int11);
        java.lang.String[] strArray13 = option3.getValues();
        java.lang.String str14 = option3.getDescription();
        java.lang.String str15 = option3.getLongOpt();
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option21 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean22 = option21.hasOptionalArg();
        int int23 = option21.getArgs();
        boolean boolean24 = option21.hasOptionalArg();
        org.apache.commons.cli.Options options25 = options17.addOption(option21);
        java.util.Collection collection26 = options17.getOptionGroups();
        java.lang.String[] strArray33 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties34 = null;
        org.apache.commons.cli.CommandLine commandLine35 = posixParser16.parse(options17, strArray33, properties34);
        org.apache.commons.cli.Options options36 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser37 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options38 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option42 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean43 = option42.hasOptionalArg();
        int int44 = option42.getArgs();
        boolean boolean45 = option42.hasOptionalArg();
        org.apache.commons.cli.Options options46 = options38.addOption(option42);
        java.util.Collection collection47 = options38.getOptionGroups();
        java.lang.String[] strArray54 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties55 = null;
        org.apache.commons.cli.CommandLine commandLine56 = posixParser37.parse(options38, strArray54, properties55);
        org.apache.commons.cli.CommandLine commandLine58 = posixParser16.parse(options36, strArray54, false);
        commandLine58.addArg("");
        java.util.Properties properties62 = commandLine58.getOptionProperties("");
        option3.setType((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            int int64 = option3.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(commandLine35);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(options46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(commandLine56);
        org.junit.Assert.assertNotNull(commandLine58);
        org.junit.Assert.assertNotNull(properties62);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        commandLine42.addArg("");
        java.lang.String str47 = commandLine42.getOptionValue("hi!", "hi!");
        org.apache.commons.cli.Option[] optionArray48 = commandLine42.getOptions();
        java.util.Iterator iterator49 = commandLine42.iterator();
        java.lang.String[] strArray51 = commandLine42.getOptionValues('a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(optionArray48);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertNull(strArray51);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        org.apache.commons.cli.PosixParser posixParser3 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean9 = option8.hasOptionalArg();
        int int10 = option8.getArgs();
        boolean boolean11 = option8.hasOptionalArg();
        org.apache.commons.cli.Options options12 = options4.addOption(option8);
        java.util.Collection collection13 = options4.getOptionGroups();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties21 = null;
        org.apache.commons.cli.CommandLine commandLine22 = posixParser3.parse(options4, strArray20, properties21);
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option28 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean29 = option28.hasOptionalArg();
        int int30 = option28.getArgs();
        boolean boolean31 = option28.hasOptionalArg();
        org.apache.commons.cli.Options options32 = options24.addOption(option28);
        java.util.Collection collection33 = options24.getOptionGroups();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties41 = null;
        org.apache.commons.cli.CommandLine commandLine42 = posixParser23.parse(options24, strArray40, properties41);
        java.lang.String[] strArray44 = posixParser0.flatten(options4, strArray40, true);
        posixParser0.burstToken("[ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]", false);
        org.apache.commons.cli.PosixParser posixParser48 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options49 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option53 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean54 = option53.hasOptionalArg();
        int int55 = option53.getArgs();
        boolean boolean56 = option53.hasOptionalArg();
        org.apache.commons.cli.Options options57 = options49.addOption(option53);
        java.util.Collection collection58 = options49.getOptionGroups();
        java.lang.String[] strArray65 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties66 = null;
        org.apache.commons.cli.CommandLine commandLine67 = posixParser48.parse(options49, strArray65, properties66);
        java.lang.String str68 = options49.toString();
        org.apache.commons.cli.PosixParser posixParser69 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options70 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option74 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean75 = option74.hasOptionalArg();
        int int76 = option74.getArgs();
        boolean boolean77 = option74.hasOptionalArg();
        org.apache.commons.cli.Options options78 = options70.addOption(option74);
        java.util.Collection collection79 = options70.getOptionGroups();
        java.lang.String[] strArray86 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties87 = null;
        org.apache.commons.cli.CommandLine commandLine88 = posixParser69.parse(options70, strArray86, properties87);
        org.apache.commons.cli.CommandLine commandLine90 = posixParser0.parse(options49, strArray86, true);
        java.util.ListIterator listIterator92 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processOption("org.apache.commons.cli.MissingArgumentException: ", listIterator92);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.UnrecognizedOptionException; message: Unrecognized option: org.apache.commons.cli.MissingArgumentException: ");
        } catch (org.apache.commons.cli.UnrecognizedOptionException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(options57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(commandLine67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "[ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]" + "'", str68, "[ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(options78);
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertNotNull(commandLine88);
        org.junit.Assert.assertNotNull(commandLine90);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        java.lang.String[] strArray44 = commandLine42.getOptionValues('a');
        java.util.Properties properties46 = commandLine42.getOptionProperties("");
        java.lang.String str48 = commandLine42.getOptionValue('#');
        java.lang.String[] strArray50 = commandLine42.getOptionValues("[ option:   [ARG] :: hi! ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(strArray50);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option24 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean25 = option24.hasOptionalArg();
        int int26 = option24.getArgs();
        boolean boolean27 = option24.hasOptionalArg();
        org.apache.commons.cli.Options options28 = options20.addOption(option24);
        org.apache.commons.cli.Option option30 = options20.getOption("");
        org.apache.commons.cli.Option option32 = options20.getOption("");
        posixParser0.setOptions(options20);
        java.lang.String str34 = options20.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(options28);
        org.junit.Assert.assertNotNull(option30);
        org.junit.Assert.assertNotNull(option32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]" + "'", str34, "[ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        org.apache.commons.cli.PosixParser posixParser3 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean9 = option8.hasOptionalArg();
        int int10 = option8.getArgs();
        boolean boolean11 = option8.hasOptionalArg();
        org.apache.commons.cli.Options options12 = options4.addOption(option8);
        java.util.Collection collection13 = options4.getOptionGroups();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties21 = null;
        org.apache.commons.cli.CommandLine commandLine22 = posixParser3.parse(options4, strArray20, properties21);
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option28 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean29 = option28.hasOptionalArg();
        int int30 = option28.getArgs();
        boolean boolean31 = option28.hasOptionalArg();
        org.apache.commons.cli.Options options32 = options24.addOption(option28);
        java.util.Collection collection33 = options24.getOptionGroups();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties41 = null;
        org.apache.commons.cli.CommandLine commandLine42 = posixParser23.parse(options24, strArray40, properties41);
        java.lang.String[] strArray44 = posixParser0.flatten(options4, strArray40, true);
        org.apache.commons.cli.Option option48 = new org.apache.commons.cli.Option("", true, "hi!");
        java.lang.String str49 = option48.getKey();
        option48.setRequired(true);
        option48.setLongOpt("");
        boolean boolean54 = option48.hasOptionalArg();
        org.apache.commons.cli.OptionGroup optionGroup55 = options4.getOptionGroup(option48);
        boolean boolean56 = option48.hasArgName();
        java.lang.Class<?> wildcardClass57 = option48.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(optionGroup55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean4 = option3.hasOptionalArg();
        java.lang.String str6 = option3.getValue((int) ' ');
        java.lang.String str7 = option3.getOpt();
        org.apache.commons.cli.PosixParser posixParser8 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options9 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option13 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean14 = option13.hasOptionalArg();
        int int15 = option13.getArgs();
        boolean boolean16 = option13.hasOptionalArg();
        org.apache.commons.cli.Options options17 = options9.addOption(option13);
        java.util.Collection collection18 = options9.getOptionGroups();
        java.lang.String[] strArray25 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties26 = null;
        org.apache.commons.cli.CommandLine commandLine27 = posixParser8.parse(options9, strArray25, properties26);
        org.apache.commons.cli.Options options28 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser29 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options30 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option34 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean35 = option34.hasOptionalArg();
        int int36 = option34.getArgs();
        boolean boolean37 = option34.hasOptionalArg();
        org.apache.commons.cli.Options options38 = options30.addOption(option34);
        java.util.Collection collection39 = options30.getOptionGroups();
        java.lang.String[] strArray46 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties47 = null;
        org.apache.commons.cli.CommandLine commandLine48 = posixParser29.parse(options30, strArray46, properties47);
        org.apache.commons.cli.CommandLine commandLine50 = posixParser8.parse(options28, strArray46, false);
        java.lang.String[] strArray52 = commandLine50.getOptionValues('a');
        java.lang.String str55 = commandLine50.getOptionValue('a', "");
        java.lang.String[] strArray56 = commandLine50.getArgs();
        option3.setType((java.lang.Object) commandLine50);
        java.lang.Object obj59 = commandLine50.getOptionObject('a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(commandLine27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(options38);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(commandLine48);
        org.junit.Assert.assertNotNull(commandLine50);
        org.junit.Assert.assertNull(strArray52);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNull(obj59);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean4 = option3.hasOptionalArg();
        java.lang.String str6 = option3.getValue((int) ' ');
        char char7 = option3.getValueSeparator();
        org.apache.commons.cli.PosixParser posixParser8 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options9 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option13 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean14 = option13.hasOptionalArg();
        int int15 = option13.getArgs();
        boolean boolean16 = option13.hasOptionalArg();
        org.apache.commons.cli.Options options17 = options9.addOption(option13);
        java.util.Collection collection18 = options9.getOptionGroups();
        java.lang.String[] strArray25 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties26 = null;
        org.apache.commons.cli.CommandLine commandLine27 = posixParser8.parse(options9, strArray25, properties26);
        org.apache.commons.cli.Options options28 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser29 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options30 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option34 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean35 = option34.hasOptionalArg();
        int int36 = option34.getArgs();
        boolean boolean37 = option34.hasOptionalArg();
        org.apache.commons.cli.Options options38 = options30.addOption(option34);
        java.util.Collection collection39 = options30.getOptionGroups();
        java.lang.String[] strArray46 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties47 = null;
        org.apache.commons.cli.CommandLine commandLine48 = posixParser29.parse(options30, strArray46, properties47);
        org.apache.commons.cli.CommandLine commandLine50 = posixParser8.parse(options28, strArray46, false);
        commandLine50.addArg("");
        java.lang.String str55 = commandLine50.getOptionValue("hi!", "hi!");
        java.util.Iterator iterator56 = commandLine50.iterator();
        option3.setType((java.lang.Object) commandLine50);
        org.apache.commons.cli.Option option61 = new org.apache.commons.cli.Option("", true, "hi!");
        java.lang.String str62 = option61.getKey();
        boolean boolean63 = option61.hasOptionalArg();
        org.apache.commons.cli.MissingArgumentException missingArgumentException64 = new org.apache.commons.cli.MissingArgumentException(option61);
        boolean boolean65 = option61.hasLongOpt();
        char char66 = option61.getValueSeparator();
        commandLine50.addOption(option61);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(commandLine27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(options38);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(commandLine48);
        org.junit.Assert.assertNotNull(commandLine50);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNotNull(iterator56);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + char66 + "' != '" + '\000' + "'", char66 == '\000');
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        java.util.List list3 = posixParser0.getRequiredOptions();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean9 = option8.hasOptionalArg();
        int int10 = option8.getArgs();
        boolean boolean11 = option8.hasOptionalArg();
        org.apache.commons.cli.Options options12 = options4.addOption(option8);
        org.apache.commons.cli.Option option14 = options12.getOption("");
        java.util.Collection collection15 = options12.getOptions();
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option21 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean22 = option21.hasOptionalArg();
        int int23 = option21.getArgs();
        boolean boolean24 = option21.hasOptionalArg();
        org.apache.commons.cli.Options options25 = options17.addOption(option21);
        java.util.Collection collection26 = options17.getOptionGroups();
        java.lang.String[] strArray33 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties34 = null;
        org.apache.commons.cli.CommandLine commandLine35 = posixParser16.parse(options17, strArray33, properties34);
        org.apache.commons.cli.Options options36 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser37 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options38 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option42 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean43 = option42.hasOptionalArg();
        int int44 = option42.getArgs();
        boolean boolean45 = option42.hasOptionalArg();
        org.apache.commons.cli.Options options46 = options38.addOption(option42);
        java.util.Collection collection47 = options38.getOptionGroups();
        java.lang.String[] strArray54 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties55 = null;
        org.apache.commons.cli.CommandLine commandLine56 = posixParser37.parse(options38, strArray54, properties55);
        org.apache.commons.cli.CommandLine commandLine58 = posixParser16.parse(options36, strArray54, false);
        java.lang.String[] strArray60 = commandLine58.getOptionValues('a');
        java.lang.String str63 = commandLine58.getOptionValue('a', "");
        java.lang.String[] strArray64 = commandLine58.getArgs();
        org.apache.commons.cli.CommandLine commandLine66 = posixParser0.parse(options12, strArray64, true);
        posixParser0.checkRequiredOptions();
        java.util.List list68 = posixParser0.getRequiredOptions();
        org.junit.Assert.assertNull(list3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(option14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(commandLine35);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(options46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(commandLine56);
        org.junit.Assert.assertNotNull(commandLine58);
        org.junit.Assert.assertNull(strArray60);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(commandLine66);
        org.junit.Assert.assertNotNull(list68);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        org.apache.commons.cli.PosixParser posixParser3 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean9 = option8.hasOptionalArg();
        int int10 = option8.getArgs();
        boolean boolean11 = option8.hasOptionalArg();
        org.apache.commons.cli.Options options12 = options4.addOption(option8);
        java.util.Collection collection13 = options4.getOptionGroups();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties21 = null;
        org.apache.commons.cli.CommandLine commandLine22 = posixParser3.parse(options4, strArray20, properties21);
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option28 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean29 = option28.hasOptionalArg();
        int int30 = option28.getArgs();
        boolean boolean31 = option28.hasOptionalArg();
        org.apache.commons.cli.Options options32 = options24.addOption(option28);
        java.util.Collection collection33 = options24.getOptionGroups();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties41 = null;
        org.apache.commons.cli.CommandLine commandLine42 = posixParser23.parse(options24, strArray40, properties41);
        java.lang.String[] strArray44 = posixParser0.flatten(options4, strArray40, true);
        java.util.List list45 = options4.helpOptions();
        java.util.List list46 = options4.getRequiredOptions();
        java.util.Collection collection47 = options4.getOptionGroups();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(collection47);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.PosixParser posixParser20 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options21 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option25 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean26 = option25.hasOptionalArg();
        int int27 = option25.getArgs();
        boolean boolean28 = option25.hasOptionalArg();
        org.apache.commons.cli.Options options29 = options21.addOption(option25);
        java.util.Collection collection30 = options21.getOptionGroups();
        java.lang.String[] strArray37 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties38 = null;
        org.apache.commons.cli.CommandLine commandLine39 = posixParser20.parse(options21, strArray37, properties38);
        org.apache.commons.cli.Options options40 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options42 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option46 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean47 = option46.hasOptionalArg();
        int int48 = option46.getArgs();
        boolean boolean49 = option46.hasOptionalArg();
        org.apache.commons.cli.Options options50 = options42.addOption(option46);
        java.util.Collection collection51 = options42.getOptionGroups();
        java.lang.String[] strArray58 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties59 = null;
        org.apache.commons.cli.CommandLine commandLine60 = posixParser41.parse(options42, strArray58, properties59);
        org.apache.commons.cli.CommandLine commandLine62 = posixParser20.parse(options40, strArray58, false);
        posixParser0.setOptions(options40);
        java.util.Collection collection64 = options40.getOptions();
        org.apache.commons.cli.Option option68 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean69 = option68.hasOptionalArg();
        org.apache.commons.cli.MissingArgumentException missingArgumentException70 = new org.apache.commons.cli.MissingArgumentException(option68);
        boolean boolean71 = option68.hasValueSeparator();
        java.lang.Object obj72 = option68.clone();
        java.lang.String str73 = option68.getOpt();
        java.lang.String str74 = option68.getValue();
        org.apache.commons.cli.OptionGroup optionGroup75 = options40.getOptionGroup(option68);
        java.util.Collection collection76 = options40.getOptionGroups();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(commandLine39);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(options50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(commandLine60);
        org.junit.Assert.assertNotNull(commandLine62);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertEquals(obj72.toString(), "[ option:   [ARG] :: hi! ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj72), "[ option:   [ARG] :: hi! ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj72), "[ option:   [ARG] :: hi! ]");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNull(optionGroup75);
        org.junit.Assert.assertNotNull(collection76);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.CommandLine commandLine1 = posixParser0.cmd;
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option6 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean7 = option6.hasOptionalArg();
        int int8 = option6.getArgs();
        boolean boolean9 = option6.hasOptionalArg();
        org.apache.commons.cli.Options options10 = options2.addOption(option6);
        java.util.List list11 = options10.getRequiredOptions();
        org.apache.commons.cli.PosixParser posixParser12 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options13 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option17 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean18 = option17.hasOptionalArg();
        int int19 = option17.getArgs();
        boolean boolean20 = option17.hasOptionalArg();
        org.apache.commons.cli.Options options21 = options13.addOption(option17);
        java.util.Collection collection22 = options13.getOptionGroups();
        java.lang.String[] strArray29 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties30 = null;
        org.apache.commons.cli.CommandLine commandLine31 = posixParser12.parse(options13, strArray29, properties30);
        org.apache.commons.cli.CommandLine commandLine33 = posixParser0.parse(options10, strArray29, true);
        java.util.List list34 = options10.helpOptions();
        org.apache.commons.cli.MissingOptionException missingOptionException35 = new org.apache.commons.cli.MissingOptionException(list34);
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(commandLine31);
        org.junit.Assert.assertNotNull(commandLine33);
        org.junit.Assert.assertNotNull(list34);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.PosixParser posixParser20 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options21 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option25 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean26 = option25.hasOptionalArg();
        int int27 = option25.getArgs();
        boolean boolean28 = option25.hasOptionalArg();
        org.apache.commons.cli.Options options29 = options21.addOption(option25);
        java.util.Collection collection30 = options21.getOptionGroups();
        java.lang.String[] strArray37 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties38 = null;
        org.apache.commons.cli.CommandLine commandLine39 = posixParser20.parse(options21, strArray37, properties38);
        org.apache.commons.cli.Options options40 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options42 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option46 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean47 = option46.hasOptionalArg();
        int int48 = option46.getArgs();
        boolean boolean49 = option46.hasOptionalArg();
        org.apache.commons.cli.Options options50 = options42.addOption(option46);
        java.util.Collection collection51 = options42.getOptionGroups();
        java.lang.String[] strArray58 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties59 = null;
        org.apache.commons.cli.CommandLine commandLine60 = posixParser41.parse(options42, strArray58, properties59);
        org.apache.commons.cli.CommandLine commandLine62 = posixParser20.parse(options40, strArray58, false);
        posixParser0.setOptions(options40);
        org.apache.commons.cli.Options options64 = posixParser0.getOptions();
        org.apache.commons.cli.Option option68 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean69 = option68.hasOptionalArg();
        org.apache.commons.cli.MissingArgumentException missingArgumentException70 = new org.apache.commons.cli.MissingArgumentException(option68);
        org.apache.commons.cli.Option option74 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean75 = option74.hasOptionalArg();
        int int76 = option74.getArgs();
        option68.setType((java.lang.Object) int76);
        java.lang.String[] strArray78 = option68.getValues();
        java.lang.String str79 = option68.getDescription();
        java.lang.String str80 = option68.getLongOpt();
        org.apache.commons.cli.OptionGroup optionGroup81 = options64.getOptionGroup(option68);
        java.util.Collection collection82 = options64.getOptionGroups();
        java.util.Collection collection83 = options64.getOptionGroups();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options87 = options64.addOption("[ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]", false, "[ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: opt contains illegal character value '['");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(commandLine39);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(options50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(commandLine60);
        org.junit.Assert.assertNotNull(commandLine62);
        org.junit.Assert.assertNotNull(options64);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNull(strArray78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertNull(optionGroup81);
        org.junit.Assert.assertNotNull(collection82);
        org.junit.Assert.assertNotNull(collection83);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        commandLine42.addArg("");
        java.util.Properties properties46 = commandLine42.getOptionProperties("");
        org.apache.commons.cli.Option[] optionArray47 = commandLine42.getOptions();
        org.apache.commons.cli.Option option51 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean52 = option51.hasOptionalArg();
        java.util.List list53 = option51.getValuesList();
        int int54 = option51.getArgs();
        boolean boolean55 = option51.hasLongOpt();
        java.lang.String str56 = option51.toString();
        option51.setArgName("[ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]");
        commandLine42.addOption(option51);
        java.lang.String str62 = commandLine42.getOptionValue("hi!", "[ option:   [ARG] :: hi! ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertNotNull(optionArray47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "[ option:   [ARG] :: hi! ]" + "'", str56, "[ option:   [ARG] :: hi! ]");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "[ option:   [ARG] :: hi! ]" + "'", str62, "[ option:   [ARG] :: hi! ]");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        org.apache.commons.cli.PosixParser posixParser3 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean9 = option8.hasOptionalArg();
        int int10 = option8.getArgs();
        boolean boolean11 = option8.hasOptionalArg();
        org.apache.commons.cli.Options options12 = options4.addOption(option8);
        java.util.Collection collection13 = options4.getOptionGroups();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties21 = null;
        org.apache.commons.cli.CommandLine commandLine22 = posixParser3.parse(options4, strArray20, properties21);
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option28 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean29 = option28.hasOptionalArg();
        int int30 = option28.getArgs();
        boolean boolean31 = option28.hasOptionalArg();
        org.apache.commons.cli.Options options32 = options24.addOption(option28);
        java.util.Collection collection33 = options24.getOptionGroups();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties41 = null;
        org.apache.commons.cli.CommandLine commandLine42 = posixParser23.parse(options24, strArray40, properties41);
        java.lang.String[] strArray44 = posixParser0.flatten(options4, strArray40, true);
        org.apache.commons.cli.Option option48 = new org.apache.commons.cli.Option("", true, "hi!");
        java.lang.String str49 = option48.getKey();
        option48.setRequired(true);
        option48.setLongOpt("");
        boolean boolean54 = option48.hasOptionalArg();
        org.apache.commons.cli.OptionGroup optionGroup55 = options4.getOptionGroup(option48);
        java.util.List list56 = options4.getRequiredOptions();
        java.lang.Class<?> wildcardClass57 = list56.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(optionGroup55);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.PosixParser posixParser20 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options21 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option25 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean26 = option25.hasOptionalArg();
        int int27 = option25.getArgs();
        boolean boolean28 = option25.hasOptionalArg();
        org.apache.commons.cli.Options options29 = options21.addOption(option25);
        java.util.Collection collection30 = options21.getOptionGroups();
        java.lang.String[] strArray37 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties38 = null;
        org.apache.commons.cli.CommandLine commandLine39 = posixParser20.parse(options21, strArray37, properties38);
        org.apache.commons.cli.Options options40 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options42 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option46 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean47 = option46.hasOptionalArg();
        int int48 = option46.getArgs();
        boolean boolean49 = option46.hasOptionalArg();
        org.apache.commons.cli.Options options50 = options42.addOption(option46);
        java.util.Collection collection51 = options42.getOptionGroups();
        java.lang.String[] strArray58 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties59 = null;
        org.apache.commons.cli.CommandLine commandLine60 = posixParser41.parse(options42, strArray58, properties59);
        org.apache.commons.cli.CommandLine commandLine62 = posixParser20.parse(options40, strArray58, false);
        posixParser0.setOptions(options40);
        java.util.Collection collection64 = options40.getOptions();
        boolean boolean66 = options40.hasOption("[ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(commandLine39);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(options50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(commandLine60);
        org.junit.Assert.assertNotNull(commandLine62);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        commandLine42.addArg("");
        java.lang.String str47 = commandLine42.getOptionValue("hi!", "hi!");
        java.lang.String[] strArray48 = commandLine42.getArgs();
        org.apache.commons.cli.Option[] optionArray49 = commandLine42.getOptions();
        java.lang.String[] strArray51 = commandLine42.getOptionValues("[ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(optionArray49);
        org.junit.Assert.assertNull(strArray51);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        org.apache.commons.cli.PosixParser posixParser3 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean9 = option8.hasOptionalArg();
        int int10 = option8.getArgs();
        boolean boolean11 = option8.hasOptionalArg();
        org.apache.commons.cli.Options options12 = options4.addOption(option8);
        java.util.Collection collection13 = options4.getOptionGroups();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties21 = null;
        org.apache.commons.cli.CommandLine commandLine22 = posixParser3.parse(options4, strArray20, properties21);
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option28 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean29 = option28.hasOptionalArg();
        int int30 = option28.getArgs();
        boolean boolean31 = option28.hasOptionalArg();
        org.apache.commons.cli.Options options32 = options24.addOption(option28);
        java.util.Collection collection33 = options24.getOptionGroups();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties41 = null;
        org.apache.commons.cli.CommandLine commandLine42 = posixParser23.parse(options24, strArray40, properties41);
        java.lang.String[] strArray44 = posixParser0.flatten(options4, strArray40, true);
        org.apache.commons.cli.PosixParser posixParser45 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options46 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option50 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean51 = option50.hasOptionalArg();
        int int52 = option50.getArgs();
        boolean boolean53 = option50.hasOptionalArg();
        org.apache.commons.cli.Options options54 = options46.addOption(option50);
        java.util.Collection collection55 = options46.getOptionGroups();
        java.lang.String[] strArray62 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties63 = null;
        org.apache.commons.cli.CommandLine commandLine64 = posixParser45.parse(options46, strArray62, properties63);
        org.apache.commons.cli.PosixParser posixParser65 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options66 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option70 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean71 = option70.hasOptionalArg();
        int int72 = option70.getArgs();
        boolean boolean73 = option70.hasOptionalArg();
        org.apache.commons.cli.Options options74 = options66.addOption(option70);
        java.util.Collection collection75 = options66.getOptionGroups();
        java.lang.String[] strArray82 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties83 = null;
        org.apache.commons.cli.CommandLine commandLine84 = posixParser65.parse(options66, strArray82, properties83);
        org.apache.commons.cli.CommandLine commandLine86 = posixParser0.parse(options46, strArray82, false);
        org.apache.commons.cli.Options options87 = posixParser0.getOptions();
        org.apache.commons.cli.CommandLine commandLine88 = posixParser0.cmd;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(options54);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(commandLine64);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(options74);
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(commandLine84);
        org.junit.Assert.assertNotNull(commandLine86);
        org.junit.Assert.assertNotNull(options87);
        org.junit.Assert.assertNotNull(commandLine88);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        java.lang.String[] strArray44 = commandLine42.getOptionValues('a');
        java.lang.String str46 = commandLine42.getOptionValue("org.apache.commons.cli.ParseException: ");
        java.lang.String str48 = commandLine42.getOptionValue("[ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]");
        java.lang.Object obj50 = commandLine42.getOptionObject('a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(obj50);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        commandLine42.addArg("");
        org.apache.commons.cli.Option option48 = new org.apache.commons.cli.Option("", true, "hi!");
        commandLine42.addOption(option48);
        boolean boolean50 = option48.hasArgName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        java.lang.String[] strArray44 = commandLine42.getOptionValues('a');
        java.util.Properties properties46 = commandLine42.getOptionProperties("");
        java.lang.String str48 = commandLine42.getOptionValue('#');
        commandLine42.addArg("arg");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean4 = option3.hasOptionalArg();
        java.lang.String str6 = option3.getValue((int) ' ');
        java.lang.String str7 = option3.getOpt();
        org.apache.commons.cli.PosixParser posixParser8 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options9 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option13 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean14 = option13.hasOptionalArg();
        int int15 = option13.getArgs();
        boolean boolean16 = option13.hasOptionalArg();
        org.apache.commons.cli.Options options17 = options9.addOption(option13);
        java.util.Collection collection18 = options9.getOptionGroups();
        java.lang.String[] strArray25 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties26 = null;
        org.apache.commons.cli.CommandLine commandLine27 = posixParser8.parse(options9, strArray25, properties26);
        org.apache.commons.cli.Options options28 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser29 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options30 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option34 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean35 = option34.hasOptionalArg();
        int int36 = option34.getArgs();
        boolean boolean37 = option34.hasOptionalArg();
        org.apache.commons.cli.Options options38 = options30.addOption(option34);
        java.util.Collection collection39 = options30.getOptionGroups();
        java.lang.String[] strArray46 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties47 = null;
        org.apache.commons.cli.CommandLine commandLine48 = posixParser29.parse(options30, strArray46, properties47);
        org.apache.commons.cli.CommandLine commandLine50 = posixParser8.parse(options28, strArray46, false);
        java.lang.String[] strArray52 = commandLine50.getOptionValues('a');
        java.lang.String str55 = commandLine50.getOptionValue('a', "");
        java.lang.String[] strArray56 = commandLine50.getArgs();
        option3.setType((java.lang.Object) commandLine50);
        java.lang.String str60 = commandLine50.getOptionValue("arg", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(options17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(commandLine27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(options38);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(commandLine48);
        org.junit.Assert.assertNotNull(commandLine50);
        org.junit.Assert.assertNull(strArray52);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        org.apache.commons.cli.PosixParser posixParser3 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean9 = option8.hasOptionalArg();
        int int10 = option8.getArgs();
        boolean boolean11 = option8.hasOptionalArg();
        org.apache.commons.cli.Options options12 = options4.addOption(option8);
        java.util.Collection collection13 = options4.getOptionGroups();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties21 = null;
        org.apache.commons.cli.CommandLine commandLine22 = posixParser3.parse(options4, strArray20, properties21);
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option28 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean29 = option28.hasOptionalArg();
        int int30 = option28.getArgs();
        boolean boolean31 = option28.hasOptionalArg();
        org.apache.commons.cli.Options options32 = options24.addOption(option28);
        java.util.Collection collection33 = options24.getOptionGroups();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties41 = null;
        org.apache.commons.cli.CommandLine commandLine42 = posixParser23.parse(options24, strArray40, properties41);
        java.lang.String[] strArray44 = posixParser0.flatten(options4, strArray40, true);
        org.apache.commons.cli.Option option48 = new org.apache.commons.cli.Option("", true, "hi!");
        java.lang.String str49 = option48.getKey();
        option48.setRequired(true);
        option48.setLongOpt("");
        boolean boolean54 = option48.hasOptionalArg();
        org.apache.commons.cli.OptionGroup optionGroup55 = options4.getOptionGroup(option48);
        java.util.List list56 = options4.getRequiredOptions();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options61 = options4.addOption("org.apache.commons.cli.MissingOptionException: Missing required options: ", "[ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]", true, "org.apache.commons.cli.ParseException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: opt contains illegal character value '.'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(optionGroup55);
        org.junit.Assert.assertNotNull(list56);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.PosixParser posixParser20 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options21 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option25 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean26 = option25.hasOptionalArg();
        int int27 = option25.getArgs();
        boolean boolean28 = option25.hasOptionalArg();
        org.apache.commons.cli.Options options29 = options21.addOption(option25);
        java.util.Collection collection30 = options21.getOptionGroups();
        java.lang.String[] strArray37 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties38 = null;
        org.apache.commons.cli.CommandLine commandLine39 = posixParser20.parse(options21, strArray37, properties38);
        org.apache.commons.cli.Options options40 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options42 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option46 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean47 = option46.hasOptionalArg();
        int int48 = option46.getArgs();
        boolean boolean49 = option46.hasOptionalArg();
        org.apache.commons.cli.Options options50 = options42.addOption(option46);
        java.util.Collection collection51 = options42.getOptionGroups();
        java.lang.String[] strArray58 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties59 = null;
        org.apache.commons.cli.CommandLine commandLine60 = posixParser41.parse(options42, strArray58, properties59);
        org.apache.commons.cli.CommandLine commandLine62 = posixParser20.parse(options40, strArray58, false);
        posixParser0.setOptions(options40);
        org.apache.commons.cli.Options options64 = posixParser0.getOptions();
        org.apache.commons.cli.Option option68 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean69 = option68.hasOptionalArg();
        org.apache.commons.cli.MissingArgumentException missingArgumentException70 = new org.apache.commons.cli.MissingArgumentException(option68);
        org.apache.commons.cli.Option option74 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean75 = option74.hasOptionalArg();
        int int76 = option74.getArgs();
        option68.setType((java.lang.Object) int76);
        java.lang.String[] strArray78 = option68.getValues();
        java.lang.String str79 = option68.getDescription();
        java.lang.String str80 = option68.getLongOpt();
        org.apache.commons.cli.OptionGroup optionGroup81 = options64.getOptionGroup(option68);
        boolean boolean82 = option68.hasLongOpt();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(commandLine39);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(options50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(commandLine60);
        org.junit.Assert.assertNotNull(commandLine62);
        org.junit.Assert.assertNotNull(options64);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNull(strArray78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertNull(optionGroup81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.CommandLine commandLine20 = posixParser0.cmd;
        java.lang.String[] strArray22 = commandLine20.getOptionValues('4');
        java.util.Properties properties24 = commandLine20.getOptionProperties("org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine20);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(properties24);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        org.apache.commons.cli.PosixParser posixParser3 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean9 = option8.hasOptionalArg();
        int int10 = option8.getArgs();
        boolean boolean11 = option8.hasOptionalArg();
        org.apache.commons.cli.Options options12 = options4.addOption(option8);
        java.util.Collection collection13 = options4.getOptionGroups();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties21 = null;
        org.apache.commons.cli.CommandLine commandLine22 = posixParser3.parse(options4, strArray20, properties21);
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option28 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean29 = option28.hasOptionalArg();
        int int30 = option28.getArgs();
        boolean boolean31 = option28.hasOptionalArg();
        org.apache.commons.cli.Options options32 = options24.addOption(option28);
        java.util.Collection collection33 = options24.getOptionGroups();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties41 = null;
        org.apache.commons.cli.CommandLine commandLine42 = posixParser23.parse(options24, strArray40, properties41);
        java.lang.String[] strArray44 = posixParser0.flatten(options4, strArray40, true);
        posixParser0.burstToken("[ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]", false);
        posixParser0.burstToken("org.apache.commons.cli.MissingArgumentException: Missing argument for option: ", true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(strArray44);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        org.apache.commons.cli.Options options3 = posixParser0.getOptions();
        org.apache.commons.cli.PosixParser posixParser4 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties5 = null;
        posixParser4.processProperties(properties5);
        org.apache.commons.cli.PosixParser posixParser7 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option12 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean13 = option12.hasOptionalArg();
        int int14 = option12.getArgs();
        boolean boolean15 = option12.hasOptionalArg();
        org.apache.commons.cli.Options options16 = options8.addOption(option12);
        java.util.Collection collection17 = options8.getOptionGroups();
        java.lang.String[] strArray24 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties25 = null;
        org.apache.commons.cli.CommandLine commandLine26 = posixParser7.parse(options8, strArray24, properties25);
        org.apache.commons.cli.PosixParser posixParser27 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options28 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option32 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean33 = option32.hasOptionalArg();
        int int34 = option32.getArgs();
        boolean boolean35 = option32.hasOptionalArg();
        org.apache.commons.cli.Options options36 = options28.addOption(option32);
        java.util.Collection collection37 = options28.getOptionGroups();
        java.lang.String[] strArray44 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties45 = null;
        org.apache.commons.cli.CommandLine commandLine46 = posixParser27.parse(options28, strArray44, properties45);
        java.lang.String[] strArray48 = posixParser4.flatten(options8, strArray44, true);
        java.util.List list49 = options8.helpOptions();
        java.util.Collection collection50 = options8.getOptions();
        org.apache.commons.cli.PosixParser posixParser51 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options52 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option56 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean57 = option56.hasOptionalArg();
        int int58 = option56.getArgs();
        boolean boolean59 = option56.hasOptionalArg();
        org.apache.commons.cli.Options options60 = options52.addOption(option56);
        java.util.Collection collection61 = options52.getOptionGroups();
        java.lang.String[] strArray68 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties69 = null;
        org.apache.commons.cli.CommandLine commandLine70 = posixParser51.parse(options52, strArray68, properties69);
        org.apache.commons.cli.Options options71 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser72 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options73 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option77 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean78 = option77.hasOptionalArg();
        int int79 = option77.getArgs();
        boolean boolean80 = option77.hasOptionalArg();
        org.apache.commons.cli.Options options81 = options73.addOption(option77);
        java.util.Collection collection82 = options73.getOptionGroups();
        java.lang.String[] strArray89 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties90 = null;
        org.apache.commons.cli.CommandLine commandLine91 = posixParser72.parse(options73, strArray89, properties90);
        org.apache.commons.cli.CommandLine commandLine93 = posixParser51.parse(options71, strArray89, false);
        org.apache.commons.cli.CommandLine commandLine95 = posixParser0.parse(options8, strArray89, false);
        java.util.Collection collection96 = options8.getOptions();
        java.util.Collection collection97 = options8.getOptions();
        org.junit.Assert.assertNull(options3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(commandLine26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(options36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(commandLine46);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(options60);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(commandLine70);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(options81);
        org.junit.Assert.assertNotNull(collection82);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertNotNull(commandLine91);
        org.junit.Assert.assertNotNull(commandLine93);
        org.junit.Assert.assertNotNull(commandLine95);
        org.junit.Assert.assertNotNull(collection96);
        org.junit.Assert.assertNotNull(collection97);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        commandLine42.addArg("");
        java.lang.String str47 = commandLine42.getOptionValue("hi!", "hi!");
        org.apache.commons.cli.Option[] optionArray48 = commandLine42.getOptions();
        java.lang.Object obj50 = commandLine42.getOptionObject('\000');
        java.util.List list51 = commandLine42.getArgList();
        java.util.List list52 = commandLine42.getArgList();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(optionArray48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertNotNull(list52);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        org.apache.commons.cli.PosixParser posixParser3 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean9 = option8.hasOptionalArg();
        int int10 = option8.getArgs();
        boolean boolean11 = option8.hasOptionalArg();
        org.apache.commons.cli.Options options12 = options4.addOption(option8);
        java.util.Collection collection13 = options4.getOptionGroups();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties21 = null;
        org.apache.commons.cli.CommandLine commandLine22 = posixParser3.parse(options4, strArray20, properties21);
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option28 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean29 = option28.hasOptionalArg();
        int int30 = option28.getArgs();
        boolean boolean31 = option28.hasOptionalArg();
        org.apache.commons.cli.Options options32 = options24.addOption(option28);
        java.util.Collection collection33 = options24.getOptionGroups();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties41 = null;
        org.apache.commons.cli.CommandLine commandLine42 = posixParser23.parse(options24, strArray40, properties41);
        java.lang.String[] strArray44 = posixParser0.flatten(options4, strArray40, true);
        org.apache.commons.cli.CommandLine commandLine45 = posixParser0.cmd;
        org.apache.commons.cli.PosixParser posixParser46 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options47 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option51 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean52 = option51.hasOptionalArg();
        int int53 = option51.getArgs();
        boolean boolean54 = option51.hasOptionalArg();
        org.apache.commons.cli.Options options55 = options47.addOption(option51);
        java.util.Collection collection56 = options47.getOptionGroups();
        java.lang.String[] strArray63 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties64 = null;
        org.apache.commons.cli.CommandLine commandLine65 = posixParser46.parse(options47, strArray63, properties64);
        org.apache.commons.cli.Options options66 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser67 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options68 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option72 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean73 = option72.hasOptionalArg();
        int int74 = option72.getArgs();
        boolean boolean75 = option72.hasOptionalArg();
        org.apache.commons.cli.Options options76 = options68.addOption(option72);
        java.util.Collection collection77 = options68.getOptionGroups();
        java.lang.String[] strArray84 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties85 = null;
        org.apache.commons.cli.CommandLine commandLine86 = posixParser67.parse(options68, strArray84, properties85);
        org.apache.commons.cli.CommandLine commandLine88 = posixParser46.parse(options66, strArray84, false);
        commandLine88.addArg("");
        java.util.Properties properties92 = commandLine88.getOptionProperties("");
        java.lang.Object obj94 = commandLine88.getOptionObject(' ');
        java.lang.Object obj96 = commandLine88.getOptionObject('\000');
        posixParser0.cmd = commandLine88;
        boolean boolean99 = commandLine88.hasOption("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNull(commandLine45);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(options55);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(commandLine65);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(options76);
        org.junit.Assert.assertNotNull(collection77);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertNotNull(commandLine86);
        org.junit.Assert.assertNotNull(commandLine88);
        org.junit.Assert.assertNotNull(properties92);
        org.junit.Assert.assertNull(obj94);
        org.junit.Assert.assertNull(obj96);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        java.lang.String[] strArray44 = commandLine42.getOptionValues('a');
        java.util.Properties properties46 = commandLine42.getOptionProperties("");
        java.lang.String str48 = commandLine42.getOptionValue('#');
        java.lang.String str50 = commandLine42.getOptionValue("org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        commandLine42.addArg("");
        java.lang.String str47 = commandLine42.getOptionValue("hi!", "hi!");
        java.lang.String[] strArray48 = commandLine42.getArgs();
        org.apache.commons.cli.Option[] optionArray49 = commandLine42.getOptions();
        boolean boolean51 = commandLine42.hasOption('a');
        boolean boolean53 = commandLine42.hasOption('\000');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(optionArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        java.lang.String[] strArray44 = commandLine42.getOptionValues('a');
        java.lang.Object obj46 = commandLine42.getOptionObject("");
        java.util.Iterator iterator47 = commandLine42.iterator();
        org.apache.commons.cli.Option option51 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean52 = option51.hasOptionalArg();
        org.apache.commons.cli.MissingArgumentException missingArgumentException53 = new org.apache.commons.cli.MissingArgumentException(option51);
        commandLine42.addOption(option51);
        org.apache.commons.cli.Option[] optionArray55 = commandLine42.getOptions();
        java.lang.Class<?> wildcardClass56 = commandLine42.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(optionArray55);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        commandLine42.addArg("");
        java.util.Properties properties46 = commandLine42.getOptionProperties("");
        boolean boolean48 = commandLine42.hasOption("org.apache.commons.cli.UnrecognizedOptionException: [ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]");
        java.lang.Object obj50 = commandLine42.getOptionObject("[ option:   [ARG] :: hi! ]");
        org.apache.commons.cli.Option[] optionArray51 = commandLine42.getOptions();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(optionArray51);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.PosixParser posixParser20 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options21 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option25 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean26 = option25.hasOptionalArg();
        int int27 = option25.getArgs();
        boolean boolean28 = option25.hasOptionalArg();
        org.apache.commons.cli.Options options29 = options21.addOption(option25);
        java.util.Collection collection30 = options21.getOptionGroups();
        java.lang.String[] strArray37 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties38 = null;
        org.apache.commons.cli.CommandLine commandLine39 = posixParser20.parse(options21, strArray37, properties38);
        org.apache.commons.cli.Options options40 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options42 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option46 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean47 = option46.hasOptionalArg();
        int int48 = option46.getArgs();
        boolean boolean49 = option46.hasOptionalArg();
        org.apache.commons.cli.Options options50 = options42.addOption(option46);
        java.util.Collection collection51 = options42.getOptionGroups();
        java.lang.String[] strArray58 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties59 = null;
        org.apache.commons.cli.CommandLine commandLine60 = posixParser41.parse(options42, strArray58, properties59);
        org.apache.commons.cli.CommandLine commandLine62 = posixParser20.parse(options40, strArray58, false);
        posixParser0.setOptions(options40);
        org.apache.commons.cli.PosixParser posixParser64 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options65 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option69 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean70 = option69.hasOptionalArg();
        int int71 = option69.getArgs();
        boolean boolean72 = option69.hasOptionalArg();
        org.apache.commons.cli.Options options73 = options65.addOption(option69);
        java.util.Collection collection74 = options65.getOptionGroups();
        java.lang.String[] strArray81 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties82 = null;
        org.apache.commons.cli.CommandLine commandLine83 = posixParser64.parse(options65, strArray81, properties82);
        org.apache.commons.cli.CommandLine commandLine84 = posixParser64.cmd;
        java.lang.String str87 = commandLine84.getOptionValue(' ', "[ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]");
        java.util.Properties properties89 = commandLine84.getOptionProperties("org.apache.commons.cli.ParseException: ");
        posixParser0.processProperties(properties89);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(commandLine39);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(options50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(commandLine60);
        org.junit.Assert.assertNotNull(commandLine62);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(options73);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(commandLine83);
        org.junit.Assert.assertNotNull(commandLine84);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "[ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]" + "'", str87, "[ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]");
        org.junit.Assert.assertNotNull(properties89);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        commandLine42.addArg("");
        java.lang.String str47 = commandLine42.getOptionValue("hi!", "hi!");
        org.apache.commons.cli.Option[] optionArray48 = commandLine42.getOptions();
        java.lang.Object obj50 = commandLine42.getOptionObject('\000');
        java.util.List list51 = commandLine42.getArgList();
        boolean boolean53 = commandLine42.hasOption('4');
        java.lang.Object obj55 = commandLine42.getOptionObject('#');
        java.lang.String str58 = commandLine42.getOptionValue(' ', "[ option:   [ARG] :: hi! ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(optionArray48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "[ option:   [ARG] :: hi! ]" + "'", str58, "[ option:   [ARG] :: hi! ]");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.CommandLine commandLine20 = posixParser0.cmd;
        java.lang.String[] strArray22 = commandLine20.getOptionValues('4');
        java.lang.Object obj24 = commandLine20.getOptionObject("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine20);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.CommandLine commandLine20 = posixParser0.cmd;
        java.lang.String str23 = commandLine20.getOptionValue(' ', "[ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]");
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", "org.apache.commons.cli.MissingOptionException: [ option:   [ARG] :: hi! ]");
        commandLine20.addOption(option26);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]" + "'", str23, "[ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.CommandLine commandLine20 = posixParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine21 = posixParser0.cmd;
        org.apache.commons.cli.PosixParser posixParser22 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options23 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option27 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean28 = option27.hasOptionalArg();
        int int29 = option27.getArgs();
        boolean boolean30 = option27.hasOptionalArg();
        org.apache.commons.cli.Options options31 = options23.addOption(option27);
        java.util.Collection collection32 = options23.getOptionGroups();
        java.lang.String[] strArray39 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties40 = null;
        org.apache.commons.cli.CommandLine commandLine41 = posixParser22.parse(options23, strArray39, properties40);
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options43 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option47 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean48 = option47.hasOptionalArg();
        int int49 = option47.getArgs();
        boolean boolean50 = option47.hasOptionalArg();
        org.apache.commons.cli.Options options51 = options43.addOption(option47);
        java.util.Collection collection52 = options43.getOptionGroups();
        java.lang.String[] strArray59 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties60 = null;
        org.apache.commons.cli.CommandLine commandLine61 = posixParser42.parse(options43, strArray59, properties60);
        org.apache.commons.cli.Options options62 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser63 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options64 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option68 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean69 = option68.hasOptionalArg();
        int int70 = option68.getArgs();
        boolean boolean71 = option68.hasOptionalArg();
        org.apache.commons.cli.Options options72 = options64.addOption(option68);
        java.util.Collection collection73 = options64.getOptionGroups();
        java.lang.String[] strArray80 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties81 = null;
        org.apache.commons.cli.CommandLine commandLine82 = posixParser63.parse(options64, strArray80, properties81);
        org.apache.commons.cli.CommandLine commandLine84 = posixParser42.parse(options62, strArray80, false);
        posixParser22.setOptions(options62);
        boolean boolean87 = options62.hasOption("org.apache.commons.cli.UnrecognizedOptionException: [ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]");
        java.lang.String[] strArray88 = null;
        org.apache.commons.cli.CommandLine commandLine90 = posixParser0.parse(options62, strArray88, true);
        java.lang.String[] strArray92 = commandLine90.getOptionValues('a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine20);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(options31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(commandLine41);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(options51);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(commandLine61);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(options72);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(commandLine82);
        org.junit.Assert.assertNotNull(commandLine84);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(commandLine90);
        org.junit.Assert.assertNull(strArray92);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        org.apache.commons.cli.PosixParser posixParser3 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean9 = option8.hasOptionalArg();
        int int10 = option8.getArgs();
        boolean boolean11 = option8.hasOptionalArg();
        org.apache.commons.cli.Options options12 = options4.addOption(option8);
        java.util.Collection collection13 = options4.getOptionGroups();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties21 = null;
        org.apache.commons.cli.CommandLine commandLine22 = posixParser3.parse(options4, strArray20, properties21);
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option28 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean29 = option28.hasOptionalArg();
        int int30 = option28.getArgs();
        boolean boolean31 = option28.hasOptionalArg();
        org.apache.commons.cli.Options options32 = options24.addOption(option28);
        java.util.Collection collection33 = options24.getOptionGroups();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties41 = null;
        org.apache.commons.cli.CommandLine commandLine42 = posixParser23.parse(options24, strArray40, properties41);
        java.lang.String[] strArray44 = posixParser0.flatten(options4, strArray40, true);
        org.apache.commons.cli.PosixParser posixParser45 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options46 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option50 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean51 = option50.hasOptionalArg();
        int int52 = option50.getArgs();
        boolean boolean53 = option50.hasOptionalArg();
        org.apache.commons.cli.Options options54 = options46.addOption(option50);
        java.util.Collection collection55 = options46.getOptionGroups();
        java.lang.String[] strArray62 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties63 = null;
        org.apache.commons.cli.CommandLine commandLine64 = posixParser45.parse(options46, strArray62, properties63);
        org.apache.commons.cli.PosixParser posixParser65 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options66 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option70 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean71 = option70.hasOptionalArg();
        int int72 = option70.getArgs();
        boolean boolean73 = option70.hasOptionalArg();
        org.apache.commons.cli.Options options74 = options66.addOption(option70);
        java.util.Collection collection75 = options66.getOptionGroups();
        java.lang.String[] strArray82 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties83 = null;
        org.apache.commons.cli.CommandLine commandLine84 = posixParser65.parse(options66, strArray82, properties83);
        org.apache.commons.cli.CommandLine commandLine86 = posixParser0.parse(options46, strArray82, false);
        org.apache.commons.cli.CommandLine commandLine87 = posixParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine88 = posixParser0.cmd;
        posixParser0.burstToken("[ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]", false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(options54);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(commandLine64);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(options74);
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(commandLine84);
        org.junit.Assert.assertNotNull(commandLine86);
        org.junit.Assert.assertNotNull(commandLine87);
        org.junit.Assert.assertNotNull(commandLine88);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.CommandLine commandLine20 = posixParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine21 = posixParser0.cmd;
        java.util.List list22 = posixParser0.getRequiredOptions();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine20);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        org.apache.commons.cli.PosixParser posixParser3 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean9 = option8.hasOptionalArg();
        int int10 = option8.getArgs();
        boolean boolean11 = option8.hasOptionalArg();
        org.apache.commons.cli.Options options12 = options4.addOption(option8);
        java.util.Collection collection13 = options4.getOptionGroups();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties21 = null;
        org.apache.commons.cli.CommandLine commandLine22 = posixParser3.parse(options4, strArray20, properties21);
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option28 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean29 = option28.hasOptionalArg();
        int int30 = option28.getArgs();
        boolean boolean31 = option28.hasOptionalArg();
        org.apache.commons.cli.Options options32 = options24.addOption(option28);
        java.util.Collection collection33 = options24.getOptionGroups();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties41 = null;
        org.apache.commons.cli.CommandLine commandLine42 = posixParser23.parse(options24, strArray40, properties41);
        java.lang.String[] strArray44 = posixParser0.flatten(options4, strArray40, true);
        org.apache.commons.cli.PosixParser posixParser45 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options46 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option50 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean51 = option50.hasOptionalArg();
        int int52 = option50.getArgs();
        boolean boolean53 = option50.hasOptionalArg();
        org.apache.commons.cli.Options options54 = options46.addOption(option50);
        java.util.Collection collection55 = options46.getOptionGroups();
        java.lang.String[] strArray62 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties63 = null;
        org.apache.commons.cli.CommandLine commandLine64 = posixParser45.parse(options46, strArray62, properties63);
        org.apache.commons.cli.PosixParser posixParser65 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options66 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option70 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean71 = option70.hasOptionalArg();
        int int72 = option70.getArgs();
        boolean boolean73 = option70.hasOptionalArg();
        org.apache.commons.cli.Options options74 = options66.addOption(option70);
        java.util.Collection collection75 = options66.getOptionGroups();
        java.lang.String[] strArray82 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties83 = null;
        org.apache.commons.cli.CommandLine commandLine84 = posixParser65.parse(options66, strArray82, properties83);
        org.apache.commons.cli.CommandLine commandLine86 = posixParser0.parse(options46, strArray82, false);
        org.apache.commons.cli.CommandLine commandLine87 = posixParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine88 = posixParser0.cmd;
        org.apache.commons.cli.Option[] optionArray89 = commandLine88.getOptions();
        java.util.Iterator iterator90 = commandLine88.iterator();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(options54);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(commandLine64);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(options74);
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(commandLine84);
        org.junit.Assert.assertNotNull(commandLine86);
        org.junit.Assert.assertNotNull(commandLine87);
        org.junit.Assert.assertNotNull(commandLine88);
        org.junit.Assert.assertNotNull(optionArray89);
        org.junit.Assert.assertNotNull(iterator90);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.PosixParser posixParser20 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options21 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option25 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean26 = option25.hasOptionalArg();
        int int27 = option25.getArgs();
        boolean boolean28 = option25.hasOptionalArg();
        org.apache.commons.cli.Options options29 = options21.addOption(option25);
        java.util.Collection collection30 = options21.getOptionGroups();
        java.lang.String[] strArray37 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties38 = null;
        org.apache.commons.cli.CommandLine commandLine39 = posixParser20.parse(options21, strArray37, properties38);
        org.apache.commons.cli.Options options40 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options42 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option46 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean47 = option46.hasOptionalArg();
        int int48 = option46.getArgs();
        boolean boolean49 = option46.hasOptionalArg();
        org.apache.commons.cli.Options options50 = options42.addOption(option46);
        java.util.Collection collection51 = options42.getOptionGroups();
        java.lang.String[] strArray58 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties59 = null;
        org.apache.commons.cli.CommandLine commandLine60 = posixParser41.parse(options42, strArray58, properties59);
        org.apache.commons.cli.CommandLine commandLine62 = posixParser20.parse(options40, strArray58, false);
        posixParser0.setOptions(options40);
        org.apache.commons.cli.Options options64 = posixParser0.getOptions();
        java.util.Collection collection65 = options64.getOptionGroups();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(commandLine39);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(options50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(commandLine60);
        org.junit.Assert.assertNotNull(commandLine62);
        org.junit.Assert.assertNotNull(options64);
        org.junit.Assert.assertNotNull(collection65);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.PosixParser posixParser20 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options21 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option25 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean26 = option25.hasOptionalArg();
        int int27 = option25.getArgs();
        boolean boolean28 = option25.hasOptionalArg();
        org.apache.commons.cli.Options options29 = options21.addOption(option25);
        java.util.Collection collection30 = options21.getOptionGroups();
        java.lang.String[] strArray37 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties38 = null;
        org.apache.commons.cli.CommandLine commandLine39 = posixParser20.parse(options21, strArray37, properties38);
        org.apache.commons.cli.Options options40 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options42 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option46 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean47 = option46.hasOptionalArg();
        int int48 = option46.getArgs();
        boolean boolean49 = option46.hasOptionalArg();
        org.apache.commons.cli.Options options50 = options42.addOption(option46);
        java.util.Collection collection51 = options42.getOptionGroups();
        java.lang.String[] strArray58 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties59 = null;
        org.apache.commons.cli.CommandLine commandLine60 = posixParser41.parse(options42, strArray58, properties59);
        org.apache.commons.cli.CommandLine commandLine62 = posixParser20.parse(options40, strArray58, false);
        posixParser0.setOptions(options40);
        org.apache.commons.cli.Options options64 = posixParser0.getOptions();
        org.apache.commons.cli.Option option68 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean69 = option68.hasOptionalArg();
        org.apache.commons.cli.MissingArgumentException missingArgumentException70 = new org.apache.commons.cli.MissingArgumentException(option68);
        org.apache.commons.cli.Option option74 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean75 = option74.hasOptionalArg();
        int int76 = option74.getArgs();
        option68.setType((java.lang.Object) int76);
        java.lang.String[] strArray78 = option68.getValues();
        java.lang.String str79 = option68.getDescription();
        java.lang.String str80 = option68.getLongOpt();
        org.apache.commons.cli.OptionGroup optionGroup81 = options64.getOptionGroup(option68);
        java.util.Collection collection82 = options64.getOptionGroups();
        boolean boolean84 = options64.hasOption("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(commandLine39);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(options50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(commandLine60);
        org.junit.Assert.assertNotNull(commandLine62);
        org.junit.Assert.assertNotNull(options64);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNull(strArray78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertNull(optionGroup81);
        org.junit.Assert.assertNotNull(collection82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        org.apache.commons.cli.Options options3 = posixParser0.getOptions();
        org.apache.commons.cli.PosixParser posixParser4 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties5 = null;
        posixParser4.processProperties(properties5);
        org.apache.commons.cli.PosixParser posixParser7 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option12 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean13 = option12.hasOptionalArg();
        int int14 = option12.getArgs();
        boolean boolean15 = option12.hasOptionalArg();
        org.apache.commons.cli.Options options16 = options8.addOption(option12);
        java.util.Collection collection17 = options8.getOptionGroups();
        java.lang.String[] strArray24 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties25 = null;
        org.apache.commons.cli.CommandLine commandLine26 = posixParser7.parse(options8, strArray24, properties25);
        org.apache.commons.cli.PosixParser posixParser27 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options28 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option32 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean33 = option32.hasOptionalArg();
        int int34 = option32.getArgs();
        boolean boolean35 = option32.hasOptionalArg();
        org.apache.commons.cli.Options options36 = options28.addOption(option32);
        java.util.Collection collection37 = options28.getOptionGroups();
        java.lang.String[] strArray44 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties45 = null;
        org.apache.commons.cli.CommandLine commandLine46 = posixParser27.parse(options28, strArray44, properties45);
        java.lang.String[] strArray48 = posixParser4.flatten(options8, strArray44, true);
        java.util.List list49 = options8.helpOptions();
        java.util.Collection collection50 = options8.getOptions();
        org.apache.commons.cli.PosixParser posixParser51 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options52 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option56 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean57 = option56.hasOptionalArg();
        int int58 = option56.getArgs();
        boolean boolean59 = option56.hasOptionalArg();
        org.apache.commons.cli.Options options60 = options52.addOption(option56);
        java.util.Collection collection61 = options52.getOptionGroups();
        java.lang.String[] strArray68 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties69 = null;
        org.apache.commons.cli.CommandLine commandLine70 = posixParser51.parse(options52, strArray68, properties69);
        org.apache.commons.cli.Options options71 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser72 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options73 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option77 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean78 = option77.hasOptionalArg();
        int int79 = option77.getArgs();
        boolean boolean80 = option77.hasOptionalArg();
        org.apache.commons.cli.Options options81 = options73.addOption(option77);
        java.util.Collection collection82 = options73.getOptionGroups();
        java.lang.String[] strArray89 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties90 = null;
        org.apache.commons.cli.CommandLine commandLine91 = posixParser72.parse(options73, strArray89, properties90);
        org.apache.commons.cli.CommandLine commandLine93 = posixParser51.parse(options71, strArray89, false);
        org.apache.commons.cli.CommandLine commandLine95 = posixParser0.parse(options8, strArray89, false);
        org.apache.commons.cli.Option option97 = options8.getOption("org.apache.commons.cli.UnrecognizedOptionException: [ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]");
        org.junit.Assert.assertNull(options3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(commandLine26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(options36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(commandLine46);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(options60);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(commandLine70);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(options81);
        org.junit.Assert.assertNotNull(collection82);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertNotNull(commandLine91);
        org.junit.Assert.assertNotNull(commandLine93);
        org.junit.Assert.assertNotNull(commandLine95);
        org.junit.Assert.assertNull(option97);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        org.apache.commons.cli.PosixParser posixParser3 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean9 = option8.hasOptionalArg();
        int int10 = option8.getArgs();
        boolean boolean11 = option8.hasOptionalArg();
        org.apache.commons.cli.Options options12 = options4.addOption(option8);
        java.util.Collection collection13 = options4.getOptionGroups();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties21 = null;
        org.apache.commons.cli.CommandLine commandLine22 = posixParser3.parse(options4, strArray20, properties21);
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option28 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean29 = option28.hasOptionalArg();
        int int30 = option28.getArgs();
        boolean boolean31 = option28.hasOptionalArg();
        org.apache.commons.cli.Options options32 = options24.addOption(option28);
        java.util.Collection collection33 = options24.getOptionGroups();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties41 = null;
        org.apache.commons.cli.CommandLine commandLine42 = posixParser23.parse(options24, strArray40, properties41);
        java.lang.String[] strArray44 = posixParser0.flatten(options4, strArray40, true);
        posixParser0.burstToken("[ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]", false);
        org.apache.commons.cli.PosixParser posixParser48 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options49 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option53 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean54 = option53.hasOptionalArg();
        int int55 = option53.getArgs();
        boolean boolean56 = option53.hasOptionalArg();
        org.apache.commons.cli.Options options57 = options49.addOption(option53);
        java.util.Collection collection58 = options49.getOptionGroups();
        java.lang.String[] strArray65 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties66 = null;
        org.apache.commons.cli.CommandLine commandLine67 = posixParser48.parse(options49, strArray65, properties66);
        java.lang.String str68 = options49.toString();
        org.apache.commons.cli.PosixParser posixParser69 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options70 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option74 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean75 = option74.hasOptionalArg();
        int int76 = option74.getArgs();
        boolean boolean77 = option74.hasOptionalArg();
        org.apache.commons.cli.Options options78 = options70.addOption(option74);
        java.util.Collection collection79 = options70.getOptionGroups();
        java.lang.String[] strArray86 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties87 = null;
        org.apache.commons.cli.CommandLine commandLine88 = posixParser69.parse(options70, strArray86, properties87);
        org.apache.commons.cli.CommandLine commandLine90 = posixParser0.parse(options49, strArray86, true);
        java.util.Iterator iterator91 = commandLine90.iterator();
        java.lang.String[] strArray93 = commandLine90.getOptionValues('\000');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(options57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(commandLine67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "[ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]" + "'", str68, "[ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(options78);
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertNotNull(commandLine88);
        org.junit.Assert.assertNotNull(commandLine90);
        org.junit.Assert.assertNotNull(iterator91);
        org.junit.Assert.assertNull(strArray93);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        org.apache.commons.cli.PosixParser posixParser3 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean9 = option8.hasOptionalArg();
        int int10 = option8.getArgs();
        boolean boolean11 = option8.hasOptionalArg();
        org.apache.commons.cli.Options options12 = options4.addOption(option8);
        java.util.Collection collection13 = options4.getOptionGroups();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties21 = null;
        org.apache.commons.cli.CommandLine commandLine22 = posixParser3.parse(options4, strArray20, properties21);
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option28 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean29 = option28.hasOptionalArg();
        int int30 = option28.getArgs();
        boolean boolean31 = option28.hasOptionalArg();
        org.apache.commons.cli.Options options32 = options24.addOption(option28);
        java.util.Collection collection33 = options24.getOptionGroups();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties41 = null;
        org.apache.commons.cli.CommandLine commandLine42 = posixParser23.parse(options24, strArray40, properties41);
        java.lang.String[] strArray44 = posixParser0.flatten(options4, strArray40, true);
        java.util.List list45 = options4.helpOptions();
        java.util.Collection collection46 = options4.getOptions();
        java.util.Collection collection47 = options4.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options51 = options4.addOption("org.apache.commons.cli.ParseException: ", true, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: opt contains illegal character value '.'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(collection47);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        commandLine42.addArg("");
        java.lang.String str47 = commandLine42.getOptionValue("hi!", "hi!");
        org.apache.commons.cli.Option[] optionArray48 = commandLine42.getOptions();
        java.util.Iterator iterator49 = commandLine42.iterator();
        java.lang.String[] strArray50 = commandLine42.getArgs();
        java.lang.Object obj52 = commandLine42.getOptionObject("");
        java.lang.String str55 = commandLine42.getOptionValue('a', "");
        java.util.List list56 = commandLine42.getArgList();
        java.util.List list57 = commandLine42.getArgList();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(optionArray48);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertNotNull(list57);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.CommandLine commandLine1 = posixParser0.cmd;
        java.util.List list2 = posixParser0.getRequiredOptions();
        org.apache.commons.cli.PosixParser posixParser3 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean9 = option8.hasOptionalArg();
        int int10 = option8.getArgs();
        boolean boolean11 = option8.hasOptionalArg();
        org.apache.commons.cli.Options options12 = options4.addOption(option8);
        java.util.Collection collection13 = options4.getOptionGroups();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties21 = null;
        org.apache.commons.cli.CommandLine commandLine22 = posixParser3.parse(options4, strArray20, properties21);
        org.apache.commons.cli.Options options23 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser24 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options25 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option29 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean30 = option29.hasOptionalArg();
        int int31 = option29.getArgs();
        boolean boolean32 = option29.hasOptionalArg();
        org.apache.commons.cli.Options options33 = options25.addOption(option29);
        java.util.Collection collection34 = options25.getOptionGroups();
        java.lang.String[] strArray41 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties42 = null;
        org.apache.commons.cli.CommandLine commandLine43 = posixParser24.parse(options25, strArray41, properties42);
        org.apache.commons.cli.CommandLine commandLine45 = posixParser3.parse(options23, strArray41, false);
        org.apache.commons.cli.Options options46 = posixParser3.getOptions();
        boolean boolean48 = options46.hasOption("org.apache.commons.cli.ParseException: ");
        posixParser0.setOptions(options46);
        java.util.List list50 = options46.getRequiredOptions();
        org.junit.Assert.assertNull(commandLine1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(options33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(commandLine43);
        org.junit.Assert.assertNotNull(commandLine45);
        org.junit.Assert.assertNotNull(options46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(list50);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.CommandLine commandLine20 = posixParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine21 = posixParser0.cmd;
        org.apache.commons.cli.PosixParser posixParser22 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options23 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option27 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean28 = option27.hasOptionalArg();
        int int29 = option27.getArgs();
        boolean boolean30 = option27.hasOptionalArg();
        org.apache.commons.cli.Options options31 = options23.addOption(option27);
        java.util.Collection collection32 = options23.getOptionGroups();
        java.lang.String[] strArray39 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties40 = null;
        org.apache.commons.cli.CommandLine commandLine41 = posixParser22.parse(options23, strArray39, properties40);
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options43 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option47 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean48 = option47.hasOptionalArg();
        int int49 = option47.getArgs();
        boolean boolean50 = option47.hasOptionalArg();
        org.apache.commons.cli.Options options51 = options43.addOption(option47);
        java.util.Collection collection52 = options43.getOptionGroups();
        java.lang.String[] strArray59 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties60 = null;
        org.apache.commons.cli.CommandLine commandLine61 = posixParser42.parse(options43, strArray59, properties60);
        org.apache.commons.cli.Options options62 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser63 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options64 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option68 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean69 = option68.hasOptionalArg();
        int int70 = option68.getArgs();
        boolean boolean71 = option68.hasOptionalArg();
        org.apache.commons.cli.Options options72 = options64.addOption(option68);
        java.util.Collection collection73 = options64.getOptionGroups();
        java.lang.String[] strArray80 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties81 = null;
        org.apache.commons.cli.CommandLine commandLine82 = posixParser63.parse(options64, strArray80, properties81);
        org.apache.commons.cli.CommandLine commandLine84 = posixParser42.parse(options62, strArray80, false);
        posixParser22.setOptions(options62);
        boolean boolean87 = options62.hasOption("org.apache.commons.cli.UnrecognizedOptionException: [ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]");
        java.lang.String[] strArray88 = null;
        org.apache.commons.cli.CommandLine commandLine90 = posixParser0.parse(options62, strArray88, true);
        java.util.List list91 = options62.helpOptions();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine20);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(options31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(commandLine41);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(options51);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(commandLine61);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(options72);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(commandLine82);
        org.junit.Assert.assertNotNull(commandLine84);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(commandLine90);
        org.junit.Assert.assertNotNull(list91);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        java.lang.String[] strArray44 = commandLine42.getOptionValues('a');
        java.lang.String str47 = commandLine42.getOptionValue('a', "");
        commandLine42.addArg("hi!");
        java.lang.String str52 = commandLine42.getOptionValue("hi!", "");
        java.lang.String str55 = commandLine42.getOptionValue("[ option:   [ARG] :: hi! ]", "org.apache.commons.cli.ParseException: ");
        boolean boolean57 = commandLine42.hasOption('4');
        java.lang.Object obj59 = commandLine42.getOptionObject("[ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]");
        java.lang.String str61 = commandLine42.getOptionValue("org.apache.commons.cli.MissingArgumentException: ");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str55, "org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(str61);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        org.apache.commons.cli.Options options3 = posixParser0.getOptions();
        org.apache.commons.cli.PosixParser posixParser4 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties5 = null;
        posixParser4.processProperties(properties5);
        org.apache.commons.cli.PosixParser posixParser7 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options8 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option12 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean13 = option12.hasOptionalArg();
        int int14 = option12.getArgs();
        boolean boolean15 = option12.hasOptionalArg();
        org.apache.commons.cli.Options options16 = options8.addOption(option12);
        java.util.Collection collection17 = options8.getOptionGroups();
        java.lang.String[] strArray24 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties25 = null;
        org.apache.commons.cli.CommandLine commandLine26 = posixParser7.parse(options8, strArray24, properties25);
        org.apache.commons.cli.PosixParser posixParser27 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options28 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option32 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean33 = option32.hasOptionalArg();
        int int34 = option32.getArgs();
        boolean boolean35 = option32.hasOptionalArg();
        org.apache.commons.cli.Options options36 = options28.addOption(option32);
        java.util.Collection collection37 = options28.getOptionGroups();
        java.lang.String[] strArray44 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties45 = null;
        org.apache.commons.cli.CommandLine commandLine46 = posixParser27.parse(options28, strArray44, properties45);
        java.lang.String[] strArray48 = posixParser4.flatten(options8, strArray44, true);
        java.util.List list49 = options8.helpOptions();
        java.util.Collection collection50 = options8.getOptions();
        org.apache.commons.cli.PosixParser posixParser51 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options52 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option56 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean57 = option56.hasOptionalArg();
        int int58 = option56.getArgs();
        boolean boolean59 = option56.hasOptionalArg();
        org.apache.commons.cli.Options options60 = options52.addOption(option56);
        java.util.Collection collection61 = options52.getOptionGroups();
        java.lang.String[] strArray68 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties69 = null;
        org.apache.commons.cli.CommandLine commandLine70 = posixParser51.parse(options52, strArray68, properties69);
        org.apache.commons.cli.Options options71 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser72 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options73 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option77 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean78 = option77.hasOptionalArg();
        int int79 = option77.getArgs();
        boolean boolean80 = option77.hasOptionalArg();
        org.apache.commons.cli.Options options81 = options73.addOption(option77);
        java.util.Collection collection82 = options73.getOptionGroups();
        java.lang.String[] strArray89 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties90 = null;
        org.apache.commons.cli.CommandLine commandLine91 = posixParser72.parse(options73, strArray89, properties90);
        org.apache.commons.cli.CommandLine commandLine93 = posixParser51.parse(options71, strArray89, false);
        org.apache.commons.cli.CommandLine commandLine95 = posixParser0.parse(options8, strArray89, false);
        posixParser0.checkRequiredOptions();
        java.util.List list97 = posixParser0.getRequiredOptions();
        org.junit.Assert.assertNull(options3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(commandLine26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(options36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(commandLine46);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(options60);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(commandLine70);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(options81);
        org.junit.Assert.assertNotNull(collection82);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertNotNull(commandLine91);
        org.junit.Assert.assertNotNull(commandLine93);
        org.junit.Assert.assertNotNull(commandLine95);
        org.junit.Assert.assertNotNull(list97);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        java.lang.String[] strArray44 = commandLine42.getOptionValues('a');
        java.lang.String str47 = commandLine42.getOptionValue('a', "");
        java.lang.String[] strArray48 = commandLine42.getArgs();
        java.lang.String[] strArray50 = commandLine42.getOptionValues("[ option:   [ARG] :: hi! ]");
        java.lang.String[] strArray51 = commandLine42.getArgs();
        java.lang.String[] strArray53 = commandLine42.getOptionValues('4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNull(strArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNull(strArray53);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        java.lang.String[] strArray44 = commandLine42.getOptionValues('a');
        java.lang.String str47 = commandLine42.getOptionValue('a', "");
        java.lang.String[] strArray48 = commandLine42.getArgs();
        java.lang.String[] strArray50 = commandLine42.getOptionValues("[ option:   [ARG] :: hi! ]");
        java.lang.String[] strArray51 = commandLine42.getArgs();
        java.lang.String str53 = commandLine42.getOptionValue("org.apache.commons.cli.ParseException: ");
        java.lang.Class<?> wildcardClass54 = commandLine42.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNull(strArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        java.lang.String[] strArray44 = commandLine42.getOptionValues('a');
        java.lang.String str47 = commandLine42.getOptionValue('a', "");
        java.lang.String[] strArray48 = commandLine42.getArgs();
        boolean boolean50 = commandLine42.hasOption('\000');
        boolean boolean52 = commandLine42.hasOption('4');
        java.util.Properties properties54 = commandLine42.getOptionProperties("[ option:   [ARG] :: hi! ]");
        boolean boolean56 = commandLine42.hasOption("org.apache.commons.cli.MissingOptionException: Missing required options: ");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(properties54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean27 = option26.hasOptionalArg();
        int int28 = option26.getArgs();
        boolean boolean29 = option26.hasOptionalArg();
        org.apache.commons.cli.Options options30 = options22.addOption(option26);
        java.util.Collection collection31 = options22.getOptionGroups();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser21.parse(options22, strArray38, properties39);
        org.apache.commons.cli.CommandLine commandLine42 = posixParser0.parse(options20, strArray38, false);
        java.lang.String[] strArray44 = commandLine42.getOptionValues('a');
        java.lang.String str47 = commandLine42.getOptionValue('a', "");
        java.lang.String[] strArray48 = commandLine42.getArgs();
        boolean boolean50 = commandLine42.hasOption('\000');
        boolean boolean52 = commandLine42.hasOption('4');
        java.lang.String[] strArray53 = commandLine42.getArgs();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strArray53);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        java.util.Properties properties1 = null;
        posixParser0.processProperties(properties1);
        org.apache.commons.cli.PosixParser posixParser3 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean9 = option8.hasOptionalArg();
        int int10 = option8.getArgs();
        boolean boolean11 = option8.hasOptionalArg();
        org.apache.commons.cli.Options options12 = options4.addOption(option8);
        java.util.Collection collection13 = options4.getOptionGroups();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties21 = null;
        org.apache.commons.cli.CommandLine commandLine22 = posixParser3.parse(options4, strArray20, properties21);
        org.apache.commons.cli.PosixParser posixParser23 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options24 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option28 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean29 = option28.hasOptionalArg();
        int int30 = option28.getArgs();
        boolean boolean31 = option28.hasOptionalArg();
        org.apache.commons.cli.Options options32 = options24.addOption(option28);
        java.util.Collection collection33 = options24.getOptionGroups();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties41 = null;
        org.apache.commons.cli.CommandLine commandLine42 = posixParser23.parse(options24, strArray40, properties41);
        java.lang.String[] strArray44 = posixParser0.flatten(options4, strArray40, true);
        org.apache.commons.cli.Option option48 = new org.apache.commons.cli.Option("", true, "hi!");
        java.lang.String str49 = option48.getKey();
        option48.setRequired(true);
        option48.setLongOpt("");
        boolean boolean54 = option48.hasOptionalArg();
        org.apache.commons.cli.OptionGroup optionGroup55 = options4.getOptionGroup(option48);
        boolean boolean56 = option48.hasArgName();
        boolean boolean57 = option48.isRequired();
        option48.clearValues();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(optionGroup55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", true, "hi!");
        boolean boolean6 = option5.hasOptionalArg();
        int int7 = option5.getArgs();
        boolean boolean8 = option5.hasOptionalArg();
        org.apache.commons.cli.Options options9 = options1.addOption(option5);
        java.util.Collection collection10 = options1.getOptionGroups();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser0.parse(options1, strArray17, properties18);
        org.apache.commons.cli.CommandLine commandLine20 = posixParser0.cmd;
        posixParser0.burstToken("org.apache.commons.cli.UnrecognizedOptionException: [ Options: [ short {=[ option:   [ARG] :: hi! ]} ] [ long {} ]", false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(commandLine20);
    }
}


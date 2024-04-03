import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTestFIND_IN_SORTEDBuggy3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1501");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1502");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1503");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), (int) (short) 1, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, 100, (int) (short) 100);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1504");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 1, (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1505");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, (int) (byte) 1, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1506");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1507");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (short) 10, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, 0, 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1508");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 1, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1509");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1510");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) '4', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1511");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 100, (int) (short) -1, (-1));
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1512");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, 3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1513");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1514");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 100, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1515");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1516");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, 0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        java.lang.Class<?> wildcardClass25 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1517");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 2, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1518");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, 0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 10, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1519");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1520");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1521");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (short) 10, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) 'a', (int) 'a');
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int30 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1522");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        java.lang.Class<?> wildcardClass23 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1523");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1524");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', 100, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1525");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 2, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1526");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1527");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 10, (int) (short) 0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1528");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1529");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 2, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1530");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, 2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1531");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, 2, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1532");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1533");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1534");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1535");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1536");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1537");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1538");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, 10, (int) (short) 10);
        int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 2, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 10, 2, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1539");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1540");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1541");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        java.lang.Class<?> wildcardClass23 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1542");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, 2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1543");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1544");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1545");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1546");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1547");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 2, (int) (byte) 100, (int) (byte) 100);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 1, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1548");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1549");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 100, (int) (byte) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1550");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (byte) 10, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) (short) 1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1551");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1552");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 10, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1553");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1554");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1555");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (short) 0, 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, 10, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 10, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1556");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, 0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 2, (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1557");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1558");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        java.lang.Class<?> wildcardClass23 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1559");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1560");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 10, (int) '#', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1561");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1562");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 100, (int) (short) -1, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1563");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, (int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1564");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1565");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 10, 3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1566");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (short) 0, (int) (byte) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1567");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 0, (int) (byte) 1, 3);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (byte) 1, 0, 3);
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (byte) -1, 0, (int) (byte) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (short) 1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1568");
        int[] intArray4 = new int[] { ' ', (byte) -1, '#', 100 };
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray4, 3, 3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray4, 100, (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, -1, 35, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1569");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1570");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (short) 0, 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, (int) 'a', (int) 'a');
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (-1), (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1571");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 10, (int) (short) -1, (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1572");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1573");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 0, (int) (byte) 1, 3);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1574");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1575");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1576");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', 100, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 100, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1577");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1578");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1579");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1580");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1581");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (short) 0, (int) (byte) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1582");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 100, 3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1583");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 0, (int) (byte) 1, 3);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 100, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1584");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (-1), (-1));
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1585");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1586");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1587");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (short) 0, (int) (byte) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1588");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1589");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, 0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1590");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1591");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 100, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1592");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 1, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1593");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1594");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 1, 3, 3);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1595");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1596");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1597");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1598");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1599");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1600");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1601");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, 2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1602");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 100, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1603");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 0, (int) (byte) 1, 3);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (short) 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (byte) 10, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1604");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1605");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1606");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 0, (int) (byte) 1, 3);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (byte) 1, 0, 3);
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (byte) -1, 0, (int) (byte) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (short) 1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 0, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1607");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), (int) (short) 1, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1608");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1609");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, 0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1610");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, (int) (short) -1, (int) (short) -1);
        java.lang.Class<?> wildcardClass23 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1611");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 2, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1612");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1613");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass23 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1614");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1615");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 0, (int) (byte) 1, 3);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 1);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray4, 0, 1, (int) (byte) 1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int28 = java_programs.FIND_IN_SORTED.binsearch(intArray4, 3, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1616");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1617");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), (int) (short) 0, 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 100, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1618");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1619");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1620");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1621");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1622");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (byte) 100, (int) (byte) 100);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, 10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1623");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1624");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (short) 10, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1625");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1626");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (short) 0, 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, (int) 'a', (int) 'a');
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (-1), (-1));
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1627");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1628");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1629");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1630");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, 0, (int) (short) 0);
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) (short) 1, (int) (short) 1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 2, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1631");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1632");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        java.lang.Class<?> wildcardClass5 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1633");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 10, (int) (short) -1, (int) (short) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 10, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1634");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1635");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1636");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', 2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1637");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 1, (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1638");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 10);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray4, 2, (int) (byte) 1, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray4, 0, (int) (byte) 100, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1639");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (short) 10, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1640");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) ' ', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 100, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1641");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 0, (int) (byte) 1, 3);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 10);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray4, 0, (-1), (-1));
        int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) '#', 2, 2);
        int int30 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (byte) -1, 10, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = java_programs.FIND_IN_SORTED.binsearch(intArray4, 10, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1642");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1643");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1644");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1645");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 1, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1646");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (short) 0, 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (byte) 100, (int) (byte) 100);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, 0, 0);
        int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 1, (int) 'a', (int) 'a');
        java.lang.Class<?> wildcardClass25 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1647");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1648");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (short) 0, (int) (byte) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 1, (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1649");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 1, (int) (short) -1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1650");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1651");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1652");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1653");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1654");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, 1, 1);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1655");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 100, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1656");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1657");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1658");
        int[] intArray3 = new int[] { 3, (byte) 100, '#' };
        int int5 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray3, (int) (short) -1);
        java.lang.Class<?> wildcardClass6 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[3, 100, 35]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1659");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, 0, (int) (short) 0);
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) (short) 1, (int) (short) 1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1660");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 10, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1661");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1662");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 1, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1663");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 10, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1664");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, 0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1665");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 1, 3, 3);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 10, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1666");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1667");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1668");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), (int) (short) 1, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1669");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1670");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1671");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int6 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, (int) (short) 10, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1672");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1673");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1674");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), (-1), (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (byte) -1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1675");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1676");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1677");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1678");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), (int) '#', (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1679");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 1, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1680");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1681");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1682");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1683");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (short) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (byte) -1, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1684");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1685");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1686");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1687");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, 0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1688");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1689");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1690");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 0, (int) (byte) 1, 3);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (short) 1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray4, 10, (int) (short) 1, (int) (byte) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 0);
        java.lang.Class<?> wildcardClass23 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1691");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1692");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int6 = java_programs.FIND_IN_SORTED.binsearch(intArray2, 100, 1, 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray2, 100, (-1), (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 10, 0, 0);
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', (int) (byte) 100, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray2, 10, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1693");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1694");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1695");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, 0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass23 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1696");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) (byte) 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1697");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1698");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1699");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 10);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray4, 2, (int) (byte) 1, 1);
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) -1, (int) (byte) 1, (int) (byte) 1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray4, 100, (int) (short) 1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (byte) 100, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1700");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, 3, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 100, 1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1701");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1702");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, (int) (byte) 10, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1703");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (short) 100, (int) (short) 100);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int28 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int32 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1704");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1705");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (short) 10, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1706");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1707");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, 10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1708");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1709");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (short) 10, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 100, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1710");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 100, (int) (short) 0, (int) (byte) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1711");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', 0, 0);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int28 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        java.lang.Class<?> wildcardClass29 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1712");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (short) 0, 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1713");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1714");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 100, 2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1715");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, 0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1716");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1717");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1718");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, 10, (int) (short) 10);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1719");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1720");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1721");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1722");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) '4', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1723");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1724");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1725");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1726");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1727");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (short) 0, (int) (byte) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int28 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, 3, 3);
        java.lang.Class<?> wildcardClass29 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1728");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (short) 10, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 100, (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1729");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 0, (int) (byte) 1, 3);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) '#', (int) (byte) 0, 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1730");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1731");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, 1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1732");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 10, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1733");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1734");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1735");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1736");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 10, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1737");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 1, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1738");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1739");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 0, (int) (byte) 1, 3);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (byte) 1, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1740");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 100, (int) (short) 0, (int) (short) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1741");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, 0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', (int) '#', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1742");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, 2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1743");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, 10, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) '4', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1744");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', 0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1745");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 1, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1746");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 10, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, 3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1747");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1748");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (short) 0, (int) (byte) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        java.lang.Class<?> wildcardClass23 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1749");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (short) 0, (int) (byte) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1750");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', 0, 0);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (short) 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1751");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1752");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), 3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1753");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1754");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, 0, 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1755");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 100, (int) (byte) 1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1756");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) ' ', (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1757");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1758");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 2, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1759");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (short) 10, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, 0, 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1760");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, 0, 0);
        java.lang.Class<?> wildcardClass23 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1761");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int6 = java_programs.FIND_IN_SORTED.binsearch(intArray2, 100, 1, 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', 1, 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray2, 1, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1762");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int6 = java_programs.FIND_IN_SORTED.binsearch(intArray2, 100, 1, 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray2, 100, (-1), (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray2, 3, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1763");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (byte) 100, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1764");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, 3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1765");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) '#', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1766");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, (int) (byte) 1, 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1767");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (short) 10, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1768");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1769");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1770");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1771");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 0, (int) (byte) 1, 3);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 10);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray4, 0, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (byte) 100, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1772");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 2, (int) (byte) 100, (int) (byte) 100);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, 3, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1773");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (short) 10, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 2, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1774");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, (int) (short) 0, (int) (short) 0);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass27 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1775");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), (int) (short) 1, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1776");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 1, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1777");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 100, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1778");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1779");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1780");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1781");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, 1, (int) (byte) 1);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        java.lang.Class<?> wildcardClass27 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1782");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1783");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        java.lang.Class<?> wildcardClass23 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1784");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1785");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 0, (int) (byte) 1, 3);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (byte) 1, 0, 3);
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (byte) -1, 0, (int) (byte) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (short) 1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (-1), (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1786");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (short) 0, 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (byte) 100, (int) (byte) 100);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 10, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1787");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 10);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray4, 2, (int) (byte) 1, 1);
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) -1, (int) (byte) 1, (int) (byte) 1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray4, 100, (int) (short) 1, (int) (short) -1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 10);
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1788");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1789");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1790");
        int[] intArray0 = null;
        int int4 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 10, (int) ' ', (int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1791");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1792");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1793");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        java.lang.Class<?> wildcardClass23 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1794");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1795");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, (int) (byte) 1, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1796");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), (int) '#', (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1797");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1798");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1799");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1800");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1801");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (short) 10, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 10, (int) (byte) 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1802");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 0, (int) (byte) 1, 3);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) 'a', (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1803");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1804");
        int[] intArray3 = new int[] { (short) 0, (byte) 0, '#' };
        int int5 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray3, (-1));
        int int7 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray3, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int11 = java_programs.FIND_IN_SORTED.binsearch(intArray3, (int) (short) 0, 2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 35]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1805");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, 3, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1806");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', (int) (short) 100, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1807");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (byte) 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1808");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 2, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1809");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1810");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1811");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1812");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (-1), (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1813");
        int[] intArray3 = new int[] { (short) 0, (byte) 0, '#' };
        int int5 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray3, (-1));
        int int7 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray3, (int) (short) -1);
        int int9 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray3, (int) (short) 0);
        int int11 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = java_programs.FIND_IN_SORTED.binsearch(intArray3, (int) (byte) 0, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 35]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1814");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (byte) 10, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 1, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1815");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1816");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        java.lang.Class<?> wildcardClass27 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1817");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, 0, (int) (short) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1818");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1819");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, 0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1820");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (byte) -1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 2, (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1821");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 10);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (byte) 1, (int) (short) -1, (-1));
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray4, 10, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1822");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 100, (int) (short) -1, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1823");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (short) 0, 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1824");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (-1), (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int28 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1825");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', 0, 0);
        java.lang.Class<?> wildcardClass25 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1826");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 0, (int) (byte) 1, 3);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (short) 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 0, (int) '4', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1827");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1828");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (short) 0, 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, (int) 'a', (int) 'a');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 10, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1829");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, 3, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1830");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 100, (int) (byte) -1, (int) (byte) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, 2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1831");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 0, (int) (byte) 1, 3);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 1);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) ' ', 0, 0);
        int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (byte) 10, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = java_programs.FIND_IN_SORTED.binsearch(intArray4, 0, (int) 'a', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1832");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (byte) 0, (int) (short) 1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1833");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1834");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1835");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (short) 0, 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1836");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int6 = java_programs.FIND_IN_SORTED.binsearch(intArray2, 100, 1, 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', 1, 1);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), (int) (byte) 0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray2, 100, (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1837");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass23 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1838");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (short) 0, 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (byte) 100, (int) (byte) 100);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1839");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1840");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1841");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1842");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1843");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', 0, 0);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1844");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1845");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, (int) (byte) 1, 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1846");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1847");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1848");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', (int) (byte) 100, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, 100, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1849");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1850");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (byte) 10, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1851");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1852");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (short) 0, 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1853");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) 'a', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1854");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1855");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1856");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 10, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1857");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1858");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1859");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1860");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (short) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (-1), (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1861");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 10, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1862");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1863");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (byte) 0, 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 1, (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1864");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) (short) 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1865");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 10);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray4, 2, (int) (byte) 1, 1);
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) -1, (int) (byte) 1, (int) (byte) 1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray4, 100, (int) (short) 1, (int) (short) -1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 10);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (short) 0);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int30 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 10, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1866");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1867");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1868");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        java.lang.Class<?> wildcardClass23 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1869");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, 0, (int) (short) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 100, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1870");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1871");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 1, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1872");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int6 = java_programs.FIND_IN_SORTED.binsearch(intArray2, 100, 1, 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', 1, 1);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, (int) (short) 100, (int) (byte) 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1873");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1874");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, 0, (int) (short) 0);
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) (short) 1, (int) (short) 1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 100, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1875");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, 2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1876");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 10, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1877");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1878");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 1, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1879");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        java.lang.Class<?> wildcardClass7 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1880");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, (int) (byte) 1, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        java.lang.Class<?> wildcardClass23 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1881");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, (int) (short) 0, 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 1, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1882");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 100, 1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1883");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1884");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1885");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1886");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1887");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 10, (int) (short) 1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1888");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1889");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, 0, 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1890");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1891");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1892");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1893");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 100, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1894");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1895");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (short) 10, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, 0, 0);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1896");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1897");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', 0, 0);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int28 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        java.lang.Class<?> wildcardClass29 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1898");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (short) 0, 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (byte) 100, (int) (byte) 100);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, 0, 0);
        int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 1, (int) 'a', (int) 'a');
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1899");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1900");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 100, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 2, (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1901");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1902");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1903");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, 2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1904");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', (int) (byte) -1, (int) (byte) -1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 10, 2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1905");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1906");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1907");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1908");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (short) 10, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, 10, 10);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1909");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1910");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 10, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1911");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, 0, 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1912");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int6 = java_programs.FIND_IN_SORTED.binsearch(intArray2, 100, 1, 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 10, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1913");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 2, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 100, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1914");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, 0, 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1915");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1916");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1917");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1918");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1919");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, 0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, 3, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1920");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 2, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1921");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, 0, 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1922");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1923");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1924");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1925");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass23 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1926");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 0, (int) (byte) 1, 3);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (short) 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 10, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1927");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1928");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, (int) (short) 10, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1929");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, 10, (int) (short) 10);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        java.lang.Class<?> wildcardClass23 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1930");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, 0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 10, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1931");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1932");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1933");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), (int) (short) 1, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1934");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1935");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1936");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1937");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1938");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1939");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, 3, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1940");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 100, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1941");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 10, (int) (byte) 0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1942");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (short) 0, 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (byte) 100, (int) (byte) 100);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, 0, 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass25 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1943");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, 0, (int) (short) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int28 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1944");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1945");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 10);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray4, 2, (int) (byte) 1, 1);
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) -1, (int) (byte) 1, (int) (byte) 1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray4, 100, (int) (short) 1, (int) (short) -1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray4, 3, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1946");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (short) 10, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 100, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1947");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 2, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1948");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1949");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1950");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1951");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1952");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1953");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1954");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, 10, (int) (short) 10);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        java.lang.Class<?> wildcardClass25 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1955");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1956");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, (int) (byte) -1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, 3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1957");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 100, 3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1958");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 100, (int) (short) -1, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1959");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1960");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 1, 3, 3);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1961");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), (-1), (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 10, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1962");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 10, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1963");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1964");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1965");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 10);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (byte) 1, (int) (short) -1, (-1));
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 0);
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 10, (int) (short) -1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray4, 0, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1966");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (byte) 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1967");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (short) 0, 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (byte) 100, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1968");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1969");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1970");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 10, 100, 100);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1971");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1972");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 1, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1973");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1974");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, 0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1975");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (short) 0, 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1976");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 1, 10, 10);
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1977");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1978");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1979");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 2, (int) (byte) 100, (int) (byte) 100);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1980");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, (int) (byte) 1, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1981");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, 0, 0);
        int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) (short) 100, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1982");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 10);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray4, 2, (int) (byte) 1, 1);
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) -1, (int) (byte) 1, (int) (byte) 1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (byte) 100, (int) (short) -1, (int) (short) 1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (short) 1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1983");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1984");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1985");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int6 = java_programs.FIND_IN_SORTED.binsearch(intArray2, 100, 1, 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', 1, 1);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, (int) (short) 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1986");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, 0, 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1987");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1988");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1989");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1990");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 10, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1991");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (byte) 10, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1992");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1993");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1994");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, 0, (int) (short) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1995");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 10, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1996");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1997");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1998");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 10, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test1999");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, (int) (byte) -1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestFIND_IN_SORTEDBuggy3.test2000");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }
}


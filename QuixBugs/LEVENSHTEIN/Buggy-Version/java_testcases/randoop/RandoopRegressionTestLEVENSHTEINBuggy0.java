import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTestLEVENSHTEINBuggy0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestLEVENSHTEINBuggy0.test1");
        java_programs.LEVENSHTEIN lEVENSHTEIN0 = new java_programs.LEVENSHTEIN();
        java.lang.Class<?> wildcardClass1 = lEVENSHTEIN0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestLEVENSHTEINBuggy0.test2");
        int int2 = java_programs.LEVENSHTEIN.levenshtein("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestLEVENSHTEINBuggy0.test3");
        int int2 = java_programs.LEVENSHTEIN.levenshtein("hi!", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestLEVENSHTEINBuggy0.test4");
        int int2 = java_programs.LEVENSHTEIN.levenshtein("", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestLEVENSHTEINBuggy0.test5");
        int int2 = java_programs.LEVENSHTEIN.levenshtein("", "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestLEVENSHTEINBuggy0.test6");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}


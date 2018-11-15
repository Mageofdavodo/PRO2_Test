package prefixMetodeTest;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import prefixMetode.Prefix;

public class PrefixTest {

    Prefix pf;

    @Before
    public void setUp() {
        pf = new Prefix();

    }

    @Test
    public void testPrefix() {
        double[] doubleArray = { 5.0, 7.5, 6.666666666666667, 6.5, 6.0, 6.5, 6.714285714285714 };
        int[] inputTal = { 5, 10, 5, 6, 4, 9, 8 };
        assertArrayEquals(doubleArray, pf.prefixAverage(inputTal), 0.0001);
    }

}

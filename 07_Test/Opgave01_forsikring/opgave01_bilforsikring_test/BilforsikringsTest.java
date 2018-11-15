package opgave01_bilforsikring_test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import opgave01_forsikring.Bilforsikring;

public class BilforsikringsTest {
    Bilforsikring bf;

    @Before
    public void setUp() throws Exception {
        bf = new Bilforsikring();
        bf.setGrundpræmie(100);
    }

    @Test
    public void testBeregnPræmie() {
        assertEquals(125, bf.beregnPræmie(24, false, 0), 0.001);
        assertEquals(95, bf.beregnPræmie(25, true, 0), 0.001);
        assertEquals(85, bf.beregnPræmie(25, false, 3), 0.001);
        assertEquals(75, bf.beregnPræmie(25, false, 6), 0.001);
        assertEquals(65, bf.beregnPræmie(29, false, 9), 0.001);

    }

    @Test(expected = RuntimeException.class)
    public void testBergnPræmieExceptions() {
        bf.setGrundpræmie(0);

        assertEquals(125, bf.beregnPræmie(18, false, 0), 0.001);
        assertEquals(125, bf.beregnPræmie(17, false, 0), 0.001);

        bf.setGrundpræmie(100);

        assertEquals(125, bf.beregnPræmie(18, false, 1), 0.001);
        assertEquals(125, bf.beregnPræmie(18, false, -1), 0.001);

    }
}

package nedBørTest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import nedBør.Nedbør;

public class NedbørTest {

    Nedbør nb;

    @Before
    public void setUp() {
        nb = new Nedbør();
    }

    @Test
    public void besteTreFerieUgerTest() {
        assertEquals(30, nb.besteTreFerieUger());
    }

    @Test
    public void bedsteTreFerieUgerStartTest() {
        assertEquals(23, nb.bedsteFerieUgerStart(6));
    }

    @Test
    public void mestEnsNedboerTest() {
        assertEquals(43, nb.mestEnsNedboer());
    }
}

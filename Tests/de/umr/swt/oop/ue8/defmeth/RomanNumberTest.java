package de.umr.swt.oop.ue8.defmeth;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumberTest {

    @Test
    public void toIntValue() {

        RomanNumber rn1 = new RomanNumber(1);
        RomanNumber rn2 = new RomanNumber(3);
        RomanNumber rn3 = new RomanNumber(4);
        RomanNumber rn4 = new RomanNumber(5);
        RomanNumber rn5 = new RomanNumber(174);
        RomanNumber rn6 = new RomanNumber(175);
        RomanNumber rn7 = new RomanNumber(176);
        RomanNumber rn8 = new RomanNumber(0);
        RomanNumber rn9 = new RomanNumber(-1);

        Assert.assertEquals(1, rn1.toIntValue());
        Assert.assertEquals(3, rn2.toIntValue());
        Assert.assertEquals(4, rn3.toIntValue());
        Assert.assertEquals(5, rn4.toIntValue());
        Assert.assertEquals(174, rn5.toIntValue());
        Assert.assertEquals(175, rn6.toIntValue());
        Assert.assertEquals(176, rn7.toIntValue());
        Assert.assertEquals(0, rn8.toIntValue());
        Assert.assertEquals(0, rn9.toIntValue());

    }

    @Test
    public void fromIntValue() {

        RomanNumber rn = new RomanNumber(1);

        rn.fromIntValue(12);
        Assert.assertEquals("XII", rn.num);

        rn.fromIntValue(122);
        Assert.assertEquals("CXXII", rn.num);

        rn.fromIntValue(1337);
        Assert.assertEquals("MCCCXXXVII", rn.num);

        rn.fromIntValue(174);
        Assert.assertEquals("CLXXIV", rn.num);

        rn.fromIntValue(0);
        Assert.assertEquals("", rn.num);

        rn.fromIntValue(-1);
        Assert.assertEquals("", rn.num);

    }
}
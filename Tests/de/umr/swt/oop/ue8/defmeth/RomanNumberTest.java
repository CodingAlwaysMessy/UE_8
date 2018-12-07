package de.umr.swt.oop.ue8.defmeth;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumberTest {

    @Test
    public void toIntValue() {

        RomanNumber rn = new RomanNumber("CLXXVI");

        Assert.assertEquals(
                176,
                rn.toIntValueRight()
        );


    }

    @Test
    public void fromIntValue() {
        // create some roman number
        RomanNumber rn = new RomanNumber("XVXXXI");

        // set new value
        rn.fromIntValue(174);
        // assert new value
        Assert.assertEquals(
                174,
                rn.toIntValue());
    }

    @Test
    public void aTest() {

        RomanNumber rn = new RomanNumber("XIX");

        Assert.assertEquals(
                19,
                rn.toIntValueRight()
        );



    }
}
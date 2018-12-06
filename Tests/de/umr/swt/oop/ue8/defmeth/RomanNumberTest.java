package de.umr.swt.oop.ue8.defmeth;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumberTest {

    @Test
    public void toIntValue() {

        RomanNumber rn = new RomanNumber("XVI");

        Assert.assertEquals(
                16,
                rn.toIntValue()
        );


    }

    @Test
    public void fromIntValue() {
    }

    @Test
    public void aTest() {
        // create some roman number
        RomanNumber rn = new RomanNumber("XVXXXI");

        // set new value
        rn.fromIntValue(16);
        // assert new value
        Assert.assertEquals(
                16,
                rn.toIntValue());


    }
}
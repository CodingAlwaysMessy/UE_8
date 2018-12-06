package de.umr.swt.oop.ue8.defmeth;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumberTest {

    @Test
    public void toIntValue() {

        RomanNumber rn = new RomanNumber("MCCCXXXVII");

        Assert.assertEquals(
                1337,
                rn.toIntValue()
                );



    }

    @Test
    public void fromIntValue() {
    }
}
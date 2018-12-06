package de.umr.swt.oop.ue8.util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {

    @Test
    public void replace() {

    Assert.assertEquals("The very hungry cthulhupillar",
            StringUtil.replace("The very hungry caterpillar", "ater", "thulhu")
    );

    }

    @Test
    public void isPalindrome() {
    }

    @Test
    public void isSorted() {
    }
}
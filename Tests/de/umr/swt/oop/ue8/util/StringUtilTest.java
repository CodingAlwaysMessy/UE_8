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

        Assert.assertEquals("The Adventures of Tom Lawyer",
                StringUtil.replace("The Adventures of Tom Sawyer", "S", "L")
        );

        Assert.assertEquals("Petty Woman",
                StringUtil.replace("Pretty Woman", "r", "")
        );

        Assert.assertEquals("True Grit",
                StringUtil.replace("True Grit", "R", "")
        );
    }

    @Test
    public void isPalindrome() {

        Assert.assertEquals(true,
                StringUtil.isPalindrome("o")
        );

        Assert.assertEquals(true,
                StringUtil.isPalindrome("Ebbe")
        );

        Assert.assertEquals(false,
                StringUtil.isPalindrome("Array")
        );

        Assert.assertEquals(false,
                StringUtil.isPalindrome("Al lets Della call Ed 'Stella'.")
        );
    }

    @Test
    public void isSorted() {

        Assert.assertEquals(true,
                StringUtil.isSorted("bijoux", true));

        Assert.assertEquals(false,
                StringUtil.isSorted("Racecar", true));

        Assert.assertEquals(false,
                StringUtil.isSorted("cbaZYX", false));

        Assert.assertEquals(true,
                StringUtil.isSorted("Spoonfeed", false));




    }
}
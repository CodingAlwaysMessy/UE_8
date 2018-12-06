package de.umr.swt.oop.ue8.util;

public class StringUtil {

    public static String replace(String source, String search, String replace) {

        String temp = "";
        int firstOccurence = 0;

        for (int i = 0; i < source.length(); i++) {

            firstOccurence = source.indexOf(search, i);
            if (firstOccurence == i) {
                // unklar wie bei längeren sequenzen vorgegangen werden soll.


                temp += replace;
                i += replace.length()-1;
            } else {
                temp += source.substring(i, i + 1);
            }
        }


        return temp;
    }

    public static boolean isPalindrome(String string) {

        string = string.toLowerCase();

        String reverse = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            reverse = reverse + string.substring(i, i + 1);
        }

        return string.equals(reverse);

    }

    public static boolean isSorted(String string, boolean ascending) {

        int temp = 0;
        for (int i = 0; i < string.length()-1; i++) {

            temp =string.substring(i, i + 1).compareTo(string.substring(i + 1, i + 2));

            if (ascending & temp > 0) {
                return false;
            } else if (!ascending & temp < 0) {
                return false;
            }
        }

        return true;






    }

}

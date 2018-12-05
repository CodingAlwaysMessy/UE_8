package de.umr.swt.oop.ue8.util;

public class StringUtil {

    public static String replace(String source, String search, String replace) {

        String temp = "";

        for (int i = 0; i < source.length(); i++) {
            String temp2 = "";
            for (int j = 0; j < search.length(); j++) {
                if (source.substring(i, i + 1).equals(search.substring(j, j + 1))) {
                    i = i + j;
                    temp2 += replace.substring(j, j + 1);
                } else {
                    i++;
                    break;
                }
            }

            if (temp2.length() == replace.length()) {
                temp += temp2;
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

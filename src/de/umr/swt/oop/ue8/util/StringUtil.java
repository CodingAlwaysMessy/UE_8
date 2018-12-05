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

}

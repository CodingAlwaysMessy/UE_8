package de.umr.swt.oop.ue8.defmeth;

public class RomanNumber implements Number {

    String num = "";
    char[] romanNumber;

    public RomanNumber(String initial) {
        // cases ergänzen
        this.num = initial;
        romanNumber = this.num.toCharArray();
    }

    /**
     * Getter function for the instance value.
     *
     * @return value of this instance.
     */
    @Override
    public int toIntValue() {

        int sum = 0;
        int currentMax = 0;

        if (romanNumber.length == 1) {
            return getDecimalValue(romanNumber[0]);
        } else if (romanNumber.length == 2) {

            int current = getDecimalValue(romanNumber[1]);
            int next = getDecimalValue(romanNumber[0]);

            if (current >= next) {
                return current - next;
            } else {
                return current + next;
            }
        } else {

            for (int i = 0; i < romanNumber.length; i++) {

                int current = getDecimalValue(romanNumber[i]);
                if (current > currentMax) {
                    currentMax = current;
                }

                int next;
                if (i + 1 < romanNumber.length) {
                    next = getDecimalValue(romanNumber[i + 1]);
                } else {
                    next = current;
                }

                if (current >= next) {
                    sum += current;
                } else {
                    sum -= next;
                }
            }
            return sum;
        }
    }

    /**
     * Setter function for the instance value.
     *
     * @param value value to set this instances value to.
     */
    @Override
    public void fromIntValue(int value) {

        StringBuilder roman = new StringBuilder();

        int[] arr = new int[]{1000, 500, 100, 50, 10, 5, 1};
        int currentMin = arr[0] + 1;

        for (int i = 0; i < arr.length; i++) {
            if (value == 0) {
                break;
            }

            if (value / arr[i] >= 1) {
                for (int j = 1; j <= (int) (value / arr[i]); j++) {
                    roman.append(getRomanValue(arr[i]));
                    value -= arr[i];
                    currentMin = arr[i];
                }
            } else if (currentMin > arr[0]) {

            } else {
                roman.append(getRomanValue(arr[i + 1]));
                value += arr[i + 1];
                i--;
            }
        }
        this.num = roman.toString();
        this.romanNumber = num.toCharArray();
    }

    private char getRomanValue(int decimalNumber) {

        char value;

        switch (decimalNumber) {
            case 1:
                value = 'I';
                break;
            case 5:
                value = 'V';
                break;
            case 10:
                value = 'X';
                break;
            case 50:
                value = 'L';
                break;
            case 100:
                value = 'C';
                break;
            case 500:
                value = 'D';
                break;
            case 1000:
                value = 'M';
                break;
            default:
                value = ' ';
                break;
        }
        return value;
    }

    private int getDecimalValue(char partialNumber) {

        int value = 0;

        switch (partialNumber) {
            case 'I':
                value = 1;
                break;
            case 'V':
                value = 5;
                break;
            case 'X':
                value = 10;
                break;
            case 'L':
                value = 50;
                break;
            case 'C':
                value = 100;
                break;
            case 'D':
                value = 500;
                break;
            case 'M':
                value = 1000;
                break;
            default:
                value = -1;
                break;
        }

        return value;
    }
}

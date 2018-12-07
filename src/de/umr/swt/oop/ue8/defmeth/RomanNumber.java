package de.umr.swt.oop.ue8.defmeth;

public class RomanNumber implements Number {

    String num = "";
    char[] romanNumber;

    public RomanNumber(int number) {
        if (number <= 0) {
            num = "";
        } else {
            fromIntValue(number);
            romanNumber = num.toCharArray();
        }
    }

    /**
     * Getter function for the instance value.
     *
     * @return value of this instance.
     */
    @Override
    public int toIntValue() {

        if (num.equals("")) {
            return 0;
        }

        int currentMaximum = 0;
        int sum = 0;

        for (int i = romanNumber.length - 1; i >= 0; i--) {

            int number = getDecimalValue(romanNumber[i]);

            if (number >= currentMaximum) {
                currentMaximum = number;
                sum += number;
            } else {
                sum -= number;
            }
        }
        return sum;
    }

    /**
     * Setter function for the instance value.
     *
     * @param value value to set this instances value to.
     */
    public void fromIntValue(int value) {

        StringBuilder roman = new StringBuilder();

        int[] arr = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int[] numberSplitted = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            numberSplitted[i] = (int) value / arr[i];
            if (numberSplitted[i] > 0) {
                value -= numberSplitted[i] * arr[i];
            }
        }

        for (int i = 0; i < numberSplitted.length; i++) {
            if (numberSplitted[i] >= 1) {
                for (int j = 0; j < numberSplitted[i]; j++) {
                    roman.append(getRomanValue(arr[i]));
                }
            } else {
                roman.append(getRomanValue(numberSplitted[i]));
            }
        }
        this.num = roman.toString();
    }

    private String getRomanValue(int decimalNumber) {

        String value;

        switch (decimalNumber) {
            case 1:
                value = "I";
                break;
            case 4:
                value = "IV";
                break;
            case 5:
                value = "V";
                break;
            case 9:
                value = "IX";
                break;
            case 10:
                value = "X";
                break;
            case 40:
                value = "XL";
                break;
            case 50:
                value = "L";
                break;
            case 90:
                value = "XC";
                break;
            case 100:
                value = "C";
                break;
            case 400:
                value = "CD";
                break;
            case 500:
                value = "D";
                break;
            case 900:
                value = "CM";
                break;
            case 1000:
                value = "M";
                break;
            default:
                value = "";
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

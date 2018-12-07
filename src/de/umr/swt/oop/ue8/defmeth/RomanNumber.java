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
    @Override
    public void fromIntValue(int value) {

        if (value == 0) {
            this.num = "";
        }

        StringBuilder roman = new StringBuilder();

        int[] arr = new int[]{1000, 500, 100, 50, 10, 5, 1};
        int currentMin = arr[0] + 1;

        for (int i = 0; i < arr.length; i++) { // check all symbols

            if (value == 0) {
                break;
            }

            int passes = value / arr[i];
            if (passes >= 1) { // check if a figure is divisible by arr[i]

                for (int j = 1; j <= (int) (passes); j++) { // iteration for given identical figures
                    roman.append(getRomanValue(arr[i])); // append each figure
                    value -= arr[i]; // reduce value by figures decimal value
                    currentMin = arr[i]; // set current minimum
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

    public int toIntValueRec() {

        return 1;

    }
}

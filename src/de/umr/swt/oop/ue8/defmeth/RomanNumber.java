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

        if (romanNumber.length == 1) { // no further analysis needed
            return getDecimalValue(romanNumber[0]);
        } else if (romanNumber.length == 2) { // easy case, just check if left or right sided

            int current = getDecimalValue(romanNumber[1]);
            int next = getDecimalValue(romanNumber[0]);

            if (current >= next) {
                return current - next;
            } else {
                return current + next;
            }
        } else { // more complex cases

            // setup intermediate variables
            int sum = 0;
            int currentMax = 0;

            for (int i = 0; i < romanNumber.length; i++) { // sequence analysis
                int current = getDecimalValue(romanNumber[i]); // get current figures decimal representation

                int next; // declare variable for next figure
                if (i + 1 < romanNumber.length) { // if within "scope" of number
                    next = getDecimalValue(romanNumber[i + 1]); // get decimal value of next figure
                } else { // no next figure to check for
                    next = current;
                }

                if (current >= next) { // increment sum by current figures decimal value
                    sum += current;
                } else { // reduce sum by next figures decimal value
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
}

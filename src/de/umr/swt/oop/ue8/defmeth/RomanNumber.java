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
            return getValue(romanNumber[0]);
        } else if (romanNumber.length == 2) {

            int current = getValue(romanNumber[1]);
            int next = getValue(romanNumber[0]);

            if (current >= next) {
                return current - next;
            } else {
                return current + next;
            }
        } else {

            for (int i = 0; i < romanNumber.length; i++) {

                int current = getValue(romanNumber[i]);
                if (current > currentMax) {
                    currentMax = current;
                }

                int next;
                if (i + 1 < romanNumber.length) {
                next = getValue(romanNumber[i + 1]);
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

    }

    private int getValue(char partialNumber) {

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
                value = 0;
                break;
        }

        return value;
    }


}

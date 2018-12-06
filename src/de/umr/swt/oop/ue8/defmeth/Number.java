package de.umr.swt.oop.ue8.defmeth;

/**
 * Provides simple arithmetic operations.
 */
public interface Number {

    /**
     * Getter function for the instance value.
     * @return value of this instance.
     */
    int toIntValue();

    /**
     * Setter function for the instance value.
     * @param value value to set this instances value to.
     */
    void fromIntValue(int value);


    /**
     * Simple addition to the instance value.
     * @param number to add with.
     */
    default void add(Number number) {
        this.fromIntValue(number.toIntValue() + this.toIntValue());
    }

    /**
     * Simple subtraction from the instance value.
     * @param number number to subtract with.
     */
    default void subtract(Number number) {
        this.fromIntValue(this.toIntValue() - number.toIntValue());
    }

    /**
     * Simple multiplication with the instance value.
     * @param number number to multiply with.
     */
    default void multiply(Number number) {
        this.fromIntValue(this.toIntValue() * number.toIntValue());
    }

    /**
     * Simple division with the instance value.
     * @param number number to divide by.
     */
    default void divide(Number number) {
        this.fromIntValue(this.toIntValue() / number.toIntValue());
    }





}

package de.umr.swt.oop.ue8.defmeth;

public interface Number {

    int toIntValue();
    void fromIntValue(int value);

    default void add(Number number) {
        this.fromIntValue(number.toIntValue() + this.toIntValue());
    }

    default void subtract(Number number) {
        this.fromIntValue(this.toIntValue() - number.toIntValue());
    }

    default void multiply(Number number) {
        this.fromIntValue(this.toIntValue() * number.toIntValue());
    }

    default void divide(Number number) {
        this.fromIntValue(this.toIntValue() / number.toIntValue());
    }





}

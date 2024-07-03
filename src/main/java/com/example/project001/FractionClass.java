package com.example.project001;

public class FractionClass {
    private final int numerator;
    private final int denominator;

    public FractionClass(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

        if (denominator <= 0) {
            throw new IllegalArgumentException("Invalid denominator: "
                    + denominator);
        }
    }

    public FractionClass add(FractionClass other) {
        int numerator = this.numerator * other.denominator +
                other.numerator * denominator;
        int denominator = this.denominator * other.denominator;
        return new FractionClass(numerator, denominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}

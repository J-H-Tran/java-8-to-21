package com.example.project001;

public record Fraction (int numerator, int denominator) {
    public Fraction add(Fraction other) {
        int numerator = this.numerator * other.denominator +
                other.numerator * this.denominator;
        int denominator = this.denominator * other.denominator;
        
        return new Fraction(numerator, denominator);
    }
}

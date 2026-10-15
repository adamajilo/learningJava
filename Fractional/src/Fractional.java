public class Fractional {
    // Constants
    public static final int DEFAULT_NUMERATOR = 1;
    public static final int DEFAULT_DENOMINATOR = 1;

    // Attributes
    private int numerator;
    private int denominator;

    /**
     * Default constructor: initializes a Fractional object with default values.
     */
    public Fractional() {
        this.numerator = DEFAULT_NUMERATOR;
        this.denominator = DEFAULT_DENOMINATOR;
    }

    /**
     * Non-default constructor: initializes a Fractional object with customized numerator and denominator.
     * If d equals 0, uses DEFAULT_DENOMINATOR (1).
     */
    public Fractional(int n, int d) {
        this.numerator = n;
        if (d == 0) {
            this.denominator = DEFAULT_DENOMINATOR;
        } else {
            this.denominator = d;
        }
    }

    // Accessors
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    // Mutators
    public void setNumerator(int n) {
        this.numerator = n;
    }

    public void setDenominator(int d) {
        if (d != 0) {
            this.denominator = d;
        }
    }

    /**
     * Returns a String representation of the Fractional object in the format: "numerator / denominator"
     */
    public String toString() {
        return numerator + " / " + denominator;
    }

    /**
     * Returns true if and only if this Fractional object and 'that' Fractional object have the same value.
     * Compares values using cross-multiplication (a/b == c/d if a*d == c*b) to avoid floating-point precision issues.
     */
    public boolean equals(Fractional that) {
        if (that == null) {
            return false;
        }
        // Using cross multiplication: (this.numerator / this.denominator) == (that.numerator / that.denominator)
        // is equivalent to: this.numerator * that.denominator == that.numerator * this.denominator
        return (long) this.numerator * that.denominator == (long) that.numerator * this.denominator;
    }

    /**
     * Compares this Fractional object with 'that' Fractional object.
     * Returns a positive integer if this > that,
     * a negative integer if this < that,
     * and 0 if this == that.
     */
    public int compareTo(Fractional that) {
        // Compare using cross multiplication:
        // this / this.denom vs that / that.denom
        // (this.num * that.denom) vs (that.num * this.denom)
        long thisVal = (long) this.numerator * that.denominator;
        long thatVal = (long) that.numerator * this.denominator;
        
        long diff = thisVal - thatVal;
        if (diff > 0) {
            return 1;
        } else if (diff < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
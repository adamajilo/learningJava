// Abiola Adekola / Chase Griffin / Bishop-Adam Ajilogba

public class Fractional {
    
    // Constants
    public static final int DEFAULT_NUMERATOR = 1;
    public static final int DEFAULT_DENOMINATOR = 1;
    
    // Attributes
    private int numerator;
    private int denominator; 
    
    // Constructors
    // Default constructor
    public Fractional() {
        this.numerator = DEFAULT_NUMERATOR;
        this.denominator = DEFAULT_DENOMINATOR;
    }
    
    // Non-default constructor
    public Fractional(int n, int d) {
        this.numerator = n;
        this.denominator = (d == 0) ? DEFAULT_DENOMINATOR : d;
    }
    
    // Accessors
    public int getNumerator() {
        return this.numerator;
    }
    
    public int getDenominator() {
        return this.denominator;
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
    
    // toString
    public String toString() {
        return this.numerator + " / " + this.denominator;
    }
    
    // Equals
    public boolean equals(Fractional that) {
        if (that == null) {
            return false;
        }
        return (long) this.numerator * that.denominator == (long) that.numerator * this.denominator;
    }

    // CompareTo 
    public int compareTo(Fractional that) {
        double first = (double) this.numerator / this.denominator;
        double second = (double) that.numerator / that.denominator;

        if (first > second) {
            return 1;
        } else if (first < second) {
            return -1;
        } else {
            return 0;
        }
    }
}    }
}
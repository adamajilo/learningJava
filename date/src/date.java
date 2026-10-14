package date;

import java .text.DecimalFormat; 

//attributes
private int day;
private int month;
private int year;

//constants
private static final DEFAULT_DAY = 1;
private static final DEFAULT_MONTH = 1;
private static final DEFAULT_YEAR = 2000;

private static final DecimalFormat TWO_DIGIT = new DecimalFormat("00");
private static final DecimalFormat FOUR_DIGIT = new DecimalFormat("0000");

//constructors
//default constructors
public Date() { //always match with class name
    this.day = DEFAULT_DAY;
    this.month = DEFAULT_MONTH;
    this.year = DEFAULT_YEAR;
}
//non-default constructors
public Date(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
}

//accessors
public int getDay() {
    return this.day;
}

public int getMonth() {
    return this.month;
}

public int getYear() {
    return this.year;
}

public static String date(int day, int month, int year) {
    DecimalFormat twodigit = new DecimalFormaf("00")



}
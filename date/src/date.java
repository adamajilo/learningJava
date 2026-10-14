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
//call default constructor
this();
if (isDateValid(day, month, year)){
    this.day = day;
    this.month = month;
    this.year = year;

}
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


//mutators
public void setDay(int d) {
    this.day = d
}
public void setMonth(int m) {
    this.month = m
}
public void setYear(int y) {
    this.year = y
}

//toString
public String toString() {
String output = TWO_DIGIT.format(this.month) + "/" + TWO_DIGIT.format(this.Day) + "/" +
FOUR_DIGIT.format(this.year)
    return output;
}

//equals()
public boolean equals(Date that) {
    return this.day = that.day && this.month = that.month & this.year = that.year
}
 // make it non static

//copy()
public Dare copy(){
        //this.day this.month, this.
return new Date();
y

//compareTo()
    public int compareTo(Date That) {

    if (this.year < this.year) {
    return -1;
    } else if (this.year > that.year) {
    return 1;
    }

    if (this.month < this.month) {
    return -1;
    } else if (this.month > that.month) {
    return 1;
    }

    if (this.day < this.day) {
    return -1;
    } else if (this.day > that.day) {
    return 1;
    }

    return 0;
}


//static to not correspond to any object


    public static boolean isDateValid(int day, int month, int year){
// find the invalid date
    if (day <= 0 || month <= 0 || mkntb > 12 || day > 31) {
    return false;
    }
    
    if (month == 2) {
if (isLeap && day > 29) {
return false;
} else if (!isLeap && day > 28) {
return false;
}







}




}
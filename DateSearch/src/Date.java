
import java.text.DecimalFormat;

public class Date implements Comparable<Date>{

	// attributes
	private int day;
	private int month;
	private int year;

	// constants
	private static final int DEFAULT_DAY = 1;
	private static final int DEFAULT_MONTH = 1;
	private static final int DEFAULT_YEAR = 2000;

	private static final DecimalFormat TWO_DIGIT = new DecimalFormat("00");
	private static final DecimalFormat FOUR_DIGIT = new DecimalFormat("0000");

	// constructors
	// default constructor
	public Date() {
		this.day = DEFAULT_DAY;
		this.month = DEFAULT_MONTH;
		this.year = DEFAULT_YEAR;
	}

	// non-default constructors
	public Date(int day, int month, int year) {
		//call default constructor
		this();
		
		if (isDateValid(day, month, year)) {
			this.day = day;
			this.month = month;
			this.year = year;
		} 
		
	}

	// accessors
	public int getDay() {
		return this.day;
	}

	public int getMonth() {
		return this.month;
	}

	public int getYear() {
		return this.year;
	}

	// mutators
	public void setDay(int d) {
		this.day = d;
	}

	public void setMonth(int m) {
		this.month = m;
	}

	public void setYear(int y) {
		this.year = y;
	}

	// toString()
	public String toString() {
		String output = TWO_DIGIT.format(this.month)+ "/" + TWO_DIGIT.format(this.day)  + "/" + 
				FOUR_DIGIT.format(this.year);
		return output;
		
	}
	
	//equals()
	public boolean equals(Date that) {
		return this.day == that.day && this.month == that.month && this.year == that.year;
	}
	
	//copy()
	public Date copy() {
		//this.day	this.month	this.year
		return new Date(this.day, this.month, this.year);
	}
	
	//compareTo()
	public int compareTo(Date that) {
		
		if (this.year < that.year) {
			return -1;
		} else if (this.year > that.year) {
			return 1;
		} 
		
		//if we reach here, years are the same
		if (this.month < that.month) {
			return -1;
		} else if (this.month > that.month) {
			return 1;
		}
		
		//if we reach here, years and month are both the same
		if (this.day < that.day) {
			return -1;
		} else if (this.day > that.day) {
			return 1;
		}
		
		//if we reach here, year, month, and day are all the same
		return 0;
		
	}
	
	//other functions
	public static boolean isDateValid(int day,int month,int year)  {
		
		//find out all the invalid dates
		if(day <= 0 || month <= 0 || month > 12 || day > 31) {
			return false;
		}
		
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day > 30) {
				return false;
			}
		}
		
		boolean isLeap = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
		
		if (month == 2) {
			if (isLeap && day > 29) {
				return false;
			} else if(!isLeap && day >28) {
				return false;
			}
		}
		
		return true;
	}
	
	//the updated tomorrow function
	public Date tomorrow() {
		//we assume the corresponding Date is always a date
		
		if (this.day <= 27) {
			return new Date (this.day + 1, this.month, this.year);
		}
		
		if (month == 4 || month == 6 || month == 9 || month == 11) {

			if (day <= 29) {
				return new Date (this.day + 1, this.month, this.year);
			} else {
				return new Date (1, this.month+1, this.year);
			}

		}

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {

			if (day <= 30) {
				return new Date (this.day + 1, this.month, this.year);
			} else if (month == 12) {
				return new Date (1, 1, this.year + 1);
			} else {
				return new Date (1, this.month + 1, this.year);
			}

		}

		boolean isLeap = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);

		if (month == 2) {
			if (isLeap && day == 28) {
				return new Date (this.day + 1, this.month, this.year);
			} else {
				return new Date (1, this.month + 1, this.year);
			}

		}
		
		//we won't reach here if the conrresponding date is not valid.
		return new Date();
		
	}


}

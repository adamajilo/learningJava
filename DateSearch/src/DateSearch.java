//Bishop-Adam Ajilogba, Abiola Adekola, Chase Griffin

import java.util.*;

public class DateSearch {

	// linear search
	public static int linearSearch(Date[] dateArr, Date target) {
		for (int i = 0; i < dateArr.length; i++) {
			if (dateArr[i].equals(target)) {
				return i;
			}
		}
		return -1;
	}

	// binary search
	public static int binarySearch(Date[] dateArr, Date target) {
		int low = 0;
		int high = dateArr.length - 1;

		while (low <= high) {

			int mid = low + (high - low) / 2;
			if (dateArr[mid].equals(target)) {
				return mid;
			} else if (dateArr[mid].compareTo(target) < 0) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	///////////////////////////////////////////////////
	// Please don't change anything in the main function //
	///////////////////////////////////////////////////

	public static void main(String[] args) {

		Random myRandom = new Random(123456);
		Date[] dates = new Date[2000];

		for (int i = 0; i < 2000; i++) {
			dates[i] = new Date(myRandom.nextInt(32), myRandom.nextInt(13), myRandom.nextInt(2026));
		}

		System.out.println("Test 1 - linear search 1");
		Date target1 = new Date(myRandom.nextInt(32), myRandom.nextInt(13), myRandom.nextInt(2026));
		int index1 = linearSearch(dates, target1);
		System.out.println("EXPECTED RESULT: -1");
		System.out.println("YOUR RESULT: " + index1);
		System.out.println("**************************************************");

		System.out.println("Test 2 - linear search 2");
		Date target2 = dates[999].copy();
		int index2 = linearSearch(dates, target2);
		System.out.println("EXPECTED RESULT: 999");
		System.out.println("YOUR RESULT: " + index2);
		System.out.println("**************************************************");

		System.out.println("Test 3 - linear search 3");
		Date target3 = dates[1999].copy();
		int index3 = linearSearch(dates, target3);
		System.out.println("EXPECTED RESULT: 0");
		System.out.println("YOUR RESULT: " + index3);
		System.out.println("**************************************************");

		Arrays.sort(dates);

		System.out.println("Test 4 - binary search 1");
		Date target4 = target3;
		int index4 = binarySearch(dates, target4);
		System.out.println("EXPECTED RESULT: 1749");
		System.out.println("YOUR RESULT: " + index4);
		System.out.println("**************************************************");

		System.out.println("Test 5 - binary search 2");
		Date target5 = target2;
		int index5 = binarySearch(dates, target5);
		System.out.println("EXPECTED RESULT: 1389");
		System.out.println("YOUR RESULT: " + index5);
		System.out.println("**************************************************");

		System.out.println("Test 6 - binary search 3");
		Date target6 = target1;
		int index6 = binarySearch(dates, target6);
		System.out.println("EXPECTED RESULT: -1");
		System.out.println("YOUR RESULT: " + index6);
		System.out.println("**************************************************");

		System.out.println("Test 7 - binary search 4");
		Date target7 = new Date();
		int index7 = binarySearch(dates, target7);
		System.out.println("EXPECTED RESULT: 1749");
		System.out.println("YOUR RESULT: " + index7);
		System.out.println("**************************************************");

		System.out.println("Test 8 - binary search 4");
		Date target8 = dates[dates.length - 1].copy();
		int index8 = binarySearch(dates, target8);
		System.out.println("EXPECTED RESULT: 1999");
		System.out.println("YOUR RESULT: " + index8);
		System.out.println("**************************************************");

	}

}

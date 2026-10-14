public class FractionalClient {

	public static void main(String[] args) {
		
		System.out.println("Test 1 - default constructor and toString");
		Fractional f1 = new Fractional();
		System.out.println("EXPECTED RESULT: 1/1");
		System.out.println("YOUR RESULT: "+f1);
		System.out.println("**************************************************");
		
		System.out.println("Test 2 - non-default constructor");
		Fractional f2 = new Fractional(2, 0);
		System.out.println("EXPECTED RESULT: 2/1");
		System.out.println("YOUR RESULT: "+f2);
		System.out.println("**************************************************");
		
		System.out.println("Test 3 - accessors");
		int d3 = f1.getNumerator(), n3 = f1.getNumerator();
		System.out.println("EXPECTED RESULT: 1 and 1");
		System.out.println("YOUR RESULT: "+ d3 + " and " + n3);
		System.out.println("**************************************************");
		
		System.out.println("Test 4 - mutators");
		f2.setNumerator(4);
		f2.setDenominator(4);
		System.out.println("EXPECTED RESULT: 4/4");
		System.out.println("YOUR RESULT: "+ f2);
		System.out.println("**************************************************");
		
		System.out.println("Test 5 - mutators");
		f2.setDenominator(0);
		System.out.println("EXPECTED RESULT: 4/4");
		System.out.println("YOUR RESULT: "+ f2);
		System.out.println("**************************************************");
		
		System.out.println("Test 6 - equals");
		boolean b5 = f1.equals(f2);
		System.out.println("EXPECTED RESULT: true");
		System.out.println("YOUR RESULT: "+ b5);
		System.out.println("**************************************************");
		
		System.out.println("Test 7 - compareTo");
		Fractional f3 = new Fractional(-2, 5);
		boolean b6 = f3.compareTo(f1) < 0;
		System.out.println("EXPECTED RESULT: true");
		System.out.println("YOUR RESULT: "+ b6);
		System.out.println("**************************************************");
		
		System.out.println("Test 8 - compareTo");
		Fractional f4 = new Fractional(-1, 2);
		boolean b8 = f3.compareTo(f4) > 0;
		System.out.println("EXPECTED RESULT: true");
		System.out.println("YOUR RESULT: "+ b8);
		System.out.println("**************************************************");
		
	}

}
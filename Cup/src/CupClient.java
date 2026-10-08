
public class CupClient {

	public static void main(String[] args) {

		System.out.println("Let's create two cups.");
		
		Cup c1 = new Cup();
		Cup c2 = new Cup("white", 12);
		
		System.out.println("The first cup, c1, has the following features:");
		System.out.println(c1);
		
		System.out.println("The second cup, c2, has the following features:");
		System.out.println(c2);
		
		System.out.println();
		String s0 = "Do these two cups have the same features? The answer is ";
		s0 += (c1.equals(c2))? "yes.": "no.";
		System.out.println(s0);
		
		System.out.println("What features does the larger cup has? " + Cup.larger(c1, c2)  +".");
		
		System.out.println();
		System.out.println("Let's create the third cups.");
	
		Cup c3 = new Cup("yellow", 15);
		System.out.println("The second cup, c3, has the following features:");
		System.out.println(c3);
		
		System.out.println();
		String s1 = "Do cups c1 and c3 have the same features? The answer is ";
		s1 += (c1.equals(c3))? "yes.": "no.";
		System.out.println(s1);
		
		System.out.println("What features does the larger cup between c1 and c3 has? " + Cup.larger(c1, c3)  +".");
		
		
		
		
	}

}

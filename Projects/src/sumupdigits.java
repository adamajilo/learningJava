package nugget;
import java.util.Scanner;

public class SumUpDigits {

	public static void main(String[] args) {
		Scanner sumUp = new Scanner(System.in);
		
		System.out.println("Please enter a non-negative integer");
		int n = sumUp.nextInt();
		System.out.println("Sum of  digits: " + sumUp(n));
		
		sumUp.close();
	
	}
	
		private static int sumUp (int n) {
		int sum = 0;
		while (n>0) {
			sum += n % 10;
			n /= 10;
			
		}	
		
		return sum;
		}
}
		
		//Abiola Adekola | Chase Griffin | Bishop-Adam Ajilogba

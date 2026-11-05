//Answer Key
//Bishop-Adam Ajilogba, Abiola Adekola, Chase Griffin
package coins;

class Coin {
	private int value;

	public Coin(int value) {
		if (value == 1 || value == 5 || value == 10 || value == 25) {
			this.value = value;
		} else {
			this.value = 0;
		}
	}

	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "" + value;
	}
}

public class CoinClient {
	
	///////////////////////////////////////////////////////
	//         Please implement these two functions        //
	///////////////////////////////////////////////////////
	
	public static int totalValue(Coin[] coins) {
		int sum = 0;
		if (coins != null) {
			for (Coin coin : coins) {
				if (coin != null) {
					sum += coin.getValue();
				}
			}
		}
		return sum;
	}
	
	public static Coin[] makeChange(int total) {
		// Calculate the number of each coin needed using standard greedy approach
		int numQuarters = total / 25;
		int remainder = total % 25;
		
		int numDimes = remainder / 10;
		remainder %= 10;
		
		int numNickels = remainder / 5;
		remainder %= 5;
		
		int numCents = remainder;
		
		// Determine total number of coins for array length
		int totalCoins = numQuarters + numDimes + numNickels + numCents;
		Coin[] change = new Coin[totalCoins];
		
		int index = 0;
		// Populate the array with the respective Coin objects
		for (int i = 0; i < numQuarters; i++) {
			change[index++] = new Coin(25);
		}
		for (int i = 0; i < numDimes; i++) {
			change[index++] = new Coin(10);
		}
		for (int i = 0; i < numNickels; i++) {
			change[index++] = new Coin(5);
		}
		for (int i = 0; i < numCents; i++) {
			change[index++] = new Coin(1);
		}
		
		return change;
	}
	
	

	///////////////////////////////////////////////////////
	// Please don't change anything in the main function //
	///////////////////////////////////////////////////////

	public static void main(String[] args) {
		
		Coin c1 = new Coin(1);	//
		Coin c2 = new Coin(5);
		Coin c3 = new Coin(10);
		Coin c4 = new Coin(25);
		Coin c5 = new Coin(13);	//invalid coin
		
		System.out.println("Test 1 - totalValue 1");
		Coin [] coins1 = new Coin[0];
		int s1 = CoinClient.totalValue(coins1);
		System.out.println("There are no coins, the total value should be 0.");
		System.out.println("EXPECTED RESULT: 0");
		System.out.println("YOUR RESULT: " + s1);
		System.out.println("**************************************************");
		
		System.out.println("Test 2 - totalValue 2");
		Coin [] coins2 = {c1, c2, c1, c3, c2, c4, c1, c5};
		int s2 = CoinClient.totalValue(coins2);
		System.out.println("There are three cents, two nickels, one dime, one quarter and one valueless coin.");
		System.out.println("EXPECTED RESULT: 48");
		System.out.println("YOUR RESULT: " + s2);
		System.out.println("**************************************************");

		System.out.println("Test 3 - makeChange 1");
		int total1 = 50;
		Coin[] change1 = CoinClient.makeChange(total1);
		System.out.println("To represent 50 cents, we need to use two quarters.");
		System.out.println("EXPECTED NUMBER OF COINS: 2");
		System.out.println("YOUR RESULT: " + change1.length);
		System.out.println("THE COINS YOU USED ARE:");
		for (Coin a : change1) {
			System.out.print(" " + a);
		}
		System.out.println();
		System.out.println("**************************************************");

		System.out.println("Test 4 - makeChange 2");
		int total2 = 74;
		Coin[] change2 = CoinClient.makeChange(total2);
		System.out.println("To represent 74 cents, we need to use two quarters, two dimes and four cents.");
		System.out.println("EXPECTED NUMBER OF COINS: 8");
		System.out.println("YOUR RESULT: " + change2.length);
		System.out.println("THE COINS YOU USED ARE:");
		for (Coin a : change2) {
			System.out.print(" " + a);
		}
		System.out.println();
		System.out.println("**************************************************");

		System.out.println("Test 5 - totalValue 3");
		int s3 = CoinClient.totalValue(change2);
		System.out.println("In Test 4, we used two quarters, two dimes and four cents.");
		System.out.println("EXPECTED RESULT: 74");
		System.out.println("YOUR RESULT: " + s3);
		System.out.println("**************************************************");

		System.out.println("Test 6 - makeChange 3");
		int total3 = 30;
		Coin[] change3 = CoinClient.makeChange(total3);
		System.out.println("To represent 30 cents, we need to use a quarter and a nickel.");
		System.out.println("EXPECTED NUMBER OF COINS: 2");
		System.out.println("YOUR RESULT: " + change3.length);
		System.out.println("THE COINS YOU USED ARE:");
		for (Coin a : change3) {
			System.out.print(" " + a);
		}
		System.out.println();
		System.out.println("**************************************************");
		
		System.out.println("Test 7 - makeChange 4");
		int total4 = 0;
		Coin[] change4 = CoinClient.makeChange(total4);
		System.out.println("We need no coins to represent 0 cents.");
		System.out.println("EXPECTED NUMBER OF COINS: 0");
		System.out.println("YOUR RESULT: " + change4.length);
		System.out.println("THE COINS YOU USED ARE:");
		for (Coin a : change4) {
			System.out.print(" " + a);
		}
		System.out.println();
		System.out.println("**************************************************");

	}

}
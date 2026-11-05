package coins;

public class Coin {

	private String name;
	private int value;

	public Coin(int value) {
		if (value == 1) {
			this.name = "cent";
			this.value = 1;
		} else if (value == 5) {
			this.name = "nickel";
			this.value = 5;
		} else if (value == 10) {
			this.name = "dime";
			this.value = 10;
		} else if (value == 25) {
			this.name = "quarter";
			this.value = 25;
		} else {
			this.name = "INVALID COIN";
			this.value = 0;
		}
	}
	
	public int getValue() {
		return this.value;
	}

	public String toString() {
		return "(" + this.name + ")";
	}
}

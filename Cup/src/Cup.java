
public class Cup {

	//Attributes
	private String color;
	private int size;

	//Constants
	public final static String DEFAULT_COLOR = "white";
	public final static int DEFAULT_SIZE = 12;

	//Constructor functions
	public Cup() {
		color = DEFAULT_COLOR;
		size = DEFAULT_SIZE;
	}

	////////////////////////////////////////////
	////	Finish the following functions	//// 
	////////////////////////////////////////////
	
	public Cup(String c, int s){
		color = c;
		size = s;
	}

	public String toString() {
		return "The color is " + color + " and the size is " + size + "oz";
	}

	public boolean equals(Cup that){
		boolean output = this.color.equals(that.color) && this.size == that.size;
		return output;
	}
	
	public static Cup larger(Cup c1, Cup c2){
		return c1.size>=c2.size ? c1 : c2;
	}

}
//Chase Griffin, Bishop-Adam Ajilogba, and Abiola Adekola
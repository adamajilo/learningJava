
public class MyVector {

	private int[] vector;

	public MyVector() {
		vector = new int[0];
	}

	public MyVector(int [] d) {
		vector = new int[d.length];
		for (int i = 0; i < d.length; i++) { // deep copy of array d
			vector[i] = d[i];
		}
	}

	// public int[] getVector()
public int[] getVector() {
	int temp_Vector = new int[d.length];
	for (int i = 0; i < temp_Vector; i++) {
			temp_Vector[i] = d[i];
			 return temp_Vector;
}

	
}

	// public String toString()
  public String toString() {
		for (){

 }
	
  }

	// public MyVector add(MyVector that)

	// public int dotProduct(MyVector that)
	
	
	
	
	///////////////////////////////////////////////////////
	// Please don't change anything in the main function //
	///////////////////////////////////////////////////////

	public static void main(String[] args) {

		System.out.println("First, let's test toString method:");

		int[] arr1 = { 1, 3, 5 };
		int[] arr2 = { -1, -3, -5 };
		int[] arr3 = { 1, 2, 3, 4 };
		int[] arr4 = { 1, 1, 1, 1 };

		MyVector v1 = new MyVector(arr1);
		MyVector v2 = new MyVector(arr2);
		MyVector v3 = new MyVector(arr3);
		MyVector v4 = new MyVector(arr4);
		MyVector v5 = new MyVector();

		System.out.println(v1); // print <1,3,5>
		System.out.println(v2); // print <-1,-3,-5>
		System.out.println(v3); // print <1,2,3,4>
		System.out.println(v4); // print <1,1,1,1>
		System.out.println(v5); // print <>

		System.out.println();
		System.out.println("********************************************************");
		System.out.println();
		System.out.println("Then, let's test whether deep copy is used in the getVector method:");

		int[] copyArray = v3.getVector();
		for (int i = 0; i < copyArray.length; i++) {
			copyArray[i] = Integer.MAX_VALUE;
		}
		System.out.println(v3); // print <1,2,3,4>

		System.out.println();
		System.out.println("********************************************************");
		System.out.println();
		System.out.println("Next, let's test the add method:");

		System.out.println(v1 + "+" + v2 + " = " + v1.add(v2)); // print <0,0,0>
		System.out.println(v2 + "+" + v1 + " = " + v2.add(v1)); // print <0,0,0>
		System.out.println(v1 + "+" + v3 + " = " + v1.add(v3)); // print <>
		System.out.println(v3 + "+" + v4 + " = " + v3.add(v4)); // print <2,3,4,5>
		System.out.println(v3 + "+" + v3 + " = " + v3.add(v3)); // print <2,4,6,8>
		System.out.println(v4 + "+" + v1 + " = " + v4.add(v1)); // print <>

		System.out.println();
		System.out.println("********************************************************");
		System.out.println();
		System.out.println("Last, let's test the dotProduct method:");

		System.out.println(v1 + "." + v2 + " = " + v1.dotProduct(v2)); // print -35
		System.out.println(v2 + "." + v1 + " = " + v2.dotProduct(v1)); // print -35
		System.out.println(v2 + "." + v3 + " = " + v2.dotProduct(v3)); // print -2147483648
		System.out.println(v4 + "." + v3 + " = " + v4.dotProduct(v3)); // print 10
		System.out.println(v3 + "." + v3 + " = " + v3.dotProduct(v3)); // print 30
		System.out.println(v4 + "." + v1 + " = " + v4.dotProduct(v1)); // print -2147483648

	}

}
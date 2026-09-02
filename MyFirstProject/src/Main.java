public class Main {

    public static void main(String[] args){

        // THIS IS MY FIRST JAVA PROGRAM

        /*
        This
        is
        a 
        multiline
        comment
         */
        //Primitive Data Types
        int age = 20;
        double price = 6;
        char grade = 'B';
        boolean isStudent = true;
        boolean forSale = false;
        //Reference Data Types
        String name = "Adam Smith";

        System.out.print("I like Pizza!\n");
        System.out.print("It's really good!\n");
        System.out.print("Buy me Pizza!\n");

        System.out.println("I am " + age + " years old.");
        System.out.println("$" + price);
        System.out.println("My grade is " + grade);
        //System.out.println("I am a student: " + isStudent);
        System.out.println("The item is for sale: " + forSale); 
       
        System.out.println("My name is " + name);

        if(isStudent){
            System.out.println("You are a student.");
        }
        else{
            System.out.println("You are NOT a student!");
        }
    }
}

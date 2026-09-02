//import java.util.Scanner;

import java.util.Scanner;

public class userinput {
    public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.print("Enter your name: ");
 String name = scanner.nextLine();

 System.out.print("Enter your age: ");
 int age = scanner.nextInt();

 System.out.print("What is your gpa: ");
 double gpa = scanner.nextDouble();

 System.out.print("Are you a student? (true/false): ");
 boolean isStudent = scanner.nextBoolean();
//removing print-ln- will keep the input on the same line as the prompt

 System.out.println("Hello " + name + "!");

 System.out.println("You are " + age + " years old.");
 if(age >= 18){
     System.out.println("You are an adult.");
 }
 else{
     System.out.println("You are a minor.");
 }

 System.out.println("Your gpa is: " + gpa);
 System.out.println("Student: " + isStudent);
if(isStudent){
     System.out.println("You are enroled as a student.");
 }
 else{
     System.out.println("You are NOT enroled.");
 }

  
  

scanner.close(); 

    }
}

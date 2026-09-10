
import java.util.Scanner;

public class consonantcounter {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner consonant = new Scanner(System.in);

        System.out.println("Please enter some text in the console:");

        String text = consonant.nextLine();

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
                    count++;
                }

            }

        }
        System.out.println("There are " + count + " consonants in the text you entered.");

        consonant.close();
    }
}
//Bishop-Adam Ajilogba, Abiola Adekola, Chase Griffin


package book.src;
public class bookClient {
public static void main(String[] args) {
    book b1 = new book();
    book b2 = new book(book.DEFAULT_TITLE, book.DEFAULT_AUTHOR, book.DEFAULT_PRICE);
    System.out.println(b1 == b2);

    book b3 = new book("Let us Java", "Yashavant", 39.99);
    System.out.println(b1.getPrice());

    b3.setAuthor("Yashavant Kanetkar");
    System.out.println(b3.getAuthor());

    book b4; //b4 is a shallow copy of b3
    b4 = b3;

    System.out.println(b3 ==b4);
     System.out.println(b3.equals(b4));


    }
}

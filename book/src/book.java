package book.src;
public class book {


    //attributes
    private String title;
    private String author;
    private double price;

    //constant
    static final String DEFAULT_TITLE = "No Name";
    static final String DEFAULT_AUTHOR = "No Name";
    static final double DEFAULT_PRICE = 20;

    //constructors
    //default constructor
    public book() {
        title = DEFAULT_TITLE;
        author = DEFAULT_AUTHOR;
        price = DEFAULT_PRICE;
    }

    //default constructor
     public book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //accessors
    public String getTitle() {
        return this.title; //corresponding to the function we are calling
    }

    public String getAuthor() {
        return this.author;
    }

    public double getPrice() {
        return this.price;
    }

    //mutators
    void setTitle(String title) {
        this.title = title;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    void setPrice(double price) {
        this.price = price;
    }

    //toString
    public String toString() {
        return "Title = " + this.title + ", Author = " + this.author + ", Price = " + this.price;

    }

    //equals
    public boolean equals(book that) {
        boolean output =  this.author.equals(that.author) && this.title.equals(that.title) && this.price==that.price;

        return output;
    }
}

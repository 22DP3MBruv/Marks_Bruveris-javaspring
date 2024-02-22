package rvt;

public class Book implements Packable {
    private String author;
    private String bookName;
    private double weight;
    public Book(String Author, String Name, double Weight) {
        author = Author;
        bookName = Name;
        weight = Weight;
    }
    public double weight() {
        return weight;
    }
    public String ToString() {
        return String.join(": ", author, bookName);
    }
    
}

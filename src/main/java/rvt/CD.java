package rvt;

public class CD implements Packable {
    private String author;
    private String CDname;
    private int publicationDate;
    public CD(String Author, String cdname, int date) {
        author = Author;
        CDname = cdname;
        publicationDate = date;
    }

    public String ToString() {

        return String.format("{%s}: {%s} ({%s})", this.author, this.CDname, this.publicationDate);

    }
    public double weight() {
        return 0.1;
    }
}

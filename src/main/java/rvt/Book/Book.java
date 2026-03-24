package rvt.Book;

public class Book implements Packable {
    private String writer;
    private String book;
    private Double weight;

    public Book(String writer, String book, Double weight) {
        this.writer = writer;
        this.book = book;
        this.weight = weight;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.writer + ":" + this.book;
    }
}

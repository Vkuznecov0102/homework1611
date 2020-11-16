package book;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Book {
    private String name;
    private String author;
    private int numberOfPages;


    @Override
    public String toString() {
        return "Book{" + "\"" +
                name + "\"" +
                ", " + "\"" + author + "\"" +
                ", " + numberOfPages +
                '}';
    }
}

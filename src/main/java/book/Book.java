package book;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
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

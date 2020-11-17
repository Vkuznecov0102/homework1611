package book;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Book {
    private final String name;
    private final String author;
    private final int numberOfPages;

    @Override
    public String toString() {
        return "Book{" + "\"" +
                name + "\"" +
                ", " + "\"" + author + "\"" +
                ", " + numberOfPages +
                '}';
    }
}

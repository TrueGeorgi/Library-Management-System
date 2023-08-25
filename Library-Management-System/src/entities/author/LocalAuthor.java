package entities.author;

import entities.book.Book;

import java.time.LocalDate;
import java.util.List;

public class LocalAuthor extends BaseAuthor {

    public LocalAuthor(String firstName, String lastName, String birthday, String nationality) {
        super(firstName, lastName, birthday, nationality);
    }
}

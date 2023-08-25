package entities.author;

import entities.book.Book;

import java.time.LocalDate;
import java.util.List;

public interface Author {

    String getFirstName();

    String getLastName();

    int getAge();

    LocalDate getBirthday();

    String getNationality();

    List<Book> getWrittenBooks();

    int getNumberOfWrittenBooks();

    void addWrittenBook(Book book);

    Book getOldestBook();

    Book getLatestBook();

    Book getLongestBook();

    Book getShortestBook();
}

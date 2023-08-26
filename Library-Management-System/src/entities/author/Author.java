package entities.author;

import entities.publication.Publication;

import java.time.LocalDate;
import java.util.List;

public interface Author {

    String getFirstName();

    String getLastName();

    int getAge();

    LocalDate getBirthday();

    String getNationality();

    List<Publication> getWrittenBooks();

    int getNumberOfWrittenBooks();

    void addWrittenBook(Publication publication);

    Publication getOldestBook();

    Publication getLatestBook();

    Publication getLongestBook();

    Publication getShortestBook();
}

package entities.book;

import entities.author.Author;

import java.time.LocalDate;

public interface Book {

    String getTitle();

    String getLanguage();

    String getGenre();

    int getPages();

    Author getAuthor();

    int getOwnedCopies();

    int getCopiesAvailable();

    int getId();

    LocalDate getDateIssued();

    void setId(); //TODO increase idBase everytime

    boolean setIfAgeRestricted();

}

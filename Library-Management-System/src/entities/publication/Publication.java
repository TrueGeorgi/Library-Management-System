package entities.publication;

import entities.author.Author;

import java.time.LocalDate;

public interface Publication {

    String getTitle();

    String getLanguage();

    String getGenre();

    int getPages();

    Author getAuthor();

    int getOwnedCopies();

    int getCopiesAvailable();

    int getId();

    LocalDate getDateIssued();

}

package entities.publication.publications;

import entities.author.Author;
import entities.publication.BasePublication;

import java.time.LocalDate;

public class Newspaper extends BasePublication {
    public Newspaper(String title, String language, String genre, int pages, Author author, LocalDate dateIssued, boolean ageRestricted, int copiesForTheLibrary) {
        super(title, language, genre, pages, author, dateIssued, ageRestricted, copiesForTheLibrary);
    }
}

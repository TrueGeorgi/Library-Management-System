package entities.book;

import entities.author.Author;

import java.time.LocalDate;

public abstract class BaseBook implements Book {

    private static int idBase = 1;

    private String title;
    private String language;
    private String genre;
    private int pages;
    private Author author;
    private int copiesOwnedByTheLibrary;
    private int copiesAvailable;
    private int ID;
    LocalDate dateIssued;
    boolean ageRestricted;

    @Override
    public String getTitle() {
        // TODO
    }

    @Override
    public String getLanguage() {
        // TODO
    }

    @Override
    public String getGenre() {
        // TODO
    }

    @Override
    public int getPages() {
        // TODO
    }

    @Override
    public Author getAuthor() {
        // TODO
    }

    @Override
    public int getOwnedCopies() {
        // TODO
    }

    @Override
    public int getCopiesAvailable() {
        // TODO
    }

    @Override
    public int getId() {
        // TODO
    }

    @Override
    public LocalDate getDateIssued() {
        // TODO
    }

    @Override
    public void setId() {
// TODO
    }

    @Override
    public boolean setIfAgeRestricted() {
        // TODO
    }
}

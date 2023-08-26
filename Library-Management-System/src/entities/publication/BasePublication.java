package entities.publication;

import entities.author.Author;

import java.time.LocalDate;

public abstract class BasePublication implements Publication {

    // parameters

    private static int ID_BASE = 1;

    private String title;
    private String language;
    private String genre;
    private int pages;
    private Author author;
    private int copiesOwnedByTheLibrary = 0;
    private int copiesAvailable;
    private int id;
    private LocalDate dateIssued;
    private boolean ageRestricted;

    // constructor

    public BasePublication(String title, String language, String genre, int pages, Author author, LocalDate dateIssued, boolean ageRestricted, int copiesForTheLibrary) {
        setTitle(title);
        setLanguage(language);
        setGenre(genre);
        setPages(pages);
        setAuthor(author);
        setDateIssued(dateIssued);
        setAgeRestricted(ageRestricted);
        setCopiesOwnedByTheLibrary(copiesForTheLibrary);
        setId();
    }

    // getters
    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getLanguage() {
        return this.language;
    }

    @Override
    public String getGenre() {
        return this.genre;

    }

    @Override
    public int getPages() {
        return this.pages;
    }

    @Override
    public Author getAuthor() {
        return this.author;
    }

    @Override
    public LocalDate getDateIssued() {
        return this.dateIssued;
    }

    public boolean isAgeRestricted() {
        return ageRestricted;
    }

    @Override
    public int getOwnedCopies() {
        return this.copiesOwnedByTheLibrary;
    }

    @Override
    public int getCopiesAvailable() {
        return this.copiesAvailable;
    }

    @Override
    public int getId() {
        return this.id;
    }

    // setters

    private void setTitle(String title) {
        this.title = title;
    }

    private void setLanguage(String language) {
        this.language = language;
    }

    private void setGenre(String genre) {
        this.genre = genre;
    }

    private void setPages(int pages) {
        this.pages = pages;
    }

    private void setAuthor(Author author) {
        this.author = author;
    }

    private void setCopiesOwnedByTheLibrary(int copiesForTheLibrary) {
        this.copiesOwnedByTheLibrary += copiesForTheLibrary;
        this.copiesAvailable += copiesForTheLibrary;
    }

    private void setId() {
        this.id = ID_BASE++;
    }

    private void setDateIssued(LocalDate dateIssued) {
        this.dateIssued = dateIssued;
    }

    private void setAgeRestricted(boolean ageRestricted) {
        this.ageRestricted = ageRestricted;
    }

    // methods



    // private methods


}

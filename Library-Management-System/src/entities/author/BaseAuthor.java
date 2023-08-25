package entities.author;

import common.ExceptionMessages;
import entities.book.Book;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class BaseAuthor implements Author {
    // parameters

    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private String nationality;
    private List<Book> writtenBooks;

    // constructor

    protected BaseAuthor(String firstName, String lastName, String birthday, String nationality) {
        setFirstName(firstName);
        setLastName(lastName);
        setBirthday(birthday);
        setNationality(nationality);
        writtenBooks = new ArrayList<>();
    }

    // getters

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public LocalDate getBirthday() {
        return this.birthday;
    }

    @Override
    public String getNationality() {
        return this.nationality;
    }

    @Override
    public List<Book> getWrittenBooks() {
        return Collections.unmodifiableList(writtenBooks);
    }

    // setters

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private void setBirthday(String birthday) {
        this.birthday = LocalDate.parse(birthday);
    }

    private void setNationality(String nationality) {
        this.nationality = nationality;
    }

    // public methods

    @Override
    public int getAge() {
        LocalDate locDate = LocalDate.now();
        return Period.between(getBirthday(), locDate).getYears();
    }


    @Override
    public int getNumberOfWrittenBooks() {
        return writtenBooks.size();
    }

    @Override
    public void addWrittenBook(Book book) {
        writtenBooks.add(book);
    }

    @Override
    public Book getOldestBook() {
        throwExceptionIfWrittenBooksIsEmpty();
        Book toBeReturned = null;
        LocalDate oldestDate = LocalDate.now();

        for (Book book : writtenBooks) {
            int compareDates = book.getDateIssued().compareTo(oldestDate);
            if (compareDates < 0) {
                toBeReturned = book;
                oldestDate = book.getDateIssued();
            }
        }

        return toBeReturned;
    }

    @Override
    public Book getLatestBook() {
        throwExceptionIfWrittenBooksIsEmpty();
        Book toBeReturned = null;
        LocalDate latestDate = LocalDate.parse("0-0-0");

        for (Book book : writtenBooks) {
            int compareDates = book.getDateIssued().compareTo(latestDate);
            if (compareDates > 0) {
                toBeReturned = book;
                latestDate = book.getDateIssued();
            }
        }

        return toBeReturned;
    }

    @Override
    public Book getLongestBook() {
        throwExceptionIfWrittenBooksIsEmpty();
        Book longestBook = null;
        int mostPages = 0;
        for (Book book : writtenBooks) {
            if (book.getPages() > mostPages) {
                longestBook = book;
                mostPages = book.getPages();
            }
        }
        return longestBook;
    }

    @Override
    public Book getShortestBook() {
        throwExceptionIfWrittenBooksIsEmpty();
        Book shortestBook = null;
        int leastPages = Integer.MAX_VALUE;
        for (Book book : writtenBooks) {
            if (book.getPages() < leastPages) {
                shortestBook = book;
                leastPages = book.getPages();
            }
        }
        return shortestBook;
    }

    // private methods
    private void throwExceptionIfWrittenBooksIsEmpty() {
        if (getNumberOfWrittenBooks() == 0) {
            throw new IllegalArgumentException(ExceptionMessages.WRITTEN_BOOKS_MUST_BE_AT_LEAST_ONE);
        }
    }
}

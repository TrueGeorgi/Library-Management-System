package entities.author;

import common.ExceptionMessages;
import entities.publication.Publication;

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
    private List<Publication> writtenPublications;

    // constructor

    protected BaseAuthor(String firstName, String lastName, String birthday, String nationality) {
        setFirstName(firstName);
        setLastName(lastName);
        setBirthday(birthday);
        setNationality(nationality);
        writtenPublications = new ArrayList<>();
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
    public List<Publication> getWrittenBooks() {
        return Collections.unmodifiableList(writtenPublications);
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
        return writtenPublications.size();
    }

    @Override
    public void addWrittenBook(Publication publication) {
        writtenPublications.add(publication);
    }

    @Override
    public Publication getOldestBook() {
        throwExceptionIfWrittenBooksIsEmpty();
        Publication toBeReturned = null;
        LocalDate oldestDate = LocalDate.now();

        for (Publication publication : writtenPublications) {
            int compareDates = publication.getDateIssued().compareTo(oldestDate);
            if (compareDates < 0) {
                toBeReturned = publication;
                oldestDate = publication.getDateIssued();
            }
        }

        return toBeReturned;
    }

    @Override
    public Publication getLatestBook() {
        throwExceptionIfWrittenBooksIsEmpty();
        Publication toBeReturned = null;
        LocalDate latestDate = LocalDate.parse("0-0-0");

        for (Publication publication : writtenPublications) {
            int compareDates = publication.getDateIssued().compareTo(latestDate);
            if (compareDates > 0) {
                toBeReturned = publication;
                latestDate = publication.getDateIssued();
            }
        }

        return toBeReturned;
    }

    @Override
    public Publication getLongestBook() {
        throwExceptionIfWrittenBooksIsEmpty();
        Publication longestPublication = null;
        int mostPages = 0;
        for (Publication publication : writtenPublications) {
            if (publication.getPages() > mostPages) {
                longestPublication = publication;
                mostPages = publication.getPages();
            }
        }
        return longestPublication;
    }

    @Override
    public Publication getShortestBook() {
        throwExceptionIfWrittenBooksIsEmpty();
        Publication shortestPublication = null;
        int leastPages = Integer.MAX_VALUE;
        for (Publication publication : writtenPublications) {
            if (publication.getPages() < leastPages) {
                shortestPublication = publication;
                leastPages = publication.getPages();
            }
        }
        return shortestPublication;
    }

    // private methods
    private void throwExceptionIfWrittenBooksIsEmpty() {
        if (getNumberOfWrittenBooks() == 0) {
            throw new IllegalArgumentException(ExceptionMessages.WRITTEN_BOOKS_MUST_BE_AT_LEAST_ONE);
        }
    }
}

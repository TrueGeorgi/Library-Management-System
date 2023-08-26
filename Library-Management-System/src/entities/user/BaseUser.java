package entities.user;

import entities.publication.Publication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class BaseUser implements User {
    // parameters
    private static int ID_BASE = 1;

    private int userID;
    private String firstName;
    private String lastName;
    private LocalDate birthdate;
    private String email;
    private List<Publication> currentlyRentedPublications;
    private List<Publication> previouslyRentedPublications;

    // constructor

    public BaseUser(String firstName, String lastName, LocalDate birthdate, String email) {
        setFirstName(firstName);
        setLastName(lastName);
        setBirthdate(birthdate);
        setEmail(email);
        currentlyRentedPublications = new ArrayList<>();
        previouslyRentedPublications = new ArrayList<>();
        setUserID();
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
    public LocalDate getBirthDate() {
        return this.birthdate;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public List<Publication> getCurrentlyRentedBooks() {
        return Collections.unmodifiableList(currentlyRentedPublications);
    }

    @Override
    public List<Publication> getPreviouslyRentedBooks() {
        return Collections.unmodifiableList(previouslyRentedPublications);
    }

    @Override
    public int getUserID() {
        return this.userID;
    }

    // setters

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private void setUserID() {
        this.userID = ID_BASE++;
    }



    // methods
    @Override
    public Publication rentBook(Publication publication) {
        return null; // TODO
    }

    @Override
    public Publication returnBook(Publication publication) {
        return null; //TODO
    }
    // private methods
}

package entities.user;

import entities.publication.Publication;

import java.time.LocalDate;
import java.util.List;

public interface User {
    public String getFirstName();
    public String getLastName();
    public LocalDate getBirthDate();
    public String getEmail();
    public List<Publication> getCurrentlyRentedBooks();
    public List<Publication> getPreviouslyRentedBooks();
    public int getUserID();
    public Publication rentBook(Publication publication);
    public Publication returnBook(Publication publication);
}

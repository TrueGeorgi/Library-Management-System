package entities.library;

import entities.publication.Publication;

public interface Library {

    public void addNewPublication(Publication publication);
    public void rentOutPublication(Publication publication);
    public void returnPublication(Publication publication);
    public void checkAvailability(Publication publication);
}

package entities.library;

import entities.publication.Publication;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseLibrary implements Library {
    // parameters
    private List<Publication> publications;
    // constructor

    public BaseLibrary() {
        publications = new ArrayList<>();
    }

    // getters
    // setters
    // methods
    @Override
    public void addNewPublication(Publication publication) {
        // TODO
    }

    @Override
    public void rentOutPublication(Publication publication) {
        // TODO
    }

    @Override
    public void returnPublication(Publication publication) {
        // TODO
    }

    @Override
    public void checkAvailability(Publication publication) {
        // TODO
    }
    // private methods
}

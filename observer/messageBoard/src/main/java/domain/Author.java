package domain;

import java.util.ArrayList;
import java.util.List;

public class Author implements Subject {
    private String name;
    private String message;
    private List<Observer> observers;

    public Author(String name) {
        this.name = name;
        this.observers = new ArrayList<>();
    }

    public void write(String message) {
        this.message = message;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : this.observers) {
            o.update(this.message);
        }
    }
}

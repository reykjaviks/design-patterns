package domain;

import java.util.ArrayList;

public class Author implements Subject {
    private String name;
    private ArrayList<Message> messages;
    private ArrayList<Observer> observers;

    public Author(String name) {
        this.name = name;
        messages = new ArrayList<Message>();
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : this.observers) {
            o.update();
        }
    }
}

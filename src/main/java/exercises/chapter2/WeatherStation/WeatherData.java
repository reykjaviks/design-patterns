package exercises.chapter2.WeatherStation;

import java.util.ArrayList;
import java.util.Collection;

public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
        Collections.addAll(this.observers); // Too heavy?
    }

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
        Collections.addAll(this.observers, o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            this.observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach(observer -> observer.update(this.temperature, this.humidity, this.pressure));
    }

    public void measurementsChanged() {
        this.notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
    }

}

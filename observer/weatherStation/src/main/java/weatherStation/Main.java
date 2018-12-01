package weatherStation;

import weatherStation.displays.*;
import weatherStation.domain.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        // Add new display observers
        weatherData.registerObserver(new CurrentConditions());
        weatherData.registerObserver(new ForecastDisplay());
        weatherData.registerObserver(new StatisticsDisplay());

        // Notify the observers for updated measurements
        weatherData.notifyObservers();
    }
}

package weatherStation;

import weatherStation.displays.*;
import weatherStation.domain.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(-5, 30, 30.4f);
    }
}

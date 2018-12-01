package weatherStation.domain;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}

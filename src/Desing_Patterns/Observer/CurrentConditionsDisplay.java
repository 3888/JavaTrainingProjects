package Desing_Patterns.Observer;


/**
 * Created by 3888 on 19.06.2016.
 */
public class CurrentConditionsDisplay implements Observer {
    private float temperature;
    private float humidity;
    private int pressure;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.printf("������ ��������: %.1f �������� ������� � %.1f %% ���������. �������� %d �� ��. ��.\n", temperature, humidity, pressure);
    }
}
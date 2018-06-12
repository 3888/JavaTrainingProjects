package patterns.designPatterns.observable.behavioral.Observer;


public class WeatherStation {

// ¬ примере описываетс€ получение данных от метеорологической станции
// (класс WeatherData, рассылатель событий) и использование их дл€ вывода на экран
// (класс CurrentConditionsDisplay, слушатель событий).

// —лушатель регистрируетс€ у наблюдател€ с помощью метода registerObserver
// (при этом слушательзаноситс€ в список observers).
//
// –егистраци€ происходит в момент создани€ объекта currentDisplay,  т.к. метод
// registerObserver примен€етс€ в конструкторе.

// ѕри изменении погодных данных вызываетс€ метод notifyObservers, который в свою очередь
// вызывает метод update у всех слушателей, передава€ им обновлЄнные данные.

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(29f, 65f, 745);
        weatherData.setMeasurements(39f, 70f, 760);
        weatherData.setMeasurements(42f, 72f, 763);
    }
}

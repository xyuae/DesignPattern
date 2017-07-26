package Chapter2;

/**
 * Created by Xiaojun YU on 2017-07-26.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay  =
                new CurrentConditionsDisplay(weatherData);

        // StatisticsDisplay statisicsDisplay =

        weatherData.setMeasuremetns(80, 65, 30.4f);
        weatherData.setMeasuremetns(82, 70, 29.2f);
    }
}

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        WeatherDisplay currentDisplay = new CurrentConditionsDisplay();
        WeatherDisplay statisticsDisplay = new StatisticsDisplay();
        WeatherDisplay forecastDisplay = new ForecastDisplay();

        weatherStation.addObserver(currentDisplay);
        weatherStation.addObserver(statisticsDisplay);
        weatherStation.addObserver(forecastDisplay);

        WeatherData weatherData = new WeatherData(weatherStation);

        weatherData.updateWeatherData(25.5f, 65.0f, 1015.0f);
        weatherData.updateWeatherData(27.0f, 70.0f, 1012.0f);
        weatherData.updateWeatherData(22.3f, 60.0f, 1009.0f);
    }
}

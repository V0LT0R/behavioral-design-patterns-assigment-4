public class WeatherData {
    private WeatherStation weatherStation;

    public WeatherData(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    // Simulate changing weather data
    public void updateWeatherData(float temperature, float humidity, float pressure) {
        weatherStation.setWeatherData(temperature, humidity, pressure);
    }
}

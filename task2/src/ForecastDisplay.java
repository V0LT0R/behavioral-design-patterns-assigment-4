public class ForecastDisplay implements WeatherDisplay {
    private float lastPressure = 1013.25f; // Initial average pressure value
    private float currentPressure;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        currentPressure = pressure;
        String forecast;
        if (currentPressure > lastPressure) {
            forecast = "Weather is improving!";
        } else if (currentPressure == lastPressure) {
            forecast = "More of the same.";
        } else {
            forecast = "Watch out for cooler, rainy weather.";
        }
        System.out.println("Forecast: " + forecast);
        lastPressure = currentPressure;
    }
}

public class TemperatureConverter {
    private double celsius;
    private double fahrenheit;

    public TemperatureConverter() {
    }

    public TemperatureConverter(double celsius, double fahrenheit) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
    }

    public double getCelsius() {
        return this.celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return this.fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double convertFahrenheitToCelsius(double fahrenheit) {
        celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    public double convertCelsiusToFahrenheit(double celsius) {
        fahrenheit = celsius * 9 / 5 + 32;
        return fahrenheit;
    }

    @Override
    public String toString() {
        return "{" +
                " celsius='" + getCelsius() + "'" +
                ", fahrenheit='" + getFahrenheit() + "'" +
                "}";
    }

}

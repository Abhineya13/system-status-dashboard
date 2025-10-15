
public class WeatherReport {
    // Attributes
    private String city;
    private double temperature;
    private int humidity;
    private String condition;

    // Constructor
    public WeatherReport(String city, double temperature, int humidity, String condition) {
        this.city = city;
        this.temperature = temperature;
        this.humidity = humidity;
        this.condition = condition;
    }

    // Display method
    public void displayReport() {
        System.out.println("=================================");
        System.out.println("          Weather Report");
        System.out.println("=================================");
        System.out.println("City: " + city);
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Humidity: " + humidity + "%");
        System.out.println("Condition: " + condition);
        System.out.println("=================================");
    }

    // Main method to run the program
    public static void main(String[] args) {
        WeatherReport today = new WeatherReport("New York", 22.5, 65, "Partly Cloudy");
        today.displayReport();
    }
}

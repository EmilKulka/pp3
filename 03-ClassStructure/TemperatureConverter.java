public class TemperatureConverter {
    static double CelsiusToKelvin(double tempInCelsius) {
        return tempInCelsius + 273.15;
    }

    static double CelsiusFahrenheit(double tempInCelsius) {
        return (tempInCelsius * 9/5) + 32;
    }

    static double KelvinToCelsius(double tempInKelvin) {
        return tempInKelvin - 273.15;
    }

    static double KelvinToFahrenheit(double tempInKelvin) {
        return KelvinToCelsius(tempInKelvin) * 9/5 + 32;
    }

    static double FahrenheitToCelsius(double tempInFahrenheit) {
        return (tempInFahrenheit - 32) * 5/9;
    }

    static double FahrenheitToKelvin(double tempInFahrenheit) {
        return (tempInFahrenheit + 459.67) * 5/9;
    }
    
    public static void main(String[] args) {
        System.out.println(TemperatureConverter.CelsiusFahrenheit(25.0));
        System.out.println(TemperatureConverter.CelsiusToKelvin(25));
        System.out.println(TemperatureConverter.FahrenheitToCelsius(100));
        System.out.println(TemperatureConverter.FahrenheitToKelvin(100));
        System.out.println(TemperatureConverter.KelvinToCelsius(0));
        System.out.println(TemperatureConverter.KelvinToFahrenheit(0));
        
    }
}


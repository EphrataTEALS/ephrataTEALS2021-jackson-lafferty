package labs.GoingMetric;
public class Temperature {                     //temperatures are equal at 0 degrees celsius and 32 degrees fahrenheit
   public static void main(String[] args){     //or 35 degrees celcsius and 95 degrees fahrenheit
         double fahrenheit = 95;
         double celsius = 0;
         double convertToCelsius = (fahrenheit-32) * 5.0/9.0;
         double convertToFahrenheit = (celsius * 9.0/5.0) + 32;
         System.out.println(convertToCelsius);
         System.out.println(convertToFahrenheit);
    }
}
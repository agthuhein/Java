package Day_6;

import java.util.Scanner;

public class GalaxyWeatherAdvisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Galaxy Weather Advisor");
        System.out.println("Please enter the planet you are on (Earth, Mars, Venus, Jupiter): ");
        String planetName = scanner.nextLine().trim().toLowerCase();

        System.out.println("Enter your temperature in Celsius");
        double temperatureInCelsius = scanner.nextDouble();

        String advice = "";

        if(planetName.equals("earth")) {
            if(temperatureInCelsius < 0) {
                advice = "It is freezing on earth. Wear a heavy coat";
            }
            else if(temperatureInCelsius < 15) {
                advice = "It is quite chilly on Earch. Wear a jacket";
            }
            else if(temperatureInCelsius < 25) {
                advice = "The weather on earth is pleasant. A light sweater should be enough.";
            }
            else{
                advice = "It is warm on earth. Wear something light!";
            }
        }
        else if(planetName.equals("mars")) {
            if(temperatureInCelsius < -60) {
                advice = "It is extremely cold on Mars. Wear a space suit with thermal insulation";
            }
            else if(temperatureInCelsius < 0) {
                advice = "It is very cold on Mars. Wear a thermal suit";
            }
            else{
                advice = "It is usually warm on Mars. Enjoy the rare warmth!";
            }
        }
        else if(planetName.equals("venus")) {
            if(temperatureInCelsius < 400) {
                advice = "It is incredibly hot on Venus! Stay indoors with air conditioning";
            }
            else{
                advice = "It is scorching hot on Venus. Avoid going outside!";
            }
        }
        else if(planetName.equals("jupiter")) {
            if(temperatureInCelsius < -100) {
                advice = "It is freezing on Jupiter. Stay in your heated space module";
            }
            else if(temperatureInCelsius < -50) {
                advice = "It's very cold on Jupiter. Wear a thermal space suit";
            }
            else{
                advice = "It is surprisingly warm on Jupiter. Enjoy the pleasant temperature!";
            }
        }
        else{
            advice = "Unknown planet! Please enter a valid planet name.";
        }

        System.out.println(advice);
        scanner.close();
    }
}

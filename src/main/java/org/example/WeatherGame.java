package org.example;
import java.util.Scanner;

public class WeatherGame {
    public static void main(String[] args) {

        System.out.println("What is the weather like today? Please select between rainy, snow, cloudy, sunny. Please note: these weather conditions are case sensitive!");
        System.out.println("What is the average temperature today?");

        Scanner reader = new Scanner(System.in); // this creates a scanner object
        String weather = reader.nextLine();
        Integer temp = Integer.valueOf(reader.nextLine()); // this reads the user input

        if (weather.equals("rainy") && temp < 10){

            System.out.println("Wear a heavy coat and bring an umbrella.");

        } else if (weather.equals("rainy") && temp >10 && temp <25){

            System.out.println("Wear a jacket and bring an umbrella.");

        } else if (weather.equals("rainy") && temp >25){

            System.out.println("Bring an umbrella.");

        } else if (weather.equals("snowy") && temp < 2){

            System.out.println("Wear a heavy coat and boots if possible. Be careful and watch out for the slippery roads!");

        } else if (weather.equals("snowy") && temp > 2){

            System.out.println("Wear a heavy coat and boots if possible. Be careful and watch out for the slippery roads!");

        } else if (weather.equals("cloudy") && temp <10){

            System.out.println("Wear a heavy coat.");

        } else if (weather.equals("cloudy") && temp >10 && temp <25){

            System.out.println("Wear a jacket.");

        } else if (weather.equals("cloudy") && temp >25){

            System.out.println("Wear light clothes. Even though the sun is not out it still hot outside!");

        } else if (weather.equals("sunny") && temp <10){

            System.out.println("Wear a heavy coat. The sun might be out but it's not that hot yet!");

        } else if (weather.equals("sunny") && temp >10 && temp <25){

            System.out.println("Wear light clothes and a light jacket.");

        } else if (weather.equals("sunny") && temp <25){

            System.out.println("Wear light clothes and enjoy the sunshine!");

        } else{

            System.out.println("Uhm, looks like something went wrong! Did you select the correct weather option? Don't forget, these are case sensitive!");
        }




    }
}

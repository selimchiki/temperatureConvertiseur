package com.selimchiki.temperature;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean reset = true;
        double temperatureToConvert;
        Temperature temperature;
        char letter;
        while (reset) {
            System.out.println("Convertisseur degré Celsius - Fahrenheit");
            System.out.println("Choisissez le mode de conversion : ");
            System.out.println("1 - Convertisseur Celsius - Fahrenheit");
            System.out.println("2 - Convertisseur Fahrenheut - Celsius");

            int numberChoice = sc.nextInt();
            switch (numberChoice) {
                case 1:
                    System.out.println("Veuillez taper la temperature à convertir?");
                    temperatureToConvert = sc.nextDouble();
                    sc.nextLine();
                    temperature = new Temperature(temperatureToConvert, true);
                    System.out.println(temperatureToConvert + "°C correspond à : " + temperature.getTempInFahrenheit() + "°F");
                    break;
                case 2:
                    System.out.println("Veuillez taper la temperature à convertir?");
                    temperatureToConvert = sc.nextDouble();
                    sc.nextLine();
                    temperature = new Temperature(temperatureToConvert, false);
                    System.out.println(temperatureToConvert + "°F correspond à : " + temperature.getTempInCelsius() + "°C");
                    break;
                default:
                    System.out.println("Pas compris");
                    break;
            }
            System.out.println("Souhaitez vous convertir une autre temperature? o/n");
            letter = sc.nextLine().charAt(0);
            switch (letter){
                case 'o':
                    reset = true;
                    break;
                case 'n':
                    reset = false;
                    break;
                default:
                    System.out.println("Je n'ai pas compris votre réponse");
                    break;
            }
        }
    }
}

package SwitchStatement;

import java.util.Scanner;

public class Classwork4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the state name available states are Illinois, Florida");

        String state = input.nextLine();


        switch (state) {
            default:
                System.out.println("selected state is not available " );
                break;

            case "illinois":
                System.out.println("please enter the city's name");
                String city = input.nextLine();

                switch (city) {

                    case "chicago":
                        System.out.println("the state name " + state + "city name " + city);
                        break;

                    case "elgin":
                        System.out.println("the name state  " + state + "city name" + city);
                        break;

                    case "des plaines":
                        System.out.println("the state name   " + state + "city name" + city);
                        break;
                    default:
                        System.out.println("selected city is not available");

                }
                break;
            case "Florida":
                System.out.println("Please enter the city name (Tampa, Miami or JacksonVille");
                String cityName2 = input.nextLine();
                switch (cityName2) {
                    case "Miami":
                        System.out.println("Selected state name " + state + " city name " + cityName2);
                        break;
                    case "Tampa":
                        System.out.println("Selected state name " + state + " city name " + cityName2);
                        break;
                    case "JacksonVille":
                        System.out.println("Selected state name " + state + " city name " + cityName2);
                        break;
                    default:
                        System.out.println("selected city is not available");

                }


        }


    }

}
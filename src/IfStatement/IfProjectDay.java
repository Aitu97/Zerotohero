package IfStatement;

import java.util.Scanner;

public class IfProjectDay {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the type of Music: available musics are classical, pop and country");
        String typeMusic = input.nextLine();

        if (typeMusic.equalsIgnoreCase("Classical")) {
            System.out.println("songs are available: Four Seasons,FurElise,Finlandia,Vocalise,ThePlanetsis ");
            String songs = input.nextLine();

            if (songs.equalsIgnoreCase("Four Seasons")) {
                System.out.println("Please enter $2");
                double money1 = input.nextDouble();
                if (money1 == 2) {
                    System.out.println("Four Seasons is playing now");

                    if (money1 < 2) {
                        System.out.println("you have entered not enough money, please try again");
                    }

                    if (money1 > 2) {
                        System.out.println("you entered $ " + (money1 - 2) + "more. please wait for your change, and enjoy your Music");

                    }
                }

                if (songs.equalsIgnoreCase("FurElise")) {
                     System.out.println("Please enter $2");
                    double money2 = input.nextDouble();
                    if (money2 == 2) {
                        System.out.println("Four Seasons is playing now");

                        if (money2 < 2) {
                            System.out.println("you have entered not enough money, please try again");
                        }

                        if (money2 > 2) {
                            System.out.println("you entered $ " + (money2 - 2) + "more. please wait for your change, and enjoy your Music");

                        }
                    }
                }
                if (songs.equalsIgnoreCase("Finlandia")) {
                    System.out.println("Please enter $2");
                    double money3 = input.nextDouble();
                    if (money3 == 2) {
                        System.out.println("Four Seasons is playing now");

                        if (money3 < 2) {
                            System.out.println("you have entered not enough money, please try again");
                        }

                        if (money3 > 2) {
                            System.out.println("you entered $ " + (money3 - 2) + "more. please wait for your change, and enjoy your Music");

                        }
                    }
                }
                if (songs.equalsIgnoreCase("Vocalise")) {
                    System.out.println("Please enter $2");
                    double money4 = input.nextDouble();
                    if (money4 == 2) {
                        System.out.println("Four Seasons is playing now");

                        if (money4 < 2) {
                            System.out.println("you have entered not enough money, please try again");
                        }

                        if (money4 > 2) {
                            System.out.println("you entered $ " + (money4 - 2) + "more. please wait for your change, and enjoy your Music");

                        }
                    }
                }
                if (songs.equalsIgnoreCase("ThePlanetsis")) {
                    System.out.println("Please enter $2");
                    double money5 = input.nextDouble();
                    if (money5 == 2) {
                        System.out.println("Four Seasons is playing now");

                        if (money5 < 2) {
                            System.out.println("you have entered not enough money, please try again");
                        }

                        if (money5 > 2) {
                            System.out.println("you entered $ " + (money5 - 2) + "more. please wait for your change, and enjoy your Music");

                        }
                    }
                }
            }


        }


    }
}

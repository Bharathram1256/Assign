package Dealing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Displaying the cars and their showroom price.
        System.out.println("Car Model Cost(Showroom price)");
        System.out.println("1.Polo Trendline 8.70 lakh");
        System.out.println("2.Polo Highline 10.09 lakh");
        System.out.println("3.Virtus Trendline 11.05 lakh");
        System.out.println("4.Virtus Highline 13.08 lakh");
        System.out.println("5.Taigun Trendline 14.89 lakh");
        System.out.println("6.Taigun Highline 15.42 lakh");
        System.out.println("7.Taigun Topline 17.71 lakh");

        Scanner car = new Scanner(System.in);
        System.out.print("Select car number: ");
        String name = car.nextLine();
        car.close();

        switch (name) {
            case "1":
                System.out.println("Polo Trendline selected");
                break;
            case "2":
                System.out.println("Polo Highline selected");
                break;
            case "3":
                System.out.println("Virtus Trendline selected");
                break;
            case "4":
                System.out.println("Virtus Highline selected");
                break;
            case "5":
                System.out.println("Taigun Trendline selected");
                break;
            case "6":
                System.out.println("Taigun Highline selected");
                break;
            case "7":
                System.out.println("Taigun Topline selected");
                break;
            default:
                System.out.println("Invalid car selection");
                break;
        }
    }
}

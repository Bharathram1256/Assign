package Dealing;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Displaying the cars and their showroom price.
        System.out.println("Car Model Cost(Showroom price)");
        System.out.println("1. Polo Trendline 8.70 lakh");
        System.out.println("2. Polo Highline 10.09 lakh");
        System.out.println("3. Virtus Trendline 11.05 lakh");
        System.out.println("4. Virtus Highline 13.08 lakh");
        System.out.println("5. Taigun Trendline 14.89 lakh");
        System.out.println("6. Taigun Highline 15.42 lakh");
        System.out.println("7. Taigun Topline 17.71 lakh");

        // Selection of the car.
        Scanner car = new Scanner(System.in);
        System.out.print("Select car number: ");
        String name = car.nextLine();

        try {
            switch (name) {
                case "1":
                    System.out.println("Polo Trendline");
                    break;
                case "2":
                    System.out.println("Polo Highline");
                    break;
                case "3":
                    System.out.println("Virtus Trendline");
                    break;
                case "4":
                    System.out.println("Virtus Highline");
                    break;
                case "5":
                    System.out.println("Taigun Trendline");
                    break;
                case "6":
                    System.out.println("Taigun Highline");
                    break;
                case "7":
                    System.out.println("Taigun Topline");
                    break;
                default:
                    System.out.println("Invalid car selection");
                    return;
            }

            Scanner scanner = new Scanner(System.in);

            System.out.print("Do you need Insurance: ");
            String insurance = scanner.nextLine();

            System.out.print("Do you need Additional Accessories: ");
            String accessories = scanner.nextLine();

            double discountAmount = 0.0;
            if (insurance.equalsIgnoreCase("yes") || accessories.equalsIgnoreCase("yes")) {
                System.out.print("Dealer discount: ");
                String discountInput = scanner.nextLine();
                try {
                    if (discountInput.endsWith("%")) {
                        double discountPercentage = Double.parseDouble(discountInput.substring(0, discountInput.length() - 1));
                        double carPrice = getCarPrice(name);
                        discountAmount = carPrice * (discountPercentage / 100);
                    } else {
                        discountAmount = Double.parseDouble(discountInput);
                    }
                    if (discountAmount > 30000) {
                        discountAmount = 30000;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid discount value");
                    return;
                }
            }

            double carPrice = getCarPrice(name);
            double rto = 113990;
            double insuranceCost = insurance.equalsIgnoreCase("yes") ? 47300.0 : 0.0;
            double tcs = 11000;
            double accessoriesCost = accessories.equalsIgnoreCase("yes") ? 15000.0 : 0.0;

            double totalCost = carPrice + rto + insuranceCost + tcs + accessoriesCost;

            DecimalFormat decimalFormat = new DecimalFormat("#,##,###");
            String CarPrice = decimalFormat.format(carPrice);
            String RTO = decimalFormat.format(rto);
            String InsuranceCost = decimalFormat.format(insuranceCost);
            String TCS = decimalFormat.format(tcs);
            String AccessoriesCost = decimalFormat.format(accessoriesCost);
            String DiscountAmount = decimalFormat.format(discountAmount);
            String TotalCost = decimalFormat.format(totalCost - discountAmount);

            System.out.println("Total cost: " + TotalCost + " ("
                    + "Car price: " + CarPrice
                    + " + RTO: " + RTO
                    + " + Insurance: " + InsuranceCost
                    + " + TCS: " + TCS
                    + " + Accessories: " + AccessoriesCost
                    + " - Dealer discount: " + DiscountAmount
                    + ")");

            scanner.close();
        } catch (Exception e) {
            System.out.println("Give me the proper inputs.");
        } finally {
            car.close();
        }
    }

    private static double getCarPrice(String name) {
        double carPrice = 0;
        switch (name) {
            case "1":
                carPrice = 870000;
                break;
            case "2":
                carPrice = 1009000;
                break;
            case "3":
                carPrice = 1105000;
                break;
            case "4":
                carPrice = 1308000;
                break;
            case "5":
                carPrice = 1489000;
                break;
            case "6":
                carPrice = 1542000;
                break;
            case "7":
                carPrice = 1771000;
                break;
            default:
                System.out.println("Invalid car selection");
                break;
        }
        return carPrice;
    }
}


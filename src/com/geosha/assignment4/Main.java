package com.geosha.assignment4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt(); // 1 - AirIndia, 2 - KingFisher, 3 - Indigo
        int hours = sc.nextInt();
        double costPerHour = sc.nextDouble();

        Airfare flight;

        switch (choice) {
            case 1:
                flight = new AirIndia(hours, costPerHour);
                break;
            case 2:
                flight = new KingFisher(hours, costPerHour);
                break;
            case 3:
                flight = new Indigo(hours, costPerHour);
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        double amount = flight.calculateAmount();

        // Round off to 2 decimal places
        System.out.printf("%.2f\n", amount);

	}

}

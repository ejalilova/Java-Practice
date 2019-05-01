package TryingHomework;

import java.util.*;

public class TipCalculator {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

			byte numberOfPeople = 1;
			double checkAmount, totalTip = 0;
			String split, serviceQuality, numberOfPeople1 = "";
			Scanner scan = new Scanner(System.in);
			System.out.println("***************************************");
			System.out.println("*************Golden Diner**************");
			System.out.println("*****Thank you for dining with us!*****");
			System.out.println("***************************************");
			System.out.println("Would you like to split the bill? \n" + "Please enter \"yes\" or \"no\"");
			split = scan.nextLine();
			while (!split.equalsIgnoreCase("yes") && !split.equalsIgnoreCase("no")) {

				System.out.println("*********Invalid Data Entered!*********");
				System.out.println("*Please check your input and try again*");
				System.out.println("Would you like to split the bill? \n" + "Please enter \"yes\" or \"no\"");
				split = scan.nextLine();
			}
			if (split.equalsIgnoreCase("yes")) {
				System.out.println("Please enter number of people in your party:");
				numberOfPeople = scan.nextByte();

				while (numberOfPeople < 2 || numberOfPeople > 10) {

					System.out.println("*********Invalid Data Entered!*********");
					System.out.println("**Enter guest from 2 to 10 for split!**");
					System.out.println("Please enter number of people in your party:");
					numberOfPeople = scan.nextByte();

				}

			}
			for (int i = 0; i < numberOfPeople; i++) {
				numberOfPeople1 += "&";
			}
			System.out.println("Please enter your check amount:");
			checkAmount = scan.nextDouble();
			while (checkAmount <= 0) {
				System.out.println("*********Invalid Data Entered!*********");
				System.out.println("Please check your amount and try again!");
				System.out.println("Please enter your check amount:");
				checkAmount = scan.nextDouble();
			}
			System.out.println(
					"Service Quality:\n" + "Please choose from the following:\n" + "Excellent--------------%25 Gratuity\n"
							+ "Great------------------%20 Gratuity\n" + "Good-------------------%15 Gratuity\n"
							+ "Fair-------------------%10 Gratuity\n" + "Poor-------------------%5  Gratuity");
			serviceQuality = scan.next();

			if (!serviceQuality.equalsIgnoreCase("excellent") && !serviceQuality.equalsIgnoreCase("great")
					&& !serviceQuality.equalsIgnoreCase("good") && !serviceQuality.equalsIgnoreCase("fair")
					&& !serviceQuality.equalsIgnoreCase("poor")) {

				System.out.println("*********Invalid Data Entered!*********");
				System.out.println("Please check your input and try again!");
				System.out.println("Service Quality:\n" + "Please choose from the following:\n"
						+ "Excellent--------------%25 Gratuity\n" + "Great------------------%20 Gratuity\n"
						+ "Good-------------------%15 Gratuity\n" + "Fair-------------------%10 Gratuity\n"
						+ "Poor-------------------%5  Gratuity");
				serviceQuality = scan.next();
			}

			if (serviceQuality.equalsIgnoreCase("Excellent")) {
				totalTip = (checkAmount / 100) * 25;
			}
			if (serviceQuality.equalsIgnoreCase("Great")) {
				totalTip = (checkAmount / 100) * 20;
			}
			if (serviceQuality.equalsIgnoreCase("Good")) {
				totalTip = (checkAmount / 100) * 15;
			}
			if (serviceQuality.equalsIgnoreCase("Fair")) {
				totalTip = (checkAmount / 100) * 10;
			}
			if (serviceQuality.equalsIgnoreCase("Poor")) {
				totalTip = (checkAmount / 100) * 5;
			}
			if (split.equalsIgnoreCase("yes")) {
				System.out.println("***************************************");
				System.out.println("*************Golden Diner**************");
				System.out.println("*************Guest Check!**************");
				System.out.println("***************************************");
				System.out.println("Number of people entered: " + numberOfPeople1);
				System.out.println("***************************************");
				System.out.println("Total payment: " + (checkAmount + totalTip));
				System.out.println("***************************************");
				
				double totalPerPerson = (checkAmount + totalTip) / numberOfPeople;
				totalPerPerson = Math.round(totalPerPerson * 100.0) / 100.0;

				System.out.println("Total per person: " + totalPerPerson);
				System.out.println("***************************************");
				System.out.println("Total tip: " + (checkAmount + totalTip));
				System.out.println("***************************************");

				double totalTipPerPerson = (totalTip / numberOfPeople);
				totalTipPerPerson = Math.round(totalTipPerPerson * 100.0) / 100.0;

				System.out.println("Tip per person: " + totalTip);
				System.out.println("***************************************");
				System.out.println("*****Thank you for dining with us!*****");
			}
			if (split.equalsIgnoreCase("no")) {
				System.out.println("***************************************");
				System.out.println("*************Golden Diner**************");
				System.out.println("*************Guest Check!**************");
				System.out.println("***************************************");

				double totalperperson = (checkAmount + totalTip);
				totalperperson = Math.round(totalperperson * 100.0) / 100.0;

				System.out.println("Total to pay: " + totalperperson);
				System.out.println("***************************************");

				double totalTipPerPerson = (totalTip);
				totalTipPerPerson = Math.round(totalTipPerPerson * 100.0) / 100.0;

				System.out.println("Total tip: " + totalTipPerPerson);
				System.out.println("***************************************");
				System.out.println("*****Thank you for dining with us!*****");
			}

		}
	}
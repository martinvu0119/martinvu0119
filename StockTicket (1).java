/**
 * Author: Dinh Vu
 * File: StockTicket.java
 * 
 * Description: 
 * Display the ticker, stock price, P/E ratio and # of shares you will be able to purchase based on your available funds.
 * 
 */

import java.util.Scanner;
public class StockTicket {
	public static void main(String[] args) {
		System.out.println("Welcome to the Stock Ticket!!!");
		System.out.println();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the total amout of money you are willing to invest: ");
		double investmentAmount = Double.parseDouble(input.nextLine());
		System.out.print("Enter the stock ticket: ");
		String stockTicker = input.nextLine();
		while (stockTicker.length() > 5 || stockTicker.length() < 0) {
			System.out.println("Invalid ticker entered for stock. Try again..");
			System.out.print("Enter the stock ticket: ");
			stockTicker = input.nextLine();
		}
		System.out.print("Enter the price: ");
		double stockPrice = Double.parseDouble(input.nextLine());
		while (stockPrice < 1.00) {
			System.out.println("Invalid price entered for stock!!! Try again.");
			System.out.print("Enter the price: ");
			stockPrice = Double.parseDouble(input.nextLine());
		}
		System.out.print("Enter the P/E Ratio: ");
		double PE = Double.parseDouble(input.nextLine());
		System.out.println("\nBelow are your results: \n");
		System.out.printf("Stock: %s\n", stockTicker);
		System.out.printf("Price: %.2f\n", stockPrice);
		System.out.printf("P/E Ratio: %.2f\n", PE);
		if (PE > 45) {
		}
		System.out.format("# of shares able to purchase: %d", (int)Math.floor(investmentAmount / stockPrice));
		System.out.println("\nOVERVALUED STOCK!");
		System.out.println("\nThank you for using Stock Ticket!!!");
	}
}
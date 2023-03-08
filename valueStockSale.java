
/** 
 * Program Name: valueStockSale
 * Author: Pup Abdulgapul
 * Student ID: 100362791
 * Date: Sep 16, 2022
 * Course: CPSC1150-03
 * Professor: Hengameh Hamavand
 */

import java.util.Scanner;

public class valueStockSale {
    public static void main(String[] args) {

        // The program calculates the value of a stock sale
        double stockPrice, 
            percentCommission, 
            valueShare, 
            commission, 
            netProceeds;
        int numberShares;

        Scanner input = new Scanner(System.in);

        System.out.println("This program calculates the net proceeds from a sale of stock.");

        System.out.println("Enter the stock price: ");
        stockPrice = input.nextDouble();
        System.out.println("Enter the number of shares: ");
        numberShares = input.nextInt();
        System.out.println("Enter the commission rate (as a percentage): ");
        percentCommission = input.nextDouble();

        // Calculate the total value of shares
        valueShare = stockPrice * numberShares;
        System.out.printf("\nValue of share: $%.2f", valueShare);

        // Calculate total commission
        commission = valueShare * (percentCommission / 100);
        System.out.printf("\nCommission: $%.2f", commission);

        // Calculate total net proceeds
        netProceeds = valueShare - commission;
        System.out.printf("\nNet proceeds: $%.2f", netProceeds);

        return;
    }

}

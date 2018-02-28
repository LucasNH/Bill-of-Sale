/*
BillOfSale.java 
Write a Java program to calculate and print a bill of sale based on the 
following:
A shirt was purchased for $12.49 and was paid with a $20 bill.
Assign variables for the purchase price and amount given to the clerk.
Calculate taxes, (HST = 13%), total bill, and change.
Output the entire bill showing purchased price, taxes, total, and change.
Created by: Lucas N-H
Created on: February 27, 2018
Last edited on: February 28, 2018
*/
package billofsale;

public class BillOfSale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        double cost, payment, change, taxes, total;
        cost = 12.49;
        payment = 20.0;
        change = payment-cost;
        taxes = cost*0.13;
        total = cost+taxes;
        System.out.println("Purchased price: $"+cost+"\n"+"Taxes: $"+taxes+"\n"
                +"Total: $"+total+"\n"+"Change: $"+change);
    }
}

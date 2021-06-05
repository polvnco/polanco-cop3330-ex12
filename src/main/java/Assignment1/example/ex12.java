/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Polanco
 */
package Assignment1.example;


import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ex12
{
    public static void main( String[] args )
    {
        Locale usa = new Locale("en", "US");
        NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa);

        System.out.print( "Enter the principal: " );
        Scanner p1 = new Scanner(System.in);
        float principal = p1.nextFloat();

        System.out.print( "Enter the rate of interest: " );
        Scanner i1 = new Scanner(System.in);
        float interest = i1.nextFloat();

        System.out.print( "Enter the number of years: " );
        Scanner t1 = new Scanner(System.in);
        int term = t1.nextInt();

        float interestConversion = interest/100;

        float amountAccrued = principal * (1 + (term * interestConversion));



        System.out.println("After " + term + " years at " + interest + "%, the investment will be worth " + dollarFormat.format(amountAccrued));
    }
}

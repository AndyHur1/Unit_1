package com.company;

public class TotalWithTax {
    public static void main(String[] args)
    {
        final double TAXRATE;
        double price;
        double tax;
        double total;

        TAXRATE = 0.0825;
        price = 52.75;
        tax = price*TAXRATE;
        total = tax + price;
        System.out.println("Price: $"+(price));
        System.out.println("Sales Tax: $"+(tax));
        System.out.println("Total: $"+(total));

    }
}

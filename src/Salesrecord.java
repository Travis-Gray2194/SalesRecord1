import java.util.Scanner;

public class Salesrecord
{
    public static void main(String[] args){

        int customerid;
        String customername,taxcode;
        double amount, tax= 0.00, total,subtotal;

        Scanner scan = new Scanner( System.in );

        System.out.println("Enter Customer ID?:");
        customerid = scan.nextInt();

        System.out.println("Enter Customer Name?:");
        customername = scan.next();

        System.out.println("Enter Sales Amount?:");
        amount = scan.nextDouble();

        System.out.println("Enter Tax code?:");
        taxcode = scan.next();

        switch(taxcode.toUpperCase()) {
            case "NRM": tax = 0.06;
                break;

            case "NPF": tax = 0.00;
                break;

            case "BIZ": tax = 0.45;
                break;

        }

        subtotal= amount * tax;
        total = amount + subtotal;

        //Print out recipet

        System.out.println("Customer ID:" + customerid);
        System.out.println("Customer Name:" + customername);
        System.out.println("Sales Amount:"+ amount);
        System.out.println("Tax Code:" +taxcode.toUpperCase());
        System.out.println("Total Amount Due: $" +   total);
    }
}
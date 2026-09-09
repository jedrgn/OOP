import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double price, discountPercent, amountPaid;
        int quantity;

    System.out.print("Enter product price: ");
        price = sc.nextDouble();
    System.out.print("Enter quantity: ");
        quantity = sc.nextInt();
    System.out.print("Enter discount percentage: ");
        discountPercent = sc.nextDouble();
    System.out.print("Enter amount paid: ");
        amountPaid = sc.nextDouble();

    double gross = price * quantity;
    double discount = gross * (discountPercent / 100);
    double afterDiscount = gross - discount;
    double vat = afterDiscount * 0.12;
    double finalBill = afterDiscount + vat;
    double change = amountPaid - finalBill;

    String status = amountPaid >= finalBill ? "SUFFICIENT PAYMENT" : "INSUFFICIENT PAYMENT";

    System.out.println("Gross=" + gross);
    System.out.println("Discount=" + discount);
    System.out.println("After Discount=" + afterDiscount);
    System.out.println("VAT=" + vat);
    System.out.println("Final Bill=" + finalBill);
    System.out.println("Change/Difference=" + change);
    System.out.println(status);
    }
}

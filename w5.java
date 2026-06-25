import java.util.Scanner;

public class w5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("name_product: ");
        String productName = sc.nextLine();

        System.out.print("price: ");
        double unitPrice = sc.nextDouble();

        System.out.print("value: ");
        int quantity = sc.nextInt();

        double totalPrice = unitPrice * quantity;
        double discountRate = 0.0;

        if (totalPrice >= 20000) {
            discountRate = 0.10;
        } else if (totalPrice >= 10000) {
            discountRate = 0.05;
        }else {
            discountRate = 0.035;
        }

        double discount = totalPrice * discountRate;
        double netPrice = totalPrice - discount;
        System.out.println("Name of product: " + productName);
        System.out.println("price of product: " + totalPrice);
        System.out.println("discount: " + discount);
        System.out.println("net price: " + netPrice);

        sc.close();
    }
}

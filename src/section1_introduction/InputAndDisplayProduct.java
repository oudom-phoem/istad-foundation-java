package section1_introduction;

import java.util.Scanner;

public class InputAndDisplayProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("[+] Insert product name: ");
        String productName = scanner.nextLine();

        System.out.print("[+] Insert product price: ");
        double productPrice = scanner.nextDouble();

        System.out.print("[+] Insert product quantity: ");
        int productQuantity = scanner.nextInt();

        System.out.print("[+] Insert product char code: ");
        char productCharacterCode = scanner.next().charAt(0);

        System.out.println("+------------------------------+-------------------------+");
        System.out.printf("| %-15s | %-10s | %-10s | %-10s |%n", "Name", "Price", "Quantity", "Char Code");
        System.out.println("+------------------------------+-------------------------+");
        System.out.printf("| %-15s | $%-9.2f | %-10d | %-10c |%n", productName, productPrice, productQuantity, productCharacterCode);
        System.out.println("+------------------------------+-------------------------+");

        double total = productPrice * productQuantity;

        System.out.printf("Total\t\t$%.2f%n", total);

        scanner.close();
    }
}

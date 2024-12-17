package controlFlowStatements;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        System.out.println("""
                1. Create
                2. Read
                3. Update
                4. Delete
                """);

        System.out.print("[+] Insert option: ");

        int option = new Scanner(System.in).nextInt();

        String message = switch (option) {
            case 1 -> {
                System.out.println("Option 1");
                System.out.println("Create");
                yield "Option 1";
            }
            case 2 -> {
                System.out.println("Read");
                yield "Option 2";
            }
            case 3 -> {
                System.out.println("Update");
                yield "Option 3";
            }
            case 4 -> {
                System.out.println("Delete");
                yield "Option 4";
            }
            default -> {
                System.out.println("Invalid");
                yield  "Invalid";
            }
        };
        System.out.println(message);

    }
}

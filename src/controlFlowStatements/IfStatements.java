package controlFlowStatements;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {

        System.out.print("[+] Insert age: ");
        int age = new Scanner(System.in).nextInt();

        if (age > 18 || age < 25) {
            System.out.println("This user has been allowed");
        } else if (age < 0) {
            System.out.println("Invalid");
        } else {
            System.out.println("The end");
        }

    }
}

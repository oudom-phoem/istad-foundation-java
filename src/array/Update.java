package array;

import java.util.Arrays;
import java.util.Scanner;

public class Update {
    public static void main(String[] args) {

        System.out.print("[+] Insert array length: ");
        int n = new Scanner(System.in).nextInt();
        String[] names = new String[n];

        for (int i = 0; i < names.length; i++) {
            System.out.print("[+] Insert name [" + i + "] = ");
            names[i] = new Scanner(System.in).nextLine();
        }

        System.out.println("All names before:");
        for (String nm : names) {
            System.out.println(nm);
        }

        System.out.print("[+] Insert old name to update: ");
        String oldName = new Scanner(System.in).nextLine();
        for (int j = 0; j < names.length; j++) {
            if(names[j].equals(oldName)) {
                System.out.print("[+] Insert new name: ");
                String newName = new Scanner(System.in).nextLine();
                names[j] = newName;
                break;
            }

        }

        System.out.println("All names after:");
//        for (String nm : names) {
//            System.out.print(nm + " | ");
//        }
        Arrays.stream(names).forEach(System.out::println);




    }
}

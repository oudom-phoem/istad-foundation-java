package section4_array;

import java.util.Arrays;
import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {

        System.out.print("[+] Insert array length: ");
        int n = new Scanner(System.in).nextInt();
        String[] names = new String[n];

        for (int i = 0; i < names.length; i++) {
            System.out.print("[+] Insert name [" + i + "] = ");
            names[i] = new Scanner(System.in).nextLine();
        }

//        for (String nm : names) {
//            System.out.println(nm);
//        }

        Arrays.stream(names).forEach(System.out::println);
//        Arrays.stream(names).map(e->e).forEach(System.out::println);


    }
}

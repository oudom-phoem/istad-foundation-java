package array;

import java.util.Arrays;
import java.util.Scanner;

public class CinemaSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("[+] Insert row: ");
        int row = scanner.nextInt();

        System.out.print("[+] Insert column: ");
        int col = scanner.nextInt();

        String[][] seats = new String[row][col];


        for (int i = 0; i < seats.length; i++) {
            Character seatC = 'A';
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = seatC + "-" + (i + 1) + ": AV";
                seatC++;
            }

        }

        for (String[] seat:seats) {
            System.out.println(Arrays.toString(seat));
        }

    }
}

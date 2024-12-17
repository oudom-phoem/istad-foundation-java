package array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[][] names = InputValues();

        Output(names);

        UpdateValue(names);

        Output(names);
    }

    static void UpdateValue(String[][] names) {

        System.out.print("[+] Insert name to update: ");
        String oldName = scanner.nextLine();

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                if(oldName.equals(names[i][j])) {
                    System.out.print("[+] Insert new name: ");
                    names[i][j] = scanner.nextLine();
                    break;
                }
            }
        }

    }

    static String[][] InputValues() {
        System.out.print("[+] Insert row: ");
        int row = new Scanner(System.in).nextInt();

        System.out.print("[+] Insert column: ");
        int column = new Scanner(System.in).nextInt();

        String[][] names = new String[row][column];

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.print("[+] Insert name of student[" + i + "][" + j + "] = ");
                names[i][j] = new Scanner(System.in).nextLine();
            }
        }

        return names;

    }

    static void Output(String[][] arrs) {
        for (String[] n : arrs) {
            System.out.println(Arrays.deepToString(n));
        }
    }

    static void ColumnsOfJaggedArray() {
        int[][] numbers = {{1}, {2, 3}, {4, 5, 6}};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println("Column of row " + (i + 1) + " = " + numbers[i].length);
//                break;
            }
        }
    }

    static void Initialize() {
        String[][] names = {{"M", "N"}, {"O", "P"}};

        System.out.println(Arrays.deepToString(names));

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[0].length; j++) {
                System.out.print(names[i][j] + ", ");
            }
        }
        System.out.println();

        for (String[] s : names) {
            for (String ss : s) {
                System.out.print(ss + ", ");
            }
        }
    }
}

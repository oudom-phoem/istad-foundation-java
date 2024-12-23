package section6_methods;

import java.util.Arrays;

public class BubbleSort {

    // change array
    static void sortArray(Integer[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }

            }
        }
    }

    public static void main(String[] args) {
        Integer[] n = {44, 54, -24, 53, 6, 1, 77, -9, 18};
        System.out.println("Before sort");
        System.out.println(Arrays.toString(n));
        sortArray(n);
        System.out.println("After sort");
        System.out.println(Arrays.toString(n));
    }
}


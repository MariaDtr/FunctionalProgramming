package Functionalprogramming;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class P02_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();

        Function <int [], String> count = e -> "Count = " + e.length;
        Function <int [], String> sum = e -> "Sum = " + Arrays.stream(e).sum();

        System.out.println(count.apply(numbers));
        System.out.println(sum.apply(numbers));




    }
}

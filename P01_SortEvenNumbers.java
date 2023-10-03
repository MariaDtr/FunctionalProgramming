package Functionalprogramming;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P01_SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        Function<List<Integer>, String> format = n -> n.stream().map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(format.apply(numbers));

        List<Integer> sorted = numbers.stream().sorted().collect(Collectors.toList());

        System.out.println(format.apply(sorted));

    }
}

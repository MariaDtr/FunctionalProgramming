package Functionalprogramming;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class E03_CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Function<Integer [], Integer> findSmallest = n -> {
            return Arrays.stream(n)
                    .min((a,b) -> Integer.compare(a,b))
                    .get();
        };

        Integer [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        Integer smallestNumber = findSmallest.apply(numbers);
        System.out.println(smallestNumber);
    }


}

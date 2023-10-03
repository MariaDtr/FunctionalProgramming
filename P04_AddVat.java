package Functionalprogramming;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class P04_AddVat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Prices with VAT:");

        UnaryOperator <String> pricesWithVAT = p -> String.format("%.2f", Double.parseDouble(p) * 1.2);

        Arrays.stream(scanner.nextLine().split(", ")).map(pricesWithVAT).forEach(System.out::println);
    }
}

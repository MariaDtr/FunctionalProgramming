package Functionalprogramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class E02_KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer<String> append = (s) -> System.out.println("Sir " + s);

        Arrays.stream(scanner.nextLine().split(" ")).forEach(append);
    }
}

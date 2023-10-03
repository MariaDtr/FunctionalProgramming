package Functionalprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class E01_Cosumerprint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrays.stream(scanner.nextLine().split(" ")).forEach(System.out::println);
    }
}

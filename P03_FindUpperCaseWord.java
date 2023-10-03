package Functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P03_FindUpperCaseWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String [] word = text.split(" ");

        Predicate <String> isUpperCase = c -> Character.isUpperCase(c.charAt(0));

        Function <String[],List <String>> filterUpperCase = w -> Arrays.stream(w)
                .filter(isUpperCase)
                .collect(Collectors.toList());

        List<String> upperCase = filterUpperCase.apply(word);

        System.out.println(upperCase.size());
        Consumer <String> print = System.out::println;

        upperCase.forEach(print);
    }
}

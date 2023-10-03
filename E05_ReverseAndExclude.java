    package Functionalprogramming;

    import java.util.Arrays;
    import java.util.Collections;
    import java.util.List;
    import java.util.Scanner;
    import java.util.function.Consumer;
    import java.util.function.Function;
    import java.util.function.Predicate;
    import java.util.stream.Collectors;

    public class E05_ReverseAndExclude {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            List <Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            int divisible = Integer.parseInt(scanner.nextLine());

            Predicate<Integer> divisibleNumbers = num -> num % divisible == 0;
            numbers.removeIf(divisibleNumbers);
            Collections.reverse(numbers);

            Consumer<List<Integer>> print = list -> list.forEach(e -> System.out.print(e + " "));

            print.accept(numbers);

        }
    }

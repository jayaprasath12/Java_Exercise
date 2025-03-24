import java.util.*;

class Sum_reduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-2, 0, 4, 6, 8);
        int sum = numbers.stream()
            .reduce(0, (element1, element2) -> element1 + element2);

        System.out.println("The sum of all elements is " + sum); 
    }
}
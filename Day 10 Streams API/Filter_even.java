import java.util.Arrays;
import java.util.List;

public class Filter_even {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("The even numbers are");
        numbers.stream() 
               .filter(n -> n % 2 == 0) // finding even numbers
               .forEach(System.out::println); 
    }
}

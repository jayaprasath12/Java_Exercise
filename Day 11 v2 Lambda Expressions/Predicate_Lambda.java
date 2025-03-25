import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicate_Lambda {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = Arrays.asList(10,20,35,55,74,87,91);
        Predicate<Integer> greaterThanFifty = num -> num > 50;
        
        List<Integer> filterNum = listOfNumbers.stream().filter(greaterThanFifty).collect(Collectors.toList());

        System.out.println("The numbers greater than 50 are :" + filterNum);
    }
}

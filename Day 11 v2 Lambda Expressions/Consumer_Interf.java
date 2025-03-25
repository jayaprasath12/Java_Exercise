import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_Interf {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Air", "Wind", "Water", "Fire");

        Consumer<String> printName = (name) -> System.out.println(name);
        names.forEach(printName);
    }
}
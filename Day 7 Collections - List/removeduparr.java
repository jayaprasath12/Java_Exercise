import java.util.ArrayList;
import java.util.HashSet;

public class removeduparr {
    public static void main(String[] args) {

        // Create ArrayList with one duplicate element.
        ArrayList<String> values = new ArrayList<>();
        values.add("cat");
        values.add("dog");
        values.add("cat");
        values.add("bird");

        // Create HashSet from ArrayList.
        HashSet<String> set = new HashSet<>(values);

        // Create ArrayList from the set.
        ArrayList<String> result = new ArrayList<>(set);

        // The result.
        System.out.println(result.toString());
    }
}

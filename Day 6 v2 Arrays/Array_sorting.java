import java.util.Arrays;
public class Array_sorting {
    public static void main(String[] args) {
        String[] arr = {"Earth", "Air", "Water", "Fire"};

        Arrays.sort(arr);
        System.out.println("Changed to alphabetical order :" + Arrays.toString(arr));
    }
}

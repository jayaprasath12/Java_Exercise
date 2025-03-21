import java.util.LinkedHashSet;
public class Linked_hset {
    public static void main(String[] args) {
        LinkedHashSet<String> procedure = new LinkedHashSet<>();
        
        procedure.add("Step 1");
        procedure.add("Step 2");
        procedure.add("Step 2");
        procedure.add("Step 5");
        procedure.add("Step 3");
        procedure.add("Step 4");
        procedure.add("Step 1");

        System.out.println(procedure);
    }
}

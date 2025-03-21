import java.util.*;

public class Tree_map {
    public static void main(String[] args) {
        TreeMap<String,Integer> tree = new TreeMap<>();
        tree.put("Akash", 1);
        tree.put("Naresh", 2);
        tree.put("Karthik", 3);
        tree.put("Bhuvi", 4);

        System.out.println(tree);

        HashMap<String,Integer> hash = new HashMap<>();
        hash.put("Akash", 1);
        hash.put("Naresh", 2);
        hash.put("Karthik", 3);
        hash.put("Bhuvi", 4);
        
        System.out.println(hash);
    }    
}

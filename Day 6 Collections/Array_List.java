import java.util.ArrayList;
import java.util.List;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>(20);
        ArrayList<Integer> al2 = new ArrayList<>(List.of(11,14,17,19,17));

        al1.add(20);
        al1.add(0,80);
        System.out.println(al1);

        al1.addAll(1, al2);
        System.out.println(al1);
    
        System.out.println(al1.contains(15));    
        System.out.println(al1.contains(14)); 
        
        System.out.println(al1.get(5));

        System.out.println(al1.indexOf(17));
        System.out.println(al1.lastIndexOf(17));

        al1.set(4, 10);
        System.out.println(al1);
        
    
    }    
}

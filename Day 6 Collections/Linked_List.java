import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<>();
        
        ll1.add(20);
        System.out.println(ll1);

        ll1.add(1, 85);
        System.out.println(ll1);

        ll1.addFirst(28);
        System.out.println(ll1);

        ll1.addLast(26);
        System.out.println(ll1);

        ll1.get(2);
        System.out.println(ll1.get(2));

        ll1.contains(26);
        System.out.println(ll1.contains(26));
    }
}
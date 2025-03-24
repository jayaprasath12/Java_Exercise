import java.util.*;
public class LinkHashMap {
    public static void main(String[] args) {
         LinkedHashMap <String,Integer> Hierar = new LinkedHashMap<>();
        
         Hierar.put("President", 1);
         Hierar.put("Vice-President", 2);
         Hierar.put("Prime Minister", 3);
         Hierar.put("Minister",4);
         Hierar.put("State Governor", 5);

         System.out.println(Hierar);//gets output as per it was ordered in the code
    }
}

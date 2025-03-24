import java.util.*;

public class Hash_map {
    public static void main(String[] args) {
        HashMap <String,Integer> Details = new HashMap<>();
        //adding new key & values
        Details.put("Naruto", 001);
        Details.put("Itachi", 002);
        Details.put("Jiraya", 003);
        Details.put("Tobirama", 004);

        System.out.println(Details);
        //getting info about particular keys
        int info = Details.get("Jiraya");

        System.out.println(info);
    
        System.out.println(Details.get("Kakashi")); //unknown key will give null 
        //checking for availability 
        System.out.println(Details.containsKey("Naruto"));        
        System.out.println(Details.containsKey("Kakashi"));//unknown key 

        System.out.println(Details.containsValue(005));//unknown value
        System.out.println(Details.containsValue(003));
        //removing the key
        Details.remove("Tobirama");
        System.out.println(Details);


    }
}

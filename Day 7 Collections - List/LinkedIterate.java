import java.util.LinkedList;
public class LinkedIterate {
    public static void main(String[] args) {
        LinkedList<String> student = new LinkedList<>();

        student.add("Itachi");
        student.add("Shisui");
        student.add("Obito");
        student.add("Madara");

        System.out.println("The students names are :");
        for (String value : student){
            System.out.println(value);
        }
    }
}

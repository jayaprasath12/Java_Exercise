import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Using_Static {
    public static void method1(String message) {
        System.out.println(" Static " + message);
    }
}

class Using_Instance {
    public void method2(String message) {
        System.out.println(" Instance " + message);
    }
}

public class Method_Refer {
    public static void main(String[] args) {
         List <String> messages = Arrays.asList( "Method", "Reference");
         messages.forEach(Using_Static::method1);

         List<String> messages2 = Arrays.asList( "MEthod", "Reference");
         Using_Instance obj = new Using_Instance();
         messages2.forEach(obj::method2);
    }    
}

interface MyInterface{
    static void statMethod(){
        System.out.println("This is static");
    }
}

class Model1 implements MyInterface{
    public void statMethod(){
        System.out.println("This is overriden");
    }
}
public class Static_interface {
    public static void main(String[] args) {
        MyInterface.statMethod();// Output is "This is static"
        
        Model1 obj = new Model1();
        obj.statMethod();// Output error bcz it cant be overriden
    }
    
}

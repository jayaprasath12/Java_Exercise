interface Interface1{
    default void DefMethod(){
        System.out.println("This is default method");
    }
}

class Model1 implements Interface1{
    public void DefMethod(){
        System.out.println("This is overriden");
    }
}

class Model2 implements Interface1{}

public class Default_interface {
    public static void main(String[] args) {
        
        Model1 obj1 = new Model1();
        obj1.DefMethod();

        Model2 obj2 = new Model2();
        obj2.DefMethod();

    }    
}

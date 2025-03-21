interface A {
    public abstract void add(int a, int b);
}
interface B {
    public abstract void add1(int x, int y);
}
class C implements A, B {
   @Override
    public void add(int a, int b) {
        System.out.println("Adding = " + (a + b));
    }
    @Override
    public void add1(int a, int b) {
        System.out.println("Adding = " + (a + b));
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.add(30, 40);
        obj.add1(50, 70);
    }
}

class Team {
    void print(int age) {
        System.out.println("Player Age: " + age);
    }

    void print(String name) {
        System.out.println("Player name: " + name);
    }

    void print(char initial) {
        System.out.println("Player initial: " + initial);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Team csk = new Team();
        csk.print(28);
        csk.print("Ruturaj");
        csk.print("G");
    }
}

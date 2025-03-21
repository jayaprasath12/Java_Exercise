class India {
    void performance() {
        System.out.println("PErformance is excellent");
    }
}

class Batting extends India {
    @Override
    void performance() {
        System.out.println("Batting is Good");
    }
}

class Bowling extends India {
    @Override
    void performance() {
        System.out.println("Bowling is excellent");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        India india = new India();
        India bat = new Batting();
        India bowl = new Bowling();

        india.performance(); 
        bat.performance();   
        bowl.performance();   
    }
}


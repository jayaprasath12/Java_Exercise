import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Cel_to_Fahr {
    public static void main(String[] args) {
        List<Double> cel = Arrays.asList(0.0,28.0,37.0,98.0);//4 random Degree Celsius 
        Function<Double, Double> Fahr = c -> (c * 9 / 5) + 32;//Formula
        
        List<Double> convertedValue = cel.stream().map(Fahr).collect(Collectors.toList());
        System.out.println("Converted Temperature is :" + convertedValue);
    }    
}

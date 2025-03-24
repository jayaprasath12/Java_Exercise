import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
 
public class Uppercase_map{
	public static void main(String[] args)
	{
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Raspberries");
		fruits.add("Cherry");
		fruits.add("Mango");
		fruits.add("Date");
		fruits.add("Watermelon");
 
		System.out.println("Original Strings : " + fruits);
 
		List<String> modifiedstrings = fruits.stream().map(String::toUpperCase).collect(Collectors.toList());
 
		System.out.println("Modified Strings : " + modifiedstrings);
	}
}
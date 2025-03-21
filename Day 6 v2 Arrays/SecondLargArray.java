import java.util.Arrays;
public class SecondLargArray {
    
    public static void finding(int arr[]){

        int size = arr.length;
        if(size < 2){
            System.out.println("Not enough elements");
            return;
        }

        Arrays.sort(arr);
        System.out.println(arr[size - 2]);
    }
    public static void main(String[] args) {
        int arr[] = {1, 9, 5, 11, 3, 7};
        finding(arr);    
    }
}

import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        int[] num = {2, 4, 6, 8, 10};
        reverseArray(num);
        System.out.println("The revered order is:" + Arrays.toString(num));
    }
     public static void reverseArray(int[] num){
        int left = 0;
        int right = num.length -1;
        while(left < right){
            int temp = num[left];
            num[left] = num[right];
            num[right] = temp;
            left++;
            right--;
        }
     }
}

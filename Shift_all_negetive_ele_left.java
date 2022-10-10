import java.util.Arrays;

public class Shift_all_negetive_ele_left {
    static int[] shift(int []arr){
        int end = arr.length;

        for(int i= arr.length-1; i>=0; i--){

            if(arr[i] < 0){
                end--;
                int temp = arr[i];
                arr[i] = arr[end];
                arr[end] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {-1,-2,-3,8,6,4,9};
        shift(arr);
        System.out.println(Arrays.toString(arr));
    }
}

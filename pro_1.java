import java.util.Arrays;

public class pro_1 {


    static int[] sotr012(int arr[]){
        int l= 0;
        int r = arr.length-1;
      //   int i =0;
        for(int i=0; i< arr.length; i++){

            if(arr[i] == 0){
                int tmp = arr[i];
                arr[i] = arr[l];
                arr[l] = tmp;
            }else if(arr[i] == 1){
                i++;
            }else {
               int tmp = arr[i];
               arr[i] = arr[r];
               arr[r] = tmp;
               r--;
            }
           // i++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {0, 2, 1, 2, 0};

        sotr012(arr);

        System.out.println(Arrays.toString(arr));
    }
}
//Problem 1:
//        Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
//        Example 1:
//        Input:
//        N = 5
//        arr[]= {0 2 1 2 0}
//        Output:
//        0 0 1 2 2
//        Explanation: 0s 1s and 2s are segregated into ascending order.

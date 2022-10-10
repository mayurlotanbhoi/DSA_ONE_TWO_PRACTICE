import java.util.Arrays;
import java.util.Stack;

public class OnePlusLeedCode66 {
 static int[] AddOne(int[] arr,int n){

     for(int i = arr.length-1; i>=0; i--){

         if(arr[i] != 9){
             arr[i] = arr[i]+1;
             break;
         }else {

             arr[i] = 0;
         }
     }

     if(arr[0] == 0){
         int []ans = new int[arr.length+1];
         ans[0] = 1;
         System.out.println(Arrays.toString(ans));
         return  ans;
     }
     System.out.println(Arrays.toString(arr));
    return arr;
 }

    public static void main(String[] args) {
        int[] arr = {8,9,9,9,9};
        int n = arr.length;
        System.out.println(AddOne(arr,n));

    }
}

package Basic_50_Arrays_Que;

import java.sql.SQLOutput;

public class Cyclic_Rotation_Array_By_1 {
    static void RotedArray(int [] arr){
        int n= arr.length;
        for(int i=0; i< n; i++){
            int temp = arr[i];
            arr[i] = arr[n-1];
            arr[n-1] = temp;
        }
    }

    public static void main(String[] args) {   // first pass 5 2 3 4 1
        int []arr = new int[]{1,2,3,4,5};      //        2   5 1 3 4 2
       // int n = arr.length;                  //        3   5 1 2 4 3
        RotedArray(arr);                       //        4   5 1 2 3 4
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

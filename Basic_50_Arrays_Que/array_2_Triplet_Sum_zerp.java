package Basic_50_Arrays_Que;

import java.util.HashMap;
import java.util.HashSet;

//Given an array arr[] of n integers. Check whether it contains a triplet that sums up to zero.
//
//        Example 1:
//
//        Input: n = 5, arr[] = {0, -1, 2, -3, 1}
//        Output: 1
//        Explanation: 0, -1 and 1 forms a triplet
//        with sum equal to 0.
public class array_2_Triplet_Sum_zerp {
    static boolean CheakTripletZero(int[] arr, int n){

        HashSet<Integer> map = new HashSet<>();

        for(int i=0; i<n; i++){

            for(int j=i+1; j<n; j++){

                int sum =- (arr[i] + arr[j]);

                if(map.contains(sum)){
                    return true;
                }else{
                    map.add(arr[j]);
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{0,-1,2,-3,1};
   int n = arr.length;
        System.out.println(CheakTripletZero(arr,n));
    }
}

package Basic_50_Arrays_Que;
//Given an array arr[] of positive integers of size N. Reverse every sub-array group of size K.
//
//
//
//        Example 1:
//
//        Input:
//        N = 5, K = 3
//        arr[] = {1,2,3,4,5}
//        Output: 3 2 1 5 4
//        Explanation: First group consists of elements
//        1, 2, 3. Second group consists of 4,5.

import java.util.ArrayList;

public class Array_3_reverce_group_Of_arry {

    void reverse(ArrayList<Integer> arr, int n, int k){

        if(k >= n) k = n;

        int start = 0, end = k-1;

        while(start < n && end < n){

            int s = start ,e = end;

            while(s < e){

                int temp = arr.get(s);
                arr.set(s,arr.get(e));
                arr.set(e, temp);
                s++;
                e--;
            }

            start = end+1;
            end = start+k-1;

            if(end >= n) end = n-1;
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        int n = 6;
        int k = 3;
        for(int i=1 ; i<=n; i++){
            arr.add(i);
        }
        Array_3_reverce_group_Of_arry ob = new Array_3_reverce_group_Of_arry();

         ob.reverse(arr,n,k);
        System.out.println(arr);

    }
}

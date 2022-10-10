import java.util.Arrays;

public class Smmalpro2 {
    public static void main(String[] args) {
        int arr[] = {1, 1, 0, -1, -2};

        Arrays.sort(arr);
//[-10, -1, 2, 3, 6, 7, 8, 15]
      //  System.out.println(Arrays.toString(arr));
        int cheak1=0;
        for(int j : arr){

            if(j != 1) {
                cheak1 = 1;
//                return;
            }
        }
        if(cheak1 == 0) {
            System.out.println("1");
            return;
        }

      for(int i=0; i< arr.length-1; i++){

          int nexval = arr[i];

          if(arr[i] > 0 && arr[i+1] != nexval+1){
              System.out.println(nexval+1);
              break;
          }
      }

    }
}
//Problem 2:
//        You are given an unsorted array with both positive and negative elements. You have to find the smallest positive number missing from the array.
//        Input:  {2, 3, 7, 6, 8, -1, -10, 15}
//        Output: 1
//        Input:  { 2, 3, -7, 6, 8, 1, -10, 15 }
//        Output: 4
//        Input: {1, 1, 0, -1, -2}
//        Output: 2

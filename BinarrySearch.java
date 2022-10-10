import java.util.Arrays;

public class BinarrySearch {
    static int sarch(int[] arr,int target){
        int l = 0;//LOW == l
        int h = arr.length-1;// higth == h
        int mid = 0; // midal == mid
        while(l<=h) {
            mid = l + (h - l) / 2;

            if (target == arr[mid]) {
                return mid;
            }
            if (target > mid) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }

 Arrays.binarySearch(arr,5 );
        }
        return mid;
    }
    public static void main(String[] args) {
      int[] arr =new int[]{1,2,3,4,5,6,};
      int target=4;
        System.out.println( sarch(arr , target));
    }
}

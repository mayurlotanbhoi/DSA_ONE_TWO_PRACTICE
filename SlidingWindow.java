import java.util.ArrayList;

public class SlidingWindow {
    public static void main(String[] args) {
        int []arr = {5,9,8,3,8,100,-200};
        int k = 2;
         int ans = Integer.MIN_VALUE;
        int sum = 0;
         for(int i=0; i< arr.length; i++){
              sum += arr[i];
             if(i >=k){
                 sum -= arr[i-k];
             }
             if(i >= k-1 && ans<sum){
                 ans = sum;
             }
         }
        System.out.println(ans);

        ArrayList<Integer> ar = new ArrayList<>();
    }
}

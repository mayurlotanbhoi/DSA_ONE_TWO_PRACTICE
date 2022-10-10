import java.util.HashSet;
import java.util.Set;

public class ZeroSumPresentOrNot {

    static boolean  checkZeroSum(int []arr, int k){

       int sum = 0;
        Set<Integer> st = new HashSet<>();
        st.add(sum);

        for(int i : arr){
             sum += i;
             int rem = sum-k;
            System.out.println(st);
             if(st.contains(rem)){
                return  true;
             }
             st.add(sum);


        }

          return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,-3,4,7,2,1};
        int k = 9;
        System.out.println(checkZeroSum(arr,k));
    }
}

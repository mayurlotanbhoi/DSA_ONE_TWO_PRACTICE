

import java.util.HashSet;
import java.util.Set;

public class find_pairs_of_sum {
      static String find(int[] arr){
        Set<Integer> set = new HashSet<>();
        int sum =0;
        for(int i=0; i< arr.length; i++){

            for(int j=i+1; j< arr.length; j++){
                sum = arr[i]+arr[j];
                if(set.contains(sum)){
                    System.out.println(sum);
                    return "find";
                }else{
                    set.add(sum);
                }
            }
        }
        return "not_present";
    }

    public static void main(String[] args) {
        int[] arr = {1,7,0,9,2,3,5};

        //find_pairs_of_sum boj = new find_pairs_of_sum(arr);
        System.out.println(find(arr));

    }
}

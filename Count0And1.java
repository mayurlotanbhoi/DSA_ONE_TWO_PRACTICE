import java.util.HashMap;
import java.util.Map;

public class Count0And1 {
    static int count(int[] arr){
        int ans = 0;
        Map<Integer, Integer> contain = new HashMap<>();
        contain.put(0 ,1);
        for(int i=0;i< arr.length;i++){

            int sum=0;
            if(arr[i] == 0){
                sum+=-1;
            }else{
                sum+=+1;
            }

            if(contain.containsKey(sum)){
                ans += contain.get(sum);
                contain.put(sum , contain.get(sum) +1);
            }else {
                contain.put(sum,1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
      int[] arr = new int[]{0,1,0,1,0,1,0,1,0};

        System.out.println(count(arr));
    }
}

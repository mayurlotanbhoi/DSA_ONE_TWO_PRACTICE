import java.util.HashMap;

public class LargestSubArray {

    static int longSubArray(int[] arr,int n, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0, maxlen=0;

        for(int i=0; i<n;i++){

            sum+=arr[i];

            if(sum == k)

                maxlen = i+1;


            if(!map.containsKey(sum)){
                map.put(sum ,i);
            }

            if(map.containsKey(sum-k)){

                if(maxlen< (i-map.get(sum-k)))
                    maxlen = i-map.get(sum-k);
            }
        }
        return maxlen;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int n = arr.length;
        int k = 15;
        System.out.println("Length = " +
                longSubArray(arr, n, k));
    }
}

import java.util.HashMap;

public class LongestSubarrayWithSum_k {

  static int  find_subArray(int[] arr ,int target){

      HashMap<Integer,Integer> map = new HashMap<>();
      int maxLen = 0;
      int sum = 0;
      for(int i=0; i<arr.length; i++){
          sum += arr[i];

          if(sum == target){
              maxLen = i+1;
          }

          if(!map.containsKey(sum)){
            map.put(sum,i);
          }
            if(map.containsKey(sum-target)){

                if(maxLen < (i-map.get(sum-target)))
                    maxLen = (i-map.get(sum-target));
                }




      }
      return maxLen;
  }

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,4,6,5,8};
        int n = 9;
        System.out.println(find_subArray(arr,n));
    }
}

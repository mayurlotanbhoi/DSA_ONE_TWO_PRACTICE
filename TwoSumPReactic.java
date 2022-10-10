import java.util.HashMap;
import java.util.Map;

public class TwoSumPReactic {

    public static void main(String[] args) {
        int[] arr = new int[]{4,4,5,6,8,9,7};
int target = 8;

FindSum(arr,target);

    }

    public  static void FindSum(int[] arr, int tar){
        Map<Integer, Integer> map =new HashMap<>();

        for(int i=0; i<arr.length; i++){

            int isPresent = tar - arr[i];

            if(map.containsKey(isPresent)){
                System.out.println(arr[map.get(isPresent)]+" "+ arr[i]);
            }else {
                map.put(arr[i],i);
            }

        }
        System.out.println(map);
    }
}

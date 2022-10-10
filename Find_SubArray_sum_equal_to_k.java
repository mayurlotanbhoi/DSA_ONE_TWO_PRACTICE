import java.util.HashMap;

public class Find_SubArray_sum_equal_to_k {
    static boolean find(int arr[], int k){

        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;

        for(int i=0; i< arr.length;i++){

            sum += arr[i];

            if(sum == k) {
                System.out.println(0+" "+i);
                return true;
            }

            if(map.containsKey(sum-k)){
                System.out.println(map.get(sum-k)+1+" "+i);
                return true;
            }else {
                map.put(sum,i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,0,7,3,6};
        int k = 9;

        System.out.println(find(arr,k));
    }
}

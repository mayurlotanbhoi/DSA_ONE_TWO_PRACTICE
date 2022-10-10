import java.util.HashMap;

public class subArrayofGivenSum {

    public static void main(String[] args) {

        int []arr = new int[]{1,7,8,4,5,6};

        int target = 15;


        System.out.println(FindeSubArry(arr, target));

    }

    static int FindeSubArry(int []arr,int target){

        HashMap<Integer, Integer> map = new HashMap<>();
        int CurrSum =0;
        int start = 0;
        int end = -1;

        for(int i=0; i<arr.length; i++){
            CurrSum += arr[i];

            if(CurrSum - target == 0){
                start = 0;
                end = i;
                System.out.println(start +" "+ end);
                return 1;
            }
            if(map.containsKey(CurrSum - target) ){
                start = map.get(CurrSum - target) +1 ;
                end = i;
                System.out.println(start +" "+ end);
                return 1;
            }
            map.put(CurrSum, i);
        }
        System.out.println(map);
        return 0;
    }
}

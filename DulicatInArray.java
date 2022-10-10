import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DulicatInArray {

    public static void main(String[] args) {

        int[] arr =new int[]{1,22,22,34, 55,55};
        int ext[] = new int[arr.length];
        int k=0;
        int count = 1;
          Arrays.sort(arr);
        for(int i =0;i< arr.length-1;i++){
 if(arr[i] == arr[i+1]){
     count++;
 }
            if(arr[i] != arr[i+1]){


               System.out.print(arr[i]+"-> "+count+" ");
               count=1;
            }

        }

        System.out.print(arr[arr.length-1]+"-> "+count);
        System.out.println();

        HashMap<Integer,Integer> map = new HashMap();

        for(int i=0;i< arr.length;i++){

            if(map.containsKey(arr[i])){

                map.put(arr[i],map.get(arr[i])+1 );
            }else{

                map.put(arr[i],1 );
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()) System.out.println(entry.getKey() +" =>"+entry.getValue());



    }
}


import java.util.HashMap;
import java.util.Map;

public class Dubica {

    public static void main(String[] args) {
        int [] arr = new int[]{5,5,6,8,7,9,5};

        HashMap <Integer,Integer> map = new HashMap();

        for(int i=0 ; i< args.length; i++){

            if(map.containsKey(arr[i])){

                map.put(arr[i], map.get(arr[i])+1 );
            }else{

            map.put(arr[i],1 );
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet())
            System.out.println(entry.getKey()+" "+ entry.getValue());



    }
}

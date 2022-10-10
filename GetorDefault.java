import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GetorDefault {
    public static void main(String[] args) {
        String str = "nmbfhhfbfdbfkjb";

        HashMap<Character,Integer> map = new HashMap<>();


        for(int i =0; i<str.length(); i++){

            map.put(str.charAt(i) , map.getOrDefault(str.charAt(i) ,0)+1);
        }
        int arr[] = new int[map.size()];
      int i=0;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
           arr[i] = entry.getValue();
           i++;
        }
       // System.out.println(map);
        Arrays.sort(arr);
        for(int j=0; j< arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }

}

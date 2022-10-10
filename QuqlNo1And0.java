import java.util.HashMap;
import java.util.HashSet;

public class QuqlNo1And0 {


       static int find(int arr[], int  n){
           int sum = 0;
           int couont = 0;

           HashMap<Integer,Integer> map = new HashMap<>();

           for(int i=0; i<n; i++){

               if(arr[i] == 0) arr[i] = -1;

               sum += arr[i];
               if(sum == 0){
                   couont++;
               }

               if(map.containsKey(sum)){
                   couont += map.get(sum);
               }
               map.put(sum,map.getOrDefault(sum,0)+1);
           }
          return couont;
       }

    public static void main(String[] args) {
        int []arr = {1, 0, 0, 1, 0, 1, 1};
        int n= arr.length;

        System.out.println(find(arr,n));

    }

}

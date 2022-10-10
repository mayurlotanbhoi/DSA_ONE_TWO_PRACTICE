import java.util.*;

public class Fequency_sort {



    public static void main(String[] args) {
        int []arr = {3,3,2,2,1,1,3,2};
        int n= arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);

        ArrayList<Integer> list = new ArrayList<>();

        for(int num : map.keySet()){
            list.add(num);
        }
        System.out.println(list);

        Collections.sort(list, (a, b) -> {

            if ((map.get(a) == map.get(b))) {

                return b-a ;

            } else {
                return map.get(a) - map.get(b);
            }

        });
        System.out.println(list);
    }
}

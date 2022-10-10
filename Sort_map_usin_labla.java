import java.util.*;

public class Sort_map_usin_labla {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("mayur" , 100);
        map.put("bhoi" , 1);
        map.put("lotan" , 1);
        map.put("first", 1);
        map.put("secont",2);
       Set<Map.Entry<String,Integer>> entris = map.entrySet();

       List<Map.Entry<String,Integer>> list = new ArrayList<>(entris);

       Collections.sort(list,((o1, o2) -> o2.getValue().compareTo(o1.getValue())));

        System.out.println(list);
    }
}

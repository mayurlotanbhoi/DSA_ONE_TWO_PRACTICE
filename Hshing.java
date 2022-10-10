import java.sql.SQLOutput;

import java.util.HashMap;
import java.util.Map;


public class Hshing {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        map.put("mayur" ,1);
        map.put("bhoi" ,2);
        map.put("lotan" ,3);
        map.put("golu" ,4);


        System.out.println("Size of the map is  "  + map.size());

        System.out.println("element of map  " + map);

        if(map.containsKey("mayur"));

        Integer m = map.get("mayur");

        System.out.println("value of key "+"mayur \" is :-" +m);

         for(Map.Entry<String ,Integer> e : map.entrySet())
             System.out.println("key: " + e.getKey() + " "+"value: " + e.getValue());

    }
}

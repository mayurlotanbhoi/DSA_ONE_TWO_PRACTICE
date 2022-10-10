import java.util.LinkedHashSet;
import java.util.Set;


public class RemovwDublicatBy_Set_Enterface {
    public static void main(String[] args) {


        String str = "proggggnnknkjsandandlkasjsnm,x czxnjcnramming";

        StringBuilder sb1 = new StringBuilder();

        Set<Character> set = new LinkedHashSet();
        for (int i = 0; i < str.length(); i++) {

            set.add(str.charAt(i));

        }

        for (Character c : set) {

            sb1.append(c);
        }
        System.out.println(sb1);


    }
}

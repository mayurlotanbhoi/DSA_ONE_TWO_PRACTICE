import javax.sound.midi.Soundbank;
import java.util.*;

public class WordBreak {
   static boolean Wordb(String str, String[] arr){
       Set<String> set = new HashSet<>();
       for(String i : arr){
           set.add(i);
       }

       boolean dp[] = new boolean[str.length()+1];
       dp[0] = true;
       for(int i=1; i<=str.length(); i++){

           for(int j=0; j<i; j++){

               if(dp[j] && set.contains(str.substring(j,i))){
                   dp[i] = true;
                   break;
               }
           }
       }
       System.out.println(Arrays.toString(dp));
       return dp[str.length()];
   }
    public static void main(String[] args) {
        String str = "mayurbhoi";

        Scanner sc = new Scanner(System.in);
        String[] arr = new String[2];
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.next();
        }

        System.out.println( Wordb(str,arr));



    }

}

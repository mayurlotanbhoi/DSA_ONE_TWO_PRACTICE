import java.util.HashMap;
import java.util.Scanner;

public class c1and0 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String  str = sc.nextLine();
        int sum = 0;
        int count =0;

       // HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++){

            int num = str.charAt(i)-'0';
            if( num == 0){
                num = -1;
            }else{
                num = 1;
            }
            sum += num;

            if(sum == 0){
                count++;
            }
        }
       // System.out.println(map);
        System.out.println(count);

    }
}

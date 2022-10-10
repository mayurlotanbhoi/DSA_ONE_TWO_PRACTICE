import java.util.HashMap;

public class longes {
    static int findStr(String str){
        int n = str.length();
        String ans = "";
        int count=0;
        int anscou = 0;
        int arr[] = new int[256];

        HashMap<Character, Integer> map = new HashMap<>();

        int l = 0;


        for(int i=0; i<str.length(); i++) {


            char ch = str.charAt(i);

            if(arr[i] != 0  ){

            }else{

            }
        }
        return anscou;
    }
    public static void main(String[] args) {
        String str = "abcdjhjgg";

        System.out.println(findStr(str));
    }
}

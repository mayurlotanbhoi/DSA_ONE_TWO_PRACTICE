import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Stack;

public class Longest_valid_parenthesis {
    static  int cheakLength(String str){
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int maxLen = 0;


        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch == '(') st.push(i);
            else st.pop();


            if(st.empty()) st.push(i);
            else maxLen = Math.max(maxLen , i-st.peek());




        }
        return maxLen;
    }
    public static void main(String[] args) {
        String str = ")" +
                "()";
        System.out.println(cheakLength(str));
    }
}

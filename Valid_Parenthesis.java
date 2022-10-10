import java.util.Stack;

public class
Valid_Parenthesis {

    static  boolean cheak(String str){
        Stack<Character> st = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == '(') st.push(')');
           else if(ch == '[') st.push(']');
           else if(ch == '{') st.push('}');

          else if(!st.isEmpty() && st.peek() == ch) st.pop();
          else return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
String Parenthisis = "()()()";
        System.out.println(cheak(Parenthisis));
//cheak(Parenthisis)
    }
}

import java.util.Stack;

public class logest_valid_parantheses {
    static int cheack(String s){
        Stack<Integer> st = new Stack<>();
        int max = 0;
        st.push(-1);

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(i);
            }else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }else {
                    max = Math.max(max, i-st.peek());
                }
            }
        }
return max;
    }

    public static void main(String[] args) {
        String s = "(((()";
        System.out.println(cheack(s));
    }
}

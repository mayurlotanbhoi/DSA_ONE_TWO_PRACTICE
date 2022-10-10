import java.util.Stack;

public class logestpara {
    static int longestpara(String str, int n){
        int max = 0;
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);

            if(ch == '(') st.push(i);
            else st.pop();

            if(st.empty() ) st.push(i);
            else max = Math.max(max, i-st.peek());
        }
        return max;
    }

    public static void main(String[] args) {
        String str = "))(())()";
        int n = str.length();

        System.out.println(longestpara(str,n));
    }
}

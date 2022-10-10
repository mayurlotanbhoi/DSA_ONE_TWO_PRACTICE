import java.util.Stack;

public class Mocklongpara {

    public static void main(String[] args) {
        String str = "()()())";


        System.out.println(findPara(str));
    }

    private static int findPara(String str) {
        Stack<Integer> st = new Stack<>();
        st.add(-1);
        int max = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '(') st.add(i);
            else st.pop();

            if(st.empty()) st.add(i);

            else max = Math.max(max,i-st.peek());
        }
        return max;
    }
}

import java.util.Stack;

public class Implement_queue_using_2_stack {
    static Stack<Integer> s1 = new Stack<>();
  static   Stack<Integer> s2 = new Stack<>();

    static void push(int data){
        s1.push(data);
    }

     static void pop(){

        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int ans = s2.pop();

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
         System.out.println(ans);
       // return ans;
    }

    static void peek(){

        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int ans = s2.peek();

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        System.out.println(ans);
        // return ans;
    }


    public static void main(String[] args) {
        Implement_queue_using_2_stack q = new Implement_queue_using_2_stack();
        Implement_queue_using_2_stack.push(10);
        Implement_queue_using_2_stack.push(20);
        Implement_queue_using_2_stack.push(30);
        Implement_queue_using_2_stack.push(40);
        Implement_queue_using_2_stack.pop();
        Implement_queue_using_2_stack.peek();
    }
}

import java.util.LinkedList;
import java.util.Queue;


public class Implement_Stack_using_two_queue {

 static   Queue<Integer> q1 = new LinkedList<>();
 static   Queue<Integer> q2 = new LinkedList<>();

    
    static  void pop(){
      int x =  q1.poll();
        System.out.println(x);
    }
    static void push(int data){

        while(!q1.isEmpty()){
            q2.offer(q1.poll());
        }

        q1.offer(data);
       // int ans = q2.poll();

        while(!q2.isEmpty()){
            q1.offer(q2.poll());
        }
      //  int ans = q1.poll();
       // System.out.println(ans);
        return;
    }


    public static void main(String[] args) {
        Implement_Stack_using_two_queue st = new Implement_Stack_using_two_queue();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.pop();

    }
}

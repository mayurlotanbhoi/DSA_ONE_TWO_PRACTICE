import java.util.Stack;

public class Implement_Queue_usingStsck {
    static  class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        static  void addInQ(int x){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(x);

            while (!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        static int deletEleInQ(){

            if(s1.isEmpty()){
                System.out.println("Queue is empty");
                System.exit(0);
            }
            int x = s1.pop();
          //  s1.pop();
            return x;
        }
    }

    public static void main(String[] args) {
        Queue Q = new Queue();
        Queue.addInQ(1);
        Queue.addInQ(2);
        Queue.addInQ(3);
        Queue.addInQ(4);
        System.out.println(Queue.deletEleInQ());
        System.out.println(Queue.deletEleInQ());
        System.out.println(Queue.deletEleInQ());
        System.out.println(Queue.deletEleInQ());
        System.out.println(Queue.deletEleInQ());
    }
}

import java.util.Stack;

public class mocl {

    class Node {
        Node next;
        char data;
        Node head  ;

        Node(char data) {
            this.data = data;
        }
    }

        Node head = null;
       public void add(char data){
            Node newnode = new Node(data);

            newnode .next = head;
            head = newnode;

        }

        void print(){
            Node curr = head;

            while(curr != null){
                System.out.print(curr.data+" ");
                curr = curr.next;
            }
        }

        void findmidall(){
           Node fast = head;
           Node slow = head;
           Node prev = null;

           while(fast != null && fast.next != null){
               fast = fast.next.next;
               prev = slow;
               slow = slow.next;
           }
            System.out.println(slow.data);
           return;
        }

        boolean cheakpalindrom(){
            Stack<Character> st = new Stack<>();
            Node curr = head;

            while(curr != null){

                st.push(curr.data);
                curr = curr.next;
            }
            Node temp = head;
            while(temp != null){

                if(temp.data != st.peek()){
                    return false;
                }
                temp = temp.next;
                st.pop();
            }
            return true;
        }



    public static void main(String[] args) {
        mocl ll = new mocl();
        ll.add('c');
        ll.add('a');
        ll.add('m');

        ll.print();
        System.out.println();
       // ll.findmidall();

        System.out.println(ll.cheakpalindrom());
        ll.cheakpalindrom();


    }


}

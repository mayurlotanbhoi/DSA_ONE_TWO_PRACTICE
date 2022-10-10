public class detectloop {

    class Node{
        int data=0;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    static Node head = null;
    Node tail = null;
    void add(int data){
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
       // Node curr = head;
//        while (true){
//            if(curr.next == head){
//                break;
//            }
//            curr = curr.next;
//        }
//
//        tail = curr;
//        tail.next = head;

//        if(curr.next == head){
//
//        }
    }

   void detloop(){

        Node curr = head;
        while(true){

            if(curr.next == null){
                System.out.println(false);
                break;
            }
            if(curr.next == head){
                curr.next = null;
                System.out.println(true);
                break;
            }
            curr = curr.next;
        }
    }

    void print(){
        Node curr = head;
        while (curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }

    Node move0toleft(Node head){

        Node temp = head.next;
        Node prev = head;

        while(temp != null){

            if(temp.data == 0){

               Node curr = temp;
               temp = temp.next;
               prev.next = temp;

               curr.next = head;
               head= curr;
            }
            else {
                prev = temp;
                temp = temp.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        detectloop list = new detectloop();
        list.add(6);
        list.add(0);
        list.add(4);
        list.add(0);
        list.add(2);
        list.add(0);
        list.print();
       list.head = list.move0toleft(list.head);
        list.print();

    }
}

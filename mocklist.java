public class mocklist {
    class Node{
        public Node prev;
        Node next;
        Node head;
        int data;

        public Node(int data) {
            this.data =data;
        }

//        void Node(int data){
//             this.data =data;
//         }
        }
        Node head = null;
      Node next = null;
        void add(int data){
         Node newNode = new Node(data);
          //  if(head == null){
                newNode.next = head;
                head = newNode;
        //    }
        //    else{

         //   }

        }
        void printnode(){

            Node curr = head;

            while(curr != null){

                System.out.print(curr.data+" ");
                curr = curr.next;
            }
        }
        void reve(){
            Node curr = head;
            Node temp = null;
            Node prev =null;

            while(curr != null){

                temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;

            }
//            if(temp != null){
               head = prev;
//            }
        }



    public static void main(String[] args) {

    mocklist ll = new mocklist();
    ll.add(1);
    ll.add(2);
    ll.add(3);
    ll.add(4);
    ll.add(5);
    ll.add(6);
    ll.printnode();
    System.out.println();
    ll.reve();
    System.out.println();
    ll.printnode();
    }
}

import java.util.Arrays;

public class sortlLinklist {
    static int size = 0;

    class Node {
        Node next;
        Node prev;
        int data;


        Node(int data) {
            this.data = data;
        }
    }

        Node head = null;
        void Add(int data) {

            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;


            size++;
        }

        void printfun() {
            if (head == null) {
                System.out.println("null");
                return;
            }

            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data+" ");
                curr = curr.next;
            }
        }

        void rev() {
            Node temp = null;
            Node curr = head;
            Node prev = null;

            while (curr != null) {
                temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
            head = prev;
        }
    static int[] arr = new int[size+1];
        int i = 0;
        void  fillarr(){
            Node curr = head;

            while(curr != null){
                arr[i] = curr.data;
                i++;
                curr = curr.next;
            }
        }


        void sortll(){

            for(int u=0; u<arr.length; i++){

                for(int l=0; l< arr.length-u; l++){

                    if(arr[u] > arr[l]){

                        int temp = arr[u];
                        arr[u] = arr[l];
                        arr[l] = temp;

                    }
                }
            }


        }
    Node prev = null;

        Node reverceKgroup(Node head, int k){

            Node temp = null;
            Node prev = null;
            Node curr = head;
            int count =0;

            while(curr != null && count < k){
                temp = curr.next;
                 curr.next = prev;
                 prev = curr;
                 curr = temp;
                 count++;
            }


            if(temp != null){
                 head.next = reverceKgroup(temp,k);
            }

            return prev;
        }

//        void printk(){
//            Node curr = prev;
//            while (curr != null){
//                System.out.print(curr.data+" ");
//                curr = curr.next;
//            }
//        }




        public static void main(String[] args) {
            sortlLinklist ll = new sortlLinklist();
            ll.Add(6);
            ll.Add(5);
            ll.Add(4);
            ll.Add(3);
            ll.Add(2);
            ll.Add(1);
            ll.printfun();
            int k=2;
         ll.head =    ll.reverceKgroup(ll.head,k);

            System.out.println();
            ll.printfun();
//            ll.rev();
//            ll.printfun();
//            ll.fillarr();
//
//            System.out.println(Arrays.toString(arr));

        }

}

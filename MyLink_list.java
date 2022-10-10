
class Node{
    public Node prev;
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public class MyLink_list<head> {

    Node head = null;
    int length =0;

    void insertAtPost(int pos,int data){

        if(pos <0) return ;

        Node newNode = new Node(data);

        if(pos == 1){
            newNode .next = head;
            head = newNode;
        }else {

            Node curr = head;

            for(int i=0; i<pos-2; i++){
                curr = curr.next;
            }
            newNode.next = curr.next;
            curr.next = newNode;
        }
        length++;
    }

    void deletAtPost(int pos){

        if(pos < 0) return ;

        if(pos ==1){
            Node temp = head;
            head = head.next;
            temp.next = null;

        }
        Node curr = head;
        while(pos -2 !=0){
            curr = curr.next;
            pos--;
        }
        Node temp =  curr.next;
        curr .next = curr.next.next;
            temp.next = null;
            length--;
    }
    void Add(int data){
        Node addData = new Node(data);

        addData.next = head;
        head = addData;
    }

    void PrintAll(){
        Node curr = head;

        while(curr != null){
            System.out.print(curr.data+" ");
            curr= curr.next;
        }
        System.out.println();
    }

    void printrev(){
        Node curr = head;
        Node temp = null;
        Node prev =null;
        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head=  prev;
    }

    public static void main(String[] args) {
        MyLink_list ll = new MyLink_list();

        ll.insertAtPost(1,10);
        ll.insertAtPost(2,20);
        ll.insertAtPost(3,30);
        ll.insertAtPost(4,40);
        ll.insertAtPost(5,50);
        ll.deletAtPost(4);
        ll.PrintAll();
        ll.Add(655165);
        ll.PrintAll();
        ll.printrev();
        ll.PrintAll();


    }
}

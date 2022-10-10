class NodeDll{
    NodeDll next;
    int data;
    NodeDll prev;

    NodeDll(int data){
        this.data = data;
    }
}


public class DublyLinkList {
    NodeDll head = null;
    NodeDll tail = null;
    int length = 0;

void addAtPos(int pos,int data){
    int temPos = pos;
    if(pos < 1 || pos > length+1) {
        return ;
    }
    NodeDll addNode = new NodeDll(data);

    if(pos == 1){
        addNode.next = head;
        if(head != null)  head.prev = addNode;
        head = addNode;
    }else{

        NodeDll curr = head;

        while(pos-2 != 0){
            curr = curr.next;
            pos--;
        }
        NodeDll tem = curr.next;
        addNode.next = tem;
        curr.next = addNode;

        if(tem != null)
            tem.prev = addNode;


        addNode.prev = curr;

    }
    length++;
    if(length == temPos) tail = addNode;
}

void DeletAtpos(int pos){

    if(pos < 1 || pos > length) {
        System.out.println("Invalid index");
        return ;
    }
    if(pos == length) {
        tail = tail.prev;
    }
    if(pos == 1){
        NodeDll tem = head;
        head =head.next;
        head.prev =null;
        tem.next = null;
    }else {
        NodeDll curr =  head;

        while(pos-2 != 0){
            curr = curr.next;
            pos--;
        }
        NodeDll tem = curr.next;
        curr .next = curr.next.next;

        if(tem.next != null) {
            tem.next.prev = curr;
        }
        tem.next = null;
        tem.prev =null;
    }
    length--;
}

 void printFor(){

    NodeDll curr = head;

    while(curr != null){

        System.out.print(curr.data+" ");
        curr = curr.next;
    }
     System.out.println();
 }

 void printrev(){

    NodeDll curr = tail;

    while(curr != null){
        System.out.print(curr.data+" ");
        curr = curr.prev;
    }
     System.out.println();
 }

 void reverce(){

    if(head == null || head.next == null) return ;
    NodeDll curr = head;
    NodeDll temp =null;
    while(curr != null){
         temp = curr.prev;
        curr.prev = curr.next;
        curr.next = temp;
        curr = curr.prev;
    }
    if(temp != null){
        head = temp.prev;
    }
 }

    public static void main(String[] args) {
    DublyLinkList dl = new DublyLinkList();
    dl.addAtPos(1,10);
    dl.addAtPos(2,120);
    dl.addAtPos(3,30);
    dl.addAtPos(3,40);
    dl.addAtPos(4,50);
    dl.addAtPos(4,60);
    dl.addAtPos(5,70);
    dl.addAtPos(5,80);
    dl.addAtPos(6,90);
    dl.DeletAtpos(1);
    dl.printFor();
   // dl.DeletAtpos();
        dl.reverce();
        dl.printFor();
  //  dl.printrev();

    }
}

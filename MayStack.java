
public class MayStack {
    int arr[];
    int top = 0;
    int size;

    MayStack(int size){
        this .size = size;
        arr = new int[size];
    }
     void push(int data){

        if(top+1 < size){
            top++;
            arr[top] = data;
        }else{
            System.out.println("stack is over flow");
        }
     }

     void peek(){
        if(top <= -1){
            System.out.println("Stack is underflow");
        }else{
            System.out.println(arr[top]);
        }
     }

     void pop() {

         if (top <= -1) {
             System.out.println("Stack is underflow");
         } else {
             System.out.println(arr[top]);
              top--;
         }
     }

     int size(){
        return top;
    }

    public static void main(String[] args) {
        MayStack st = new MayStack(25);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st.size());
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
    }
}

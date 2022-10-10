import java.util.Arrays;
import java.util.LinkedList;

public class AddOne {
    static void addone(int arr[], int n){

        for(int i=n-1; i>=0; i--){

            if(arr[i] == 9){
                arr[i] = 0;
            }else{
                arr[i] += 1;
                break;
            }
        }
       // LinkedList<Integer> result = new LinkedList<>();
        for(int i=0; i<n; i++){
            //result.add(arr[i]);
            System.out.print(arr[i]+" ");
        }

       // return result;
    }

    public static void main(String[] args) {



        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(9);
        ll.add(8);
        ll.add(9);

       int n= ll.size();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = ll.pop();
        }
        System.out.println(Arrays.toString(arr));
        addone(arr,n);


    }
}

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Preves_geater_ele {

    static int[] prevEle(int arr1[], int arr2[]){

        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i= arr2.length-1; i>=0; i--){

            while(!st.isEmpty() && st.peek() < arr2[i]){
                map.put(st.pop(), arr2[i]);
            }
            st.push(arr2[i]);
        }
        for(int i=0; i< arr1.length;i++){
            arr1[i] = map.getOrDefault(arr1[i],-1);
        }
        return arr1;
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,5};
        int arr2[] = {1,8,2,3,9,5,7,6};

        prevEle(arr1,arr2);
        System.out.println(Arrays.toString(arr1));
}
}

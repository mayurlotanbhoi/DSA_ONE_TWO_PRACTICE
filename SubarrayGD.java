import java.util.HashMap;
import java.util.Map;

public class SubarrayGD {
    public static void main(String[] args) {
        int[] arr = new int[]{1 ,2, 3, 4, 5, 6};
        int target = 7;


        int sum =0;
        for(int i=0; i< arr.length;i++){

            for(int j =1+i; j< arr.length; j++){
                int rem =  target - arr[i];
                if(arr[j] == rem){
                    System.out.println(arr[i]+" "+rem);
                    return;
                }
            }
            System.out.println("no pair found");

        }

    }
}

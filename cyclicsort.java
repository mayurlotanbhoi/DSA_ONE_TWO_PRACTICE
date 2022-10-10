import java.util.Arrays;

public class cyclicsort {
    static  void cyclicsort(int arr[]){

        int i=0;
        while(i < arr.length){
            int corrposition = arr[i];

            if(arr[i] != arr[corrposition]) {
                int temp = arr[i];
                arr[i] = arr[corrposition];
                arr[corrposition] = temp;
            }
                i++;

        }
    }

    public static void main(String[] args) {
        int arr[] = {6,5,2,3,4,1,0};
        cyclicsort(arr);

        System.out.println(Arrays.toString(arr));
    }
}

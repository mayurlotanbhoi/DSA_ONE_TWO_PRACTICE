import java.util.Arrays;

public class Move_All_zero_to_end {

    public static void main(String[] args) {
        int arr[] = {1, 0, 6, 0, 4, 0, 8};

        int end = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                int temp = arr[end];
                arr[end++] = arr[i];
                arr[i] = temp;

            }

        }
        System.out.println(Arrays.toString(arr));
    }
}

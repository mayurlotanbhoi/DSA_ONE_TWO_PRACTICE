import java.util.Arrays;

public class Arraysmetod {

    public static void main(String[] args) {
        int arr[][] = {{2, 8, 9, 4, 3, 6},
                {5, 9, 8, 3, 7, 2}};
        System.out.println(Arrays.binarySearch(arr,4));
        System.out.println(Arrays.toString(arr));
    }
}

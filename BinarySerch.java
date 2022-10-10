import java.util.Arrays;

public class BinarySerch {
    static int binarySarch(int arr[],int target){
        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid] == target){
                return mid;
            }else if(target > arr[mid]){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,5,3,2,8,9,4};

        Arrays.sort(arr);

        System.out.println(binarySarch(arr,2));

    }
}

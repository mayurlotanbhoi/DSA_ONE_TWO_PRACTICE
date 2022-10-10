public class Duoblicate_alowe_FInd_Lower_Element_in_sorted_and_rotetedArray {

    public static void main(String[] args) {
        int []arr  = new int[]{4,4,5,6,7,8,0,2,3,4,4,4};
        int low = 0;
        int high = arr.length-1;

        while(low < high){

            int mid = low+(high-low)/2;

            if(arr[mid] > arr[high]) low = mid+1;
            else if( arr[mid] < arr[high]) high = mid;

            else high--;
        }
        System.out.println(arr[low]);
    }
}

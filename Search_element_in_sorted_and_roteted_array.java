public class Search_element_in_sorted_and_roteted_array {

    static int search(int []arr,int n,int key){
        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = (high+low)/2;

            if(arr[mid] == key) return mid;
            if(arr[low] <= arr[mid] ){

                if(key >= arr[low] && key <= arr[mid]) high = mid-1;
                else low = mid+1;

            }else {
                if(key >= arr[mid] && key <= arr[high]) low = mid+1;

                else high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr = {4,5,6,7,8,1,2,3};
        int n= arr.length;
        int key = 3;
        System.out.println(search(arr,n,key));
    }
}

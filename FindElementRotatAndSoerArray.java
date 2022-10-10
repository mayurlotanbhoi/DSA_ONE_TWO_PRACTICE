public class FindElementRotatAndSoerArray {

    static  int serch(int []arr,int key){
        int l =0;
        int h = arr.length;
        while(l <=h){
            int mid = l+(h-l)/2;

            if(arr[mid] == key) return mid;

            if(arr[l] < arr[mid]){
                if(key >= arr[l] && key < arr[mid]){
                    h = mid-1;
                }else {
                    l = mid+1;
                }
            }else{

                if(key > arr[mid] && key <= arr[h]){
                    l = mid+1;
                }else {
                    l = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
      int[] arr = new int[]{5,6,7,8,1,2,3};
      int t = 3;

        System.out.println(serch(arr,t));

    }
}

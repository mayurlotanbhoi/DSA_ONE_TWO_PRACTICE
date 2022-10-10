public class Sort_0_1 {
    public static void main(String[] args) {
        int []arr = {1,0,1,0,1,0,1,0};
        int low = 0;
        int high = arr.length-1;

        while(low <= high){

            if(arr[low] == 1){
                low++;
            }else{
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

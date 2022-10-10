public class searchElementinsortedarray {

    public static void main(String[] args) {
        int []arr={1,2,6,5,8,8,8,5,6,9};
        int x = 2;
        int l=0;
        int h= arr.length-1;

        while(l<=h){

            int mid = l+(h-l)/2;

            if(mid == 0 || x>arr[mid-1] && arr[mid]==x){
                System.out.println(mid);
                return;
            }

            if(arr[mid] < x){
                l = mid+1;
            }else {
                h = mid-1;
            }
        }
        System.out.println(-1);
    }
}

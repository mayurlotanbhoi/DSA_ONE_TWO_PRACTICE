public class ontainer_with_most_Water {
    static int findArea(int []arr){
        int l = 0;
        int r = arr.length-1;
        int max = 0;
        while(l<r){

            int lh= arr[l];
            int rh= arr[r];

            int minH = Math.min(lh,rh);

            max = Math.max(max,minH*(r-l));

            if(lh < rh) l++;
            else r--;
        }

        return max;
    }

    public static void main(String[] args) {
        int arr[] = {3, 1, 2, 4, 5};
        System.out.println(findArea(arr));
    }
}

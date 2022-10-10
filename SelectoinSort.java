public class SelectoinSort {

    public static void main(String[] args) {
        int[] arr = new int[]{3,2,9,4,6};
        int n= arr.length;

        for(int i=0;i<n; i++){
         int min_ind = i;

         for(int j = i; j<n; j++){

             if(arr[j] < arr[min_ind]){

                 min_ind = j;
             }

         }
            int temp = arr[i];
            arr[i] = arr[min_ind];
            arr[min_ind] =temp;

        }
        for(int i : arr){

            System.out.print(i+" ");
        }
    }
}

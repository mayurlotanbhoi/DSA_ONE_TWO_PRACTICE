public class MergeSort {
    static void concar(int[] arr ,int star,int mid,int end){
        int i=star;
        int j = mid+1;
        int k=star;
        int[] helper = new int[arr.length];


            while(i<= mid && j <= end) {
                if (arr[i] < arr[j]) {
                    helper[k] = arr[i];
                    k++;
                    i++;
                } else {
                    helper[k] = arr[j];
                    k++;
                    j++;
                }
            }
               if(i>mid) {
                   while (j <= end) {
                       helper[k] = arr[j];
                       k++;
                       j++;
                   }
               }
               if(j>end){
                   while(i<+mid) {
                       helper[k] = arr[i];
                       k++;
                       i++;
                   }
               }
                for(int t= star; t<=end;t++){
                    arr[t]=helper[t];

                }

    }

    static  void divid(int arr[],int star,int end){

        if(star < end) {


            int mid = star + (end - star) / 2;
            divid(arr, star, mid);
            divid(arr, mid + 1, end);
            concar(arr, star, mid, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,5,8,4,1,7};
          int  star = 0;
           int end = arr.length-1;

        divid(arr,star,end);
for(int i=0 ; i< arr.length;i++){
    System.out.print(arr[i]+" ");
}

    }
}

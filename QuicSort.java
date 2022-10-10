public class QuicSort {
    static void swap(int arr[] , int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int find_Pivot(int[] arr,int low,int higth){
        int piv = arr[higth];

        int i=low-1;



            for(int j=low;j<=higth-1;j++){

                if(arr[j] < piv){
                    i++;
                    swap(arr,i,j);
                }
            }
i++;
        swap(arr,i,higth);
        return (i);
    }


    static  void Quicksort(int [] arr,int low,int higth){

        if(low<higth){
         int pivot_Index = find_Pivot(arr,low,higth);

         Quicksort(arr,low,pivot_Index-1);
         Quicksort(arr,pivot_Index+1,higth);
        }
    }

    static void printArray(int[] arr){

        for(int i=0; i< arr.length;i++){

            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int [] arr = new int[]{9,8,7,6,5,4,3,2,1};
        int n=arr.length;

        Quicksort(arr, 0, n-1);

       printArray(arr);
    }
}

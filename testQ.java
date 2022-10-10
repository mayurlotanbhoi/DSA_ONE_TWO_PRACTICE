public class testQ {
    static void Swap(int[] arr, int i, int j){

        int tep = arr[i];
        arr[i] = arr[j];
        arr[j] = tep;
    }

    static  int partision(int[] arr , int low,int high){

        int pivot = arr[high];
        int i = (low-1);

        for(int j=low; j <=high-1;j++){

            if(arr[j] < pivot){

                i++;
                Swap(arr,i,j);
            }
        }
        Swap(arr,i+1,high);
        return (i+1);
    }

    static void Quick(int[] arr, int low,int high){

        if(low<high){

            int pi = partision(arr,low,high);

            Quick(arr,low,pi-1);
            Quick(arr,pi+1,high);
        }
    }

    static void printArr(int[] arr, int n){

        for(int i=0; i<n;i++){

            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10,8,5,5,3,9};

        int n = arr.length;

        Quick(arr,0,n-1);
        printArr(arr,n);

    }
}

public class Sorting_algo {
    static void print(int[] arr){
        for(int i=0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void bubble(int[] arr,int n){

        for(int i=0; i< arr.length; i++){

            for(int j=0; j< arr.length-1; j++){

                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        print(arr);
    }

    static  void Inser(int[] arr,int n){

        for(int i=1; i<n; i++){
            int key = arr[i];
            int j= i-1;
            while(j >=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        print(arr);
    }

    static void select(int[] arr,int n){

        for(int i=0; i<n; i++){

            int min = i;

            for(int j=i+1; j <n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp =arr[i];
            arr[i] = arr[min];
            arr[min] =temp;
        }
        print(arr);
    }

    static void marge(int[] arr,int low,int mid,int high){

        int n1 = mid-low+1;
        int n2 = high-mid;

        int left[] = new int[n1];
        int rigth[] = new int[n2];

        for(int i=0; i<n1; i++){
            left[i] = arr[i+low];
        }
        for(int j=0; j<n2; j++){
            rigth[j] = arr[j+mid+1];
        }

        int i =0;
        int j=0;
        int k=low;

        while(i<n1 && j< n2){

            if(left[i] <= rigth[j]){
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = rigth[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = rigth[j];
            j++;
            k++;
        }

    }
    static void sort(int[] arr,int low,int high){

        if(low < high){

            int mid = low+(high-low) /2;

            sort(arr, 0 ,mid);
            sort(arr, mid+1,high);
            marge (arr,low,mid,high);
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,6,4,8,9,3,1,10};
        int n = arr.length;
       // bubble(arr,n);
        System.out.println();
      //  Inser(arr,n);
        System.out.println();
        select(arr,n);
        sort(arr,0,n-1);
        System.out.println();
        print(arr);
    }
}

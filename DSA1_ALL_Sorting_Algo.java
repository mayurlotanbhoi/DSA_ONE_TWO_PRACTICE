public class DSA1_ALL_Sorting_Algo {
    static  void Swap(int []arr,int i,int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    //***********************************************************
    //***********print function***************
    static void PrintArra(int[] arr,int n){

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }


    static void Bubble_Sort(int[] arr,int n){

        for(int i=0; i<n; i++){
         boolean flag = false;
            for(int j=0; j<n-1-i; j++){

                if(arr[j] > arr[j+1]){
                   flag =true;
                    Swap(arr,j+1,j);
                }
            }
            if(flag == false) break;
        }
        PrintArra(arr,n);
        System.out.println("This is the bubbel sort");
    }

    //**********************************************************************************************************
    //********************************** insersion sort**************************************

    static  void Insertionsort(int[] arr ,int n){
// no Swaping use
        for(int i=1; i<n; i++){

            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j] > key){

                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        PrintArra(arr,n);
        System.out.println("this is insetion sort");
    }
    //***********************************************************************************************************************************
    //*************************selection Sort algo*****************************************************************

    static void SelectionSort(int[] arr,int n){

        for(int i=0; i<n; i++){
         int   min_index = i;

            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            Swap(arr,i,min_index);
        }
        PrintArra(arr,n);
        System.out.println("this is selection sort");
    }
    //***********************************************************************************************************

    static void Marge(int[] arr,int low, int mid, int high){

        int l1 = mid - low+1;
        int l2 = high -mid;

        int left[] = new int[l1];
        int right[] = new int[l2];

        for(int i=0; i<l1; i++){
            left[i] = arr[low + i];
        }
        for(int j=0; j<l2; j++){
            right[j] = arr[mid+ j+1];
        }
        int i=0;
        int j=0;
        int k=low;
        while(i<l1 && j<l2){

          if(left[i] <= right[j]){
              arr[k] = left[i];
              i++;
          }  else{
              arr[k] = right[j];
              j++;
          }
          k++;
        }
        while(i < l1){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j < l2){
            arr[k] = right[j];
            j++;
            k++;
        }
    }

      static void Sort1(int[] arr,int low , int high){
        if(low < high){
            int mid = low+(high-low)/2;

            Sort1(arr,low,mid);
            Sort1(arr,mid+1,high);
            Marge(arr,low,mid,high);
        }
    }
    //******************************Quick Sort**********************************
    //**************************************************************************

    static int Partision(int[] arr,int low,int high){

        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<=high-1;j++){

            if(arr[j] < pivot){
                i++;
                Swap(arr,i,j);
            }
        }
        Swap(arr,i+1,high);
        return i+1;
    }

    static void Sort(int []arr,int low,int high){

        if(low < high){

            int pi = Partision(arr,low,high);

            Sort(arr,low,pi-1);
            Sort(arr,pi+1,high);
        }
    }

    public static void main(String[] args) {
        int [] arr = new int[] {2,8,6,1,8,8,63,9,7,1,69,4};
        int n= arr.length;
      //  Bubble_Sort(arr,n);
       // Insertionsort(arr,n);
      //  SelectionSort(arr,n);
      //  DSA1_ALL_Sorting_Algo s = new DSA1_ALL_Sorting_Algo();
        Sort1(arr,0, n-1);
       // int n = arr.length;
        Sort(arr,0,n-1);
        PrintArra(arr,n);


    }
}

public class SilectionSort {
    static void printSort(int arr[]){
        for(int extract : arr){
            System.out.println(extract);

        }
    }

    static void swap(int[] arr,int i ,int j){
        int tep = arr[i];
        arr[i] =arr[j];
        arr[j] = tep;
    }
   static void Sort(int[]arr){

        for(int i=0; i< arr.length;i++){
            int minIndex = i;

            for(int j=i+1; j< arr.length;j++){

                if(arr[j] < arr[minIndex]){
                    minIndex=j;
                }
            }
            swap(arr , minIndex ,i);
        }
   }

    public static void main(String[] args) {
        int[] arr = new int[]{15,16,21,5211,151,1,3,6,};


        Sort(arr);
        printSort(arr);

    }
}

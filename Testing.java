public class Testing {

    static int partision(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; i++) {

            if (arr[j] < pivot) {
                i++;
                BubbulShort.Swap(arr, i, j);

            }
        }
        BubbulShort.Swap(arr, i + 1, high);
        return (i + 1);
    }

    static void Quick_Sort(int[] arr, int low, int high) {

        if (low < high) {

            int pi = partision(arr, low, high);

            Quick_Sort(arr, low, pi - 1);
            Quick_Sort(arr, pi + 1, high);
        }

    }
    static void print(int[] arr,int n){
        for (int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }



    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 3, 6, 9, 5, 8};
        // BubbleSort(arr);
        // Insertion_Sort(arr);
        // SellectionSort(arr);
        int n = arr.length;
        Quick_Sort(arr, 0, n - 1);
        print(arr,n);


    }
}

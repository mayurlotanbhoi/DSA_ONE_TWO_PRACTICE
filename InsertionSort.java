public class InsertionSort {
    static void ptintarr(int arr[]){

        for(int pri : arr){
            System.out.println(pri);
        }
    }

    static void sorting(int arr[]){

        for(int i = 1; i< arr.length;i++){
            int pissition = i;
            int InsetToValue = arr[i];

            while(pissition>0 && arr[pissition-1] > InsetToValue ){

                arr[pissition] =arr[pissition-1];
                pissition--;
            }
            arr[pissition] = InsetToValue;


        }


    }

    public static void main(String[] args) {

        int[]  arr = new int[]{
                12,45,36,78,98,52,2
        };

        ptintarr(arr);
        sorting(arr);
        ptintarr(arr);

    }
}

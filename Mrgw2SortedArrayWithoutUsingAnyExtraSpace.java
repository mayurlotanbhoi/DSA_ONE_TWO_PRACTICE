import java.util.Arrays;

public class Mrgw2SortedArrayWithoutUsingAnyExtraSpace {

    static void marg(int arr1[],int arr2[], int n, int m){
        int i = n-1;
        int j = 0;

        while(i>=0 && j<m){

            if(arr1[i] > arr2[j] ){
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            }
            i--;
            j++;

        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    // SECOND METHOD OF SAME PROBLEM

    static void semethod(int arr1[], int arr2[], int n, int m){
        int i=0;
        int temp =0;

        while(arr1[n-1] > arr2[0] ){

            if(arr1[i] > arr2[0]){

                temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;
                Arrays.sort(arr2);
            }
            i++;
        }

    }

    static void printarray(int arr[]){

        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr1[] = { 2,5,8,10};
        int arr2[] = {1,3,4,6,7,9};
        int n= arr1.length;
        int m = arr2.length;
        semethod(arr1,arr2,n,m);

        printarray(arr1);
        System.out.println();
        printarray(arr2);


    }
}

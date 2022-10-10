import java.util.Arrays;

public class marge {
    static void marge(int arr[] , int l, int mid, int h){

        int n1 = l+mid;
        int n2 = mid+h+1;

        int le[] = new int[n1];
        int rg[] = new int[n2];

        for(int i=0; i<n1; i++){
            le[i] = arr[l+i];
        }for(int i=0; i<n2; i++){
            rg[i] = arr[mid+i+1];
        }
        int i=0;
        int j=0;
        int k=l;
        while (i<n1 && j<n2){

            if(le[i] < rg[j]){
                arr[k] = le[i];
                i++;
            }else {
                arr[k] = rg[j];
                j++;
            }
            k++;
        }

        while (i<n1){
            arr[k] = le[i];
            i++;
            k++;
        }while (j<n2){
            arr[k] = rg[j];
            j++;
            k++;
        }
    }

    static void sort(int[] arr, int l, int h ){

        if(l<=h) {
            int mid = l + (h - l) / 2;

            sort(arr, l, mid - 1);
            sort(arr, mid+1, h);
            marge(arr,l,mid,h);
        }

    }

    public static void main(String[] args) {
        int[] arr = {2,5,9,4,3};

        int l=0;
        int h=arr.length-1;

        sort(arr,l,h);
        System.out.println(Arrays.toString(arr));
    }
}

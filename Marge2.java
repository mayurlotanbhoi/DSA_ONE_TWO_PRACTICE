public class Marge2 {

    public static void main(String[] args) {
        int[] arr = new int[]{2,6,5,9,7,2,3};
        int n= arr.length;
        int high = arr.length;
        for(int i=0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Sort(arr ,0,high-1);

    for(int i=0; i< arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}

  static void Sort(int[] arr, int low, int high) {

        if(low < high){

            int mid = low+(high-low)/2;

            Sort(arr,low,mid);
            Sort(arr,mid+1,high);
            Marg(arr,low,mid,high);
        }
      //  return arr;
    }
   static void Marg(int[] arr,int low, int mid,int high){
        int n1 = mid-low+1;
        int n2 = high-mid;

        int[] lowArray = new int[n1];
        int[] higharray = new int[n2];

        for(int i =0; i<n1; i++){
            lowArray[i] = arr[i+low];
        }

        for(int j=0; j<n2; j++){
            higharray[j] = arr[j+mid+1];
        }
        int i=0,j=0,k=low;
        while(i<n1 && j<n2){

            if(lowArray[i] <=higharray[j]){
                arr[k] = lowArray[i];
                i++;
            }else{
                arr[k] = higharray[j];
                j++;
            }
            k++;
        }

        while(i < n1){
            arr[k] = lowArray[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = higharray[j];
            j++;
            k++;
        }


       }


   }






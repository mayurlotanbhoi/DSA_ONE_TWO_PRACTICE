public class zero {
    static void Swap(int[] arr, int i, int j){

        int tep = arr[i];
        arr[i] = arr[j];
        arr[j] =tep;
    }
    public static void main(String[] args) {
        int [] arr = new int[] {1,0,1,0,0};
       // int[] help = new int[arr.length];
       int j=0;
      // int k= arr.length-1;

        for(int i=0; i< arr.length;i++){

            if(arr[i] == 0 ){
                Swap(arr,i,j);
                j++;

                                                                          //   help[j++]= arr[i];
            }

//            else{
//                help[k] = arr[i];
//                k--;
//            }
        }

        for(int t = 0; t< arr.length; t++){

            System.out.print(arr[t]+" ");
        }
    }

}

public class InsertionS {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,6,5,4};
        int n = arr.length;

        // no need to swaping functoins we just insert the element 

        for(int i=1; i<n; i++){
            int stor = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > stor){

                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = stor;
        }
        for(int i : arr){
            System.out.print(i+" ");
      }
    }
}

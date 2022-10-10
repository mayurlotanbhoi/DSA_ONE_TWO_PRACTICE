import java.util.Arrays;

public class Triplet {

    static void findTriplet(int[] arr,int sum){
        Arrays.sort(arr);
      // int sum = 15;
        int end = arr.length-1;
        for(int i=0; i< arr.length-2; i++){
            int start = i+ 1;
            while(start<end){
                if(arr[i] + arr[start] + arr[end] == sum ){
                    System.out.println(arr[i]+" " + arr[start] +" "+ arr[end]);
                }
                if(arr[i] + arr[start] + arr[end] < sum){
                    start++;
                }else{
                    end--;
                }
            }

        }
    }
    public static void main(String[] args) {
        int [] arr = new int[] {1,5,3,4,8,9};
        int target = 21;
        findTriplet(arr,target);

//        for(int i=0; i< arr.length; i++){
//
//            for(int j = i; j< arr.length ;j++){
//                int t = j;
//               //  for( int t =j; t< arr.length; t++){
//
//                    if(arr[i] + arr[j] + arr[t] == target){
//                         System.out.println(arr[i]+" "+arr[j]+" "+arr[t]);
//                       //  return;
//                   //  }
//
//                 }
//                    t++;
//
//            }
//        }
    }
}

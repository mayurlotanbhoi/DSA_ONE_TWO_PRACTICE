public class TwoSum {

   public static void FindSum(int[] arr,int target){

       int sum = 0;
       int max =0;
      for(int i=0; i< arr.length ; i++) {


              sum+=arr[i];
              if(sum ==target){
                  max=i;

              }
          }
       if(max>0){
           System.out.println(max);
       }else{
           System.out.println(-1);
       }
    }
    public static void main(String[] args) {

        int[] arr = new int[]{-5, 8 ,-14 ,2 ,4 ,12};
//int target = 15;
        FindSum(arr , -5);
    }
}

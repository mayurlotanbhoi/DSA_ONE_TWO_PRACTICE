public class Sum_i_j {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 4, 20, 3, 10, 5};

         int sun =0;
         int tar = 5;

         for(int i=0;i< arr.length;i++){

             for(int j=i; j< arr.length;j++){

                 sun += arr[j];

                 if(sun == tar){
                     System.out.println("["+i+"]"+"["+j+"]");
                 }


             }
             sun=0;
         }

        }
    }



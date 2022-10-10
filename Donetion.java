public class Donetion {
    static  void donet(int[] arr){
        int sum =0;
        int extra =0;
        int largamountOfDonetion = arr[0];
        for(int i=0; i< arr.length-1; i++){
            if(largamountOfDonetion > arr[i+1]){
                System.out.print(largamountOfDonetion-arr[i+1]+" ");
                extra = extra+(largamountOfDonetion-arr[i+1]);
            }else{
                largamountOfDonetion = arr[i+1];
                System.out.print("0"+" ");

            }
        }
        for(int i=0; i< arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum+extra);
    }

    public static void main(String[] args) {

        int[] arr = new int[]{10,20,30,40,10,20,30};
        donet(arr);
    }
}

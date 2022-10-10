public class cheak_Array_ia_Soreted_or_Roteted {
    public static void main(String[] args) {
        int arr[] = new int[]{4,5,6,7,1,2,3};
        int count = 0;
        for(int i=0; i<arr.length; i++){

            if(arr[i] > arr[(i+1)% arr.length]) count++;
        }

        if(count < 2) System.out.println("Array is roteted");

        else System.out.println("Array is not sorted");
    }

}

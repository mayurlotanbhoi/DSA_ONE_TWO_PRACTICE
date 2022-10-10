public class BubbulShort {
    static void Printarr(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
    static void Swap(int arr[] ,int i ,int j){
        int tem = arr[i];
        arr[i] =arr[j];
        arr[j]=tem;
    }
    static void BubbleShort(int arr[]){

        for(int i=0;i<arr.length-1;i++){
boolean  flag = false;
            for(int j=0; j< arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    Swap(arr,j,j+1);
                    flag= true;
                }
                if(flag=false){
                    break;
                }
            }

        }
        Printarr(arr);

    }


    public static void main(String[] args) {

        int arr[] = {88,665,55,22,55,33};
       BubbleShort(arr);

        System.out.println("*************************");
        insertionShort(arr);

    }
    static void insertionShort(int arr[]){
        int n = arr.length;

        for(int i=1;i<n;i++){
            int tem = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>tem){
                arr[j+1] = arr[j];
                j--;

            }
            arr[j+1]=tem;
        }
        Printarr(arr);
    }
}

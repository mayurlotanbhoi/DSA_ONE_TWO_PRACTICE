public class Q_Sort {

    static void Swap(int[] arr,int i,int j){

        int tem = arr[i];
        arr[i] =arr[j];
        arr[j] = tem;
    }
    static  int part(int arr[],int l,int h){

        int p = arr[h];   //2 5 8 9 5 6

        int i =l-1;

        for (int j=l; j<=h-1;j++){

            if (arr[j] < p) {
                i++;
                Swap(arr,i,j);

            }


        }


Swap(arr,i+1,p);

        return (i+1);
    }



  static void  Q_Sort(int[] arr ,int l,int h ){

        while(l<=h){

            int pi_in = part(arr,l,h);

            Q_Sort(arr,l,pi_in-1);
            Q_Sort(arr,pi_in+1,h);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,6,89,5,};
        int h= arr.length;
        int l =0;
        Q_Sort(arr, l,h-1);
    }
}

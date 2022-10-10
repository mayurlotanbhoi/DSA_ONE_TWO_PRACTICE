public class RotateArrayUseingJublingAlgo {
static void JublingAigoCall(int[] arr ,int d,int n){
     d = d % n;
    int i,j,k,tep;
    int gcd = GCD(d,n);

    for( i = 0; i<gcd; i++){

        tep = arr[i];
        j = i;

        while(true){

            k = j+d;

            if(k >=n)
                k = k-n;

            if(k == i)
                break;

            arr[j] = arr[k];
            j=k;
        }
        arr[j] = tep;

    }

    for (int t = 0; t < n; t++){
        System.out.print(arr[t] + " ");
    }
}





   static int GCD(int a ,int b){
    if(b == 0)  return b;


       return GCD(b, a % b);
   }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        int n= arr.length;
        int rotation = 2;

        JublingAigoCall(arr,rotation,n);
    }
}

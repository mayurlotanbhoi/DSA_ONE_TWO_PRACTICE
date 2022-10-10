import java.util.HashMap;
import java.util.Scanner;

public class EqualNum0And1 {
    static int find0And1(int[] arr){
        int ans =0;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum=0;

        for(int val : arr){

            if(val == 0){

                sum+=-1;
            }else {
                sum+=+1;
            }
            if(map.containsKey(sum)){
                ans+=map.get(sum);
                map.put(sum , map.get(sum)+1);
            }else{
                map.put(sum,1);
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<N;i++){
             arr[i] = sc.nextInt();
        }

        System.out.println(find0And1(arr));
    }
}

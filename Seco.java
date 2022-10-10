import java.util.Arrays;

public class Seco {

    public static void main(String[] args) {
        int[] arr = new int[]{17,1,5,3,6,4};
        int n = arr.length;

//        Example 1:
//
//        Input: prices = [7,1,5,3,6,4]
//        Output: 5
//        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
//        Example 2:
//
//        Input: prices = [7,6,4,3,1]
//        Output: 0
//        Explanation: In this case, no transactions are done and the max profit = 0.
        int maxProfit = 0;
        int minsofar = arr[0];

        for(int i=0; i<n; i++){

   minsofar = Math.min(minsofar,arr[i]);

   maxProfit = Math.max(maxProfit,arr[i] - minsofar);

        }
        System.out.println(maxProfit);
    }
}

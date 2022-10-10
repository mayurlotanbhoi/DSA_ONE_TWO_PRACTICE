public class BuyAndSell2 {
    public static void main(String[] args) {
        int []arr = {1,8,3,9,7,5,6};
        int n = arr.length;
        int first_buy = Integer.MIN_VALUE;
        int first_sell = 0;
        int second_buy = Integer.MIN_VALUE;
        int second_sell = 0;

        for(int i=0; i<n; i++){

            first_buy = Math.max(first_buy,-arr[i]);
            first_sell = Math.max(first_sell,first_buy+arr[i]);
            second_buy = Math.max(second_buy,first_sell-arr[i]);
            second_sell = Math.max(second_sell,second_buy+arr[i]);
        }
        System.out.println(first_sell);
    }
}

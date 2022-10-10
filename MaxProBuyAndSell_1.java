public class MaxProBuyAndSell_1 {
    public static void main(String[] args) {
        int[] arr = new int[]{3,5,1,7,4,9,3};
        int minSofar = arr[0];
        int maxsofar = 0;
        int maxprofit =0;
        for(int i=0; i< arr.length; i++){

            minSofar = Math.min(minSofar,arr[i]);
            maxsofar = arr[i] - minSofar;

            maxprofit = Math.max(maxsofar,maxprofit);
        }

        System.out.println(maxprofit);
    }
}

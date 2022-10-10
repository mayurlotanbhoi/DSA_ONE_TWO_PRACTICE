public class Max3Element {

    public static void main(String[] args) {
        int []arr = {9,8,5,5,8,9,6,2,3,9};

        int f, s, t;
        int i, first, second, third;

        /* There should be atleast three elements */
        if (arr.length < 3) {
            System.out.print(" Invalid Input ");
            return;
        }

        third = first = second = Integer.MIN_VALUE;
        for (i = 0; i < arr.length; i++) {
            /* If current element is greater than
            first*/
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            }

            /* If arr[i] is in between first and
            second then update second  */
             if (arr[i] > second && arr[i] < first) {
                third = second;
                second = arr[i];
            }

             if (arr[i] > third && arr[i] < second)
                third = arr[i];
        }

        System.out.println("Three largest elements are " + first + " " + second + " " + third);
    }
}

public class FirstNonRepeatignElement {
    static int cheackNum(int arr[]) {

        for(int i=0;i< arr.length;i++){
int j;
            for( j=0; j< arr.length;j++){
                if(j!=i && arr[i] ==arr[j]){

                    break;
                }
            }
            if(j==arr.length){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{12,25,56,12,25};
        System.out.println(cheackNum(arr));
    }
}

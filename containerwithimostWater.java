public class containerwithimostWater {

    public static void main(String[] args) {
        int arr[] =  {1, 5, 4, 3};

        int l=0;
        int r=arr.length-1;
        int area=0;

        while(l<r){

            area = Math.max((Math.min(arr[l],arr[r])*(r-l)) , area);

            if(arr[l] < arr[r]){
                l++;
            }else {
                r--;
            }
        }


        System.out.println(area);
    }
}

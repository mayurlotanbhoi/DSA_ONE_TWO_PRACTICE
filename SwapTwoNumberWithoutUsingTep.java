public class SwapTwoNumberWithoutUsingTep {

    public static void main(String[] args) {
        int a=5;
        int b=2;

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println(a+"a-----b"+b);

        int n = 10;

        if((n&1)==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }



    }
}

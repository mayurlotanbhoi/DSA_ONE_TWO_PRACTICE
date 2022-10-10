public class MilUSingRec {
    static int multi(int m ,int n){
        if(m==1){
            return n;
        }else{

            return   n+multi(m-1,n);

        }
    }
    public static void main(String[] args) {
        int m=5;
        int n =4;
        System.out.println(multi(m ,n));

    }
}

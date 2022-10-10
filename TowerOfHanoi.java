import java.util.Scanner;

public class TowerOfHanoi {
    static  void tOH(int n, String sorce,String helper,String destination){

        if(n==1){
            System.out.println(n+"->"+sorce+"->"+destination);
            return;
        }
        tOH(n-1,sorce,destination,helper);
        System.out.println(n+"->"+sorce+"->"+destination);
        tOH( n-1,helper,sorce,destination);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tOH(n,"A","B","C");

    }
}

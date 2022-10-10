import java.util.Scanner;

public class Pimecheck
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- >0){
            int count=0;
            int n=sc.nextInt();
            for(int i=2;i<=Math.sqrt(n);i++){

                if(n%i==0){
                    count++;
                }

            }
            if(count>=1){
                System.out.println("Not prime");
            }else{System.out.println("prime");}

        }

    }
}

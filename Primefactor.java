import javax.crypto.spec.PSource;

public class Primefactor {

    static void FactorOfnum(int n){
// this is the brut force solution we just cheack the num divisible by that num
        // time colexcity for thiks method id O(n);
        // space comlexcity for this method is O(1) conatant
        for(int i=1; i<=n;i++){

              if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }

    static  void FactorsOfNumUsingSqrt(int n){
// tis is the optimize solution for factorization of num we just run the program SQRT of N
        // time coplexity SQRT(N)
        // space coplexity is constant O(1)
        for(int i=1; i<=Math.sqrt(n);i++){

            if(n%i == 0){
                System.out.print(i+" ");
                if(n/i != i) {
                    System.out.print(n / i + " ");
                }
            }
        }
    }



    static void primFactorOfNum(int n){
        while (n%2==0){

            System.out.print(2+" ");
            n/=2;
        }

        for(int i = 3; i<=Math.sqrt(n);i+=2){
            while (n%i==0){
                System.out.print(i+" ");
                n/=i;
            }
            }
        if(n>1){
            System.out.print(n);
        }
    }

    static  boolean isPrimeOrNot(int n){
// this is the brodforce solution for cheacking prime
        // T : O(n)
        //S : O(1)
        for(int i=2; i<n; i++){
            if(n==0 || n==1) {
                System.out.println("not prime");
            return false;}
            if(n%i == 0){
                System.out.println("Not prime");
                return false;

            }
        }
        System.out.println(" is prime");
        return true;
    }

    static  boolean IsPrimeORNOt_by_sqrt(int n){
        if(n==0 || n== 1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
               // System.out.println("not prime");
                return false;
            }
        }
      //  System.out.println("prime");
        return  true;
    }

    static void cheackNumTillN(int n){
        //this is brotfaorce solution for cheaking prime till n
        for(int i = 2; i<=n; i++) {
            if (IsPrimeORNOt_by_sqrt(i)){

                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    static void  checkPrimeTillN_By_Sieve(int n){

        boolean[] isPrime = new boolean[n+1];

        for(int i=0; i<=n; i++){
            isPrime[i] = true;
            isPrime[0] = isPrime[1] = false;
        }

        for(int i=2; i<=Math.sqrt(n);i++){

                if(isPrime[i] == true){
                    for(int j=i*i; j<=n; j+=i){
                    isPrime[j] = false;
                }
            }
        }
        for(int i=0;i<=n;i++){
            if(isPrime[i] == true){
                System.out.print(i+" ");
            }
        }
        //System.out.println();
    }





    public static void main(String[] args) {
//        FactorOfnum(36);
//        System.out.println("----------------");
//        FactorsOfNumUsingSqrt(36);
//        System.out.println("-----------");
//        primFactorOfNum( 10);
        isPrimeOrNot(71);

        IsPrimeORNOt_by_sqrt(71);

        cheackNumTillN(100);
        checkPrimeTillN_By_Sieve(100);



    }
}

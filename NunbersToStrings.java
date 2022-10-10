import java.util.Scanner;

public class NunbersToStrings {
static String StringTonum(int digit){
    switch(digit){

        case 0: return "zero";
        case 1: return "one";
        case 2: return "two";
        case 3: return "three";
        case 4: return "four";
        case 5: return "five";
        case 6: return "six";
        case 7: return "seven";
        case 8: return "ethe";
        case 9: return "nine";
    }
    return " ";
}
static int power(int x, int y){
    int result = 1;
    for(int i=0; i<y; i++){
        result=result*x;
    }
    return result;
}


    static void Print_Digits(int N){
int n=N , m=N;

int size = 0;
while(n!=0){
   n/=10;
    size++;
}
n=m;
while(size--!=0) {
    int pow = power(10, size);
    int extractDigit = n /pow;
    n%=pow;

    System.out.print(StringTonum(extractDigit)+" ");
//Enter your code here
}
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        Print_Digits(n);
    }
}

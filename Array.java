import java.util.Scanner;
public class Array {
public static int minArray(int [] x){
    // we creat here teprary array we asumm x[0] is greater
    int tep = x[0];
    for(int i=1; i<x.length;i++){
        if(tep>x[i]){//if tep is less the array of i
            tep=x[i];//we assing the x[i] to tep now tep is less
        }

    }
    return tep;
}
public static int maxOfArray(int [] y){
    int tep = y[0];
    for(int i=0;i<y.length;i++){
        if(tep<y[i]){
            tep=y[i];

        }
    }
    return tep;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
int[] a = new int[x];
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println(minArray(a));
        System.out.println(maxOfArray(a));

    }

//    public static boolean toString(int[] arr1) {
//    return true;
//    }
}

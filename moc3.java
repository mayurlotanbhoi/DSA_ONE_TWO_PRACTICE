import java.util.Scanner;

public class moc3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];

        for(int i=0; i<r; i++){

            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
//11,21,31,41,42,43,44,34,24,14,13,12,22,32,33,23

//        11,12,13,14
//        21,22,23,24
//        31,32,33,34
//        41,42,43,44
         int minr = 0;
        int minc = 0;
        int maxr= r-1;
        int maxc = c-1;
        int nEle = r*c;
        int count = 0;

        while (count < nEle){
       // first wall
            for(int i=minr,j=minc; i<maxr; i++){
                System.out.print(arr[i][j]+" ");
                count++;
            }
            minc++;

            //bottom wall

            for(int i=minr,j=minc; i<=maxr; i++){
                System.out.print(arr[i][j]+" ");
                count++;
            }
            maxr--;

            // rigth wall
            for(int i=maxr,j=minc;j<=minc; j++){
                System.out.print(arr[i][j]+" ");
            }
            maxc--;


            // top wall
            for(int i=minr,j=maxc; i>=minr; i--){
                System.out.print(arr[i][j]+" ");
                count++;
            }
            minr++;

        }



    }
}

//4 4
//1 2 3 4
//5 6 7 8
//9 10 11 12
//13 14 15 16
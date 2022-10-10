import java.util.Scanner;

public class Rotet_matrix_90_Clockwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mat[][] = new int[n][n];
        for(int i=0; i<n; i++){

            for(int j=0; j<n; j++){
                mat[i][j] = sc.nextInt();
            }
        }

//        for(int i=0; i<n/2; i++){
//            for(int j=i; j<n-i-1; j++){
//
//               int temp = mat[i][j];
//               mat[i][j] = mat[n-1-j][i];
//               mat[n-1-j][i] = mat[n-i-1][n-1-j];
//               mat[n-1-i][n-1-j] = mat[j][n-1-i];
//               mat[j][n-1-i] = temp;



      //      }
      //  }
//        for(int i=0; i<n/2; i++){
//       //cheang digonal
//            for(int j=0; j<n; j++){
//                int tamp =  mat[i][j];
//                mat[i][j] = mat[i][n-1-j];
//                mat[n-1-i][j] = tamp;
//            }
//        }

        for(int i=0; i<n; i++){

            for(int j=0; j<i; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for (int k = 0; k < n; k++) {
            for (int t = 0; t < n; t++) {

                System.out.print(mat[k][t]+" ");
            }
            System.out.println();
        }

        for(int i=0; i<n; i++){

            for(int j=0; j<n/2; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[i][n-1-j];
                mat[i][n-1-j] = temp;
            }
        }
        for (int k = 0; k < n; k++) {
            for (int t = 0; t < n; t++) {

                System.out.print(mat[k][t]+" ");
            }
            System.out.println();
        }
    }
}

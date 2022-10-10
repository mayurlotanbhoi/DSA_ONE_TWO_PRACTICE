import java.util.Scanner;

public class A90 {
////    Input:
//            1  2  3  4
//            5  6  7  8
//            9 10 11 12
//            13 14 15 16
////    Output:
////            4  8 12 16
////            3  7 11 15
////            2  6 10 14
////            1  5  9 13
//    The given matrix is rotated by 90 degree
//    in anti-clockwise direction.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

//
       int[][] arr = new int[n][n];
//
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                arr[i][j] = sc.nextInt();
            }
        }

         //  transform method

         for(int i=0; i<n; i++){

             for(int j=0; j<i; j++){
                 int temp = arr[i][j];
                 arr[i][j]= arr[j][i];
                 arr[j][i]=temp;
             }
         }

         for(int i=0; i<(n/2); i++){

             for(int j=0; j<n; j++ ){

                 int temp = arr[i][j];
                 arr[i][j] = arr[n-1-i][j];
                 arr[n-1-i][j] = temp;
             }
         }
            for (int k = 0; k < n; k++) {
                for (int t = 0; t < n; t++) {

                    System.out.print(arr[k][t] + " ");
                }
                System.out.println();
            }
        }
    }


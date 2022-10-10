import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int row= sc.nextInt();
        int col= sc.nextInt();
        int matrix[][] =new int [row][col];

        for(int i=0;i<row; i++){

            for(int j=0; j<col; j++){

                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<row;i++){


            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+" ");
            }
          //  i++;
            for(int c=0;c<row; c++){
                System.out.print(matrix[c][col]+" ");
            }
           // i++;

        }
    }
//    Print the given matrix in spiral form
//    Input:  1    2   3   4
//            5    6   7   8
//            9   10  11  12
//            13  14  15  16
//    Output: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
}

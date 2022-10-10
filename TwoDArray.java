import java.util.Scanner;

import static java.lang.System.*;

public class TwoDArray {
    public static void main(String [] arg){
        Scanner sc = new Scanner(in);

        int row  = sc.nextInt();
        int colum  = sc.nextInt();

        int [][] metrics = new int [row][colum];

        for(int i = 0; i<row; i++) {
//this is tje outer loop for controlling rows
          for( int j = 0; j<colum; j++){
             //  metrics [i][j] = sc.nextInt();
              System.out.print(metrics[i][j]);
          }
            out.println();
        }
        }



    }


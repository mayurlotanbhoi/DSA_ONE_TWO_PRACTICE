import java.util.Scanner;

public class Count_palindrom_subStrings {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter astring");
        String str = sc.next();
        int n = str.length();
        boolean[][] mat = new boolean[n][n];
        int count = 0;
       // int i,j=0;
        for(int g=0; g<n; g++){

            for(int i=0,j=g; j< mat.length;i++,j++){

                if(g == 0) {  //Signal character is always palindrome
                    mat[i][j] = true;
                }else if(g == 1){
                    if(str.charAt(i) == str.charAt(j)){
                        mat[i][j] = true;
                    }else {
                        mat[i][j] = false;
                    }
                }else if(str.charAt(i) == str.charAt(j) && mat[i+1][j-1] == true){
                    mat[i][j] = true;
                }else {
                    mat[i][j] = false;
                }
                if(mat[i][j] == true){
                    count++;
                }
            }

        }
        System.out.println(count);
    }
}

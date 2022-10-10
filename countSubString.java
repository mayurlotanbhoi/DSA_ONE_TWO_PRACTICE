import java.util.Scanner;

public class countSubString {
    static int findSubString(String str1, String str2){
        int count = 0;
        for(int i=0; i<str1.length(); i++) {
            int j = 0;
            int ir=i;
            if (str1.charAt(i) == str2.charAt(j)) {
                for (; j < str2.length(); j++) {
                   if(str1.charAt(i+j) != str2.charAt(j)){
                       break;
                    //   j = str2.length();
                   }
                   if(j == str2.length()-1){
                       count++;
                   }
                }

            }
            i=ir;
        }
        return count;
    }

    static int anothemethod(String str1, String str2){
        int count=0;
        String ans = " ";
        int l2 = str2.length();

        for(int i=0; i<str1.length()-str2.length()+1; i++){
            System.out.println(str1.substring(i,l2+i));
            if(str1.substring(i,l2+i).equals(str2)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

     //   System.out.println(findSubString(str1,str2));
        System.out.println(anothemethod(str1,str2));
    }
}

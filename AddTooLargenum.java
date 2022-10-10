import java.util.Scanner;

public class AddTooLargenum {
    static String add2string(String str1, String str2){
//        befor producing make shor str2 is > str1
        int n1 = str1.length();
        int n2 = str2.length();
        String ans = "";

        if(n1 > n2){
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }
        int diff = n2-n1;
//        int sum = 0;
        int carry = 0;
        for(int i=n1-1; i>=0; i--){
        int  sum =((int) (str1.charAt(i)-'0') + (int)(str2.charAt(i+diff)-'0') + carry);
          ans += (char)(sum%10+'0');
          carry = sum/10;
        }

        for(int i=n2-n1-1; i>=0; i--){
         int   sum = ((int)str2.charAt(i)-'0'+carry);
            ans +=(char) (sum%10+'0');
            carry = sum/10;
        }

        if (carry > 0){
            ans += (char)carry+'0';
        }
        System.out.println(ans);
        return new StringBuilder(ans).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(add2string(str1,str2));
    }
}

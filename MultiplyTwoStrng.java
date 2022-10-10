public class MultiplyTwoStrng {
     static String multiply(String num1, String num2) {
        if(num1 == null || num2==null) return " ";

        if("0".equals(num1) || "0".equals(num2)) return "0";

        int m = num1.length();
        int n = num2.length();

        int product[] = new int[m+n];

        for(int i=m-1; i>=0; i--){

            int x = num1.charAt(i)-'0';

            for(int j=n-1; j>=0; j--){

                int mul = x*(num2.charAt(j)-'0');

                product[j+i+1] += mul;

                product[i+j] += product[i+j+1]/10;

                product[i+j+1] %=10;
            }
        }

        StringBuilder result = new StringBuilder();

        for(int p : product ){

            if(p != 0 || result.length() != 0){
                result.append(p);
            }
        }

        return result.toString();

    }
    public static void main(String[] args) {
        String s1 = "123";
        String s2 = "456";

        System.out.println(multiply(s1,s2));
    }
}

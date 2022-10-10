public class printallParmutationOfstring {

    public static void main(String[] args) {
        String str = "ABC";
        String ans = " ";
        PrintParmutation(str,ans);
    }

    private static void PrintParmutation(String str, String ans) {

        if(str.length() == 0){
            System.out.print(ans);
        }
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            String rof = str.substring(0,i) + str.substring(i+1);
            PrintParmutation(rof,ans+ch);

        }
    }
}

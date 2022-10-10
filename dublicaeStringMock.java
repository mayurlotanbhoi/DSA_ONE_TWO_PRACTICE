import java.util.Arrays;

public class dublicaeStringMock {
    public static void main(String[] args) {

        try{
            String arr[] = {"aaabb", "sdfsf",null, "skjhsdkhf"};

            String ans[] = new String[arr.length];

            for(int i=0;i< arr.length; i++){
                String word = arr[i];
                System.out.println(word);
                String anstr = "";
                for(int j=0; j<word.length(); j++){
                    char ch = word.charAt(j);

//                System.out.println(anstr.indexOf(ch));
                    if(anstr.indexOf(ch) == -1 ){
                        anstr += word.charAt(j);
                    }

                }
                ans[i] = anstr;
            }
            System.out.println(Arrays.toString(ans));

        }catch (Exception e){

        }

    }
}

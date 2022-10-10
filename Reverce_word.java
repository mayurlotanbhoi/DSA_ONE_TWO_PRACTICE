public class Reverce_word {

    static String ReverceLIne(String str){
        //str = str.trim();
        String word[] = str.split("[.]");
       System.out.println(word.length);
        StringBuilder reverceString = new StringBuilder();

        for(int i= word.length-1; i>=0; i--){
            if(!word[i].equals(""))
            reverceString.append(word[i]);
            if(i != 0) reverceString.append(".");


        }
        return reverceString.toString();
    }
    public static void main(String[] args) {
        String str = "i.like.this.program.very.much";

        System.out.println(ReverceLIne(str));
    }
}

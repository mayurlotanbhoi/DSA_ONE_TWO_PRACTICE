public class Anagram {
    static  boolean Anagram(String s1, String s2){
        int fre[] = new int[256];
        for(int i=0; i<s1.length(); i++){
            int ch = (int)s1.charAt(i);
            fre[ch]++;

        }for(int i=0; i<s2.length(); i++){
            int ch = (int)s2.charAt(i);
            fre[ch]--;
        }

        for(int j=0; j<256;j++){
            if(fre[j] != 0) return false;
        }
       return true;
    }
    public static void main(String[] args) {
        String s1 = "silence";
        String s2 = "liscene";

        System.out.println(Anagram(s1,s2));
    }
}

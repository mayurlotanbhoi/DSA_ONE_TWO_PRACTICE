public class longestPAlindromSubString {
    static String findSubString(String s){
        int start=0, end=0;

        for(int i=0; i<s.length(); i++){

            int len1 = substringaroudI(s,i,i);
            int len2 = substringaroudI(s,i,i+1);

            int maxlen = Math.max(len2,len1);

            if(maxlen > end-start){
                start = i-(maxlen-1)/2;
                end = i+maxlen/2;
            }
        }
        return s.substring(start,end+1);
    }

    static int substringaroudI(String s, int left, int rigth){
        int l=left;
        int r = rigth;

        while(l>=0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;

        }
        return r-l-1;
    }
    public static void main(String[] args) {
        String str = "gjggjaabaa";
        System.out.println(findSubString(str));
    }
}

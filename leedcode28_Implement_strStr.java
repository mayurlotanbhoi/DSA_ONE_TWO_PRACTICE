public class leedcode28_Implement_strStr {

    static int cheak(String haystack,String needle){
        int hl = haystack.length();
        int nl =needle.length();

        if(needle == "") return 0;

        for(int i=0; i<=hl-nl; i++){

            for(int j=0; j<nl; j++){

                if(haystack.charAt(i+j) != needle.charAt(j)){
                    break;
                }

                if(j == nl-1) return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(cheak(haystack,needle));
    }
}
//    Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//
//        Clarification:
//
//        What should we return when needle is an empty string? This is a great question to ask during an interview.
//
//        For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
//
//
//
//        Example 1:
//
//        Input: haystack = "hello", needle = "ll"
//        Output: 2
//        Example 2:
//
//        Input: haystack = "aaaaa", needle = "bba"
//        Output: -1

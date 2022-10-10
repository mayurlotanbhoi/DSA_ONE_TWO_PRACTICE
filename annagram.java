public class annagram {

    static boolean annagram(String s1, String s2){
        int arr[] = new int[256];

        for(int i=0; i<s1.length(); i++){
            int ch = s1.charAt(i);
            arr[ch]++;
        }
        for(int i=0; i<s2.length(); i++){
            int ch = s2.charAt(i);
            arr[ch]--;
        }

        for(int i=0; i<256; i++){

            if(arr[i] >0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        String s1 = "car";
        String s2 = "rac";

        System.out.println(annagram(s1,s2));
    }
}

public class mutliplt_num_using_rwcu {
    static int muntiply(int a, int b){
        if(b == 0) return 0;

        return a+ muntiply(a,b-1);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        System.out.println(muntiply(a,b));
    }
}

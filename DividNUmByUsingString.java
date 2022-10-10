import java.util.Scanner;

public class DividNUmByUsingString {
    public static void main(String[] args) {

StringBuilder  sb = new StringBuilder("mayur");
for(int i=0;i<sb.length()/2;i++){
    int front = i;
    int back = sb.length()-1-i;

    char frontchar = sb.charAt(front);
    char backchat = sb.charAt(back);

    sb.setCharAt(front,backchat);
    sb.setCharAt(back,frontchar);
}
        System.out.println(sb);
    }
}
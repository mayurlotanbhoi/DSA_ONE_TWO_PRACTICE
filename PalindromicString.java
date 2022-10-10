import java.util.Scanner;

public class PalindromicString {

    public static void main(String[] args)
    {
        //Take input from the user
        //Create instance of the Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int r,sum=0;
        int temp=num;
        while(num>0)
        {
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        if(temp==sum)
            System.out.println("The entered number "+temp+" is a palindrome number ");
        else
            System.out.println("The entered number "+temp+" is not a palindrome");
    }
}

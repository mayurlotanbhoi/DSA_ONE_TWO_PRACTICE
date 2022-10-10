package First1;


import java.util.Scanner;

public class Array {
     static void Firstway() {
         int[] marks = new int[3];

         marks[0] = 95;
         marks[2] = 96;
         marks[1] = 94;
         System.out.println(marks[0]);
         System.out.println(marks[1]);
         System.out.println(marks[2]);
     }

     static void SecondWay(){
         int [] secomdWay = { 55,66,99};
         System.out.println(secomdWay[0]);
         System.out.println(secomdWay[1]);
         System.out.println(secomdWay[2]);
     }

     static void usingForLoop(){
         System.out.println("Enter the size");
         Scanner sc = new Scanner(System.in);
         int size = sc.nextInt();
         int[] usingForloop = new int[size];
         for(int i = 0; i<size; i++){
             usingForloop[i]= sc.nextInt();
         }
         for(int i = 0; i<usingForloop.length; i++){
         int x = sc.nextInt();

if (usingForloop[i] == x){
    System.out.println("x is found at index : " + usingForloop[i]);
}

         }

     }
        public static void main(String[] args){
         //   Firstway();// this is the first way
         //   SecondWay();// this is the second way we must kwon value for array
            usingForLoop();//usind for loop and scannre class
    }
}

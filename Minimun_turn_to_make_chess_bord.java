import java.util.Scanner;

public class Minimun_turn_to_make_chess_bord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int cl1=0;int cl2=0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                int input_matric = sc.nextInt();
                int last_dig = (i+j)&1;

                if(input_matric ==  last_dig) cl1+=1;
                if(input_matric !=  last_dig) cl2+=1;

            }
        }

        System.out.println(Math.min(cl1, cl2));
    }
}
//import java.io.BufferedReader;
//        import java.io.IOException;
//        import java.io.InputStreamReader;
//class Employee{
//    String name;
//    int id;
//    int age;
//    Employee(String name, int age, int id){
//        this.name = name;
//        this.age = age;
//        this.id = id;
//    }
//    public void displayDetails(){
//        System.out.println("Name: "+this.name);
//        System.out.println("Age: "+this.age);
//        System.out.println("Id: "+this.id);
//    }
//}
//public class ReadData {
//    public static void main(String args[]) throws IOException {
//        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Enter your name: ");
//        String name = reader.readLine();
//        System.out.println("Enter your age: ");
//        int age = Integer.parseInt(reader.readLine());
//        System.out.println("Enter your Id: ");
//        int id = Integer.parseInt(reader.readLine());
//        Employee std = new Employee(name, age, id);
//        std.displayDetails();
//    }
//}



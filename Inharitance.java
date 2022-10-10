class car1{
    int gears;
    int number;
    String brand;
    int wheels;
    int drive;
    String color;

    void stert_car(int n){
        System.out.println("car strarting brrrrngbrrrrn"+n);
    }

    void accellerat(){
        System.out.println("increas speed");
    }

    void car_move(){
        System.out.println("car move");
    }
}

class BMW extends car1{
    int price;
    String material;
    int warrenty;

}

class audi extends BMW{

}

public class Inharitance {

    public static void main(String[] args) {
        audi xuv = new audi();
        xuv.stert_car(5);
        xuv.accellerat();
        xuv.color = "black";
        xuv.material = "iron";
        xuv.price = 35146546;
        System.out.println(xuv.color);
        System.out.println(xuv.material);
        System.out.println(xuv.price);

    }
}

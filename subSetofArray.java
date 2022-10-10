import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class subSetofArray {
  static boolean isSubset(int arr1[], int arr2[]){
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<arr1.length; i++){
            if(!set.contains(arr1[i])){
                set.add(arr1[i]);
            }
        }
        for(int i=0; i<arr2.length; i++){

            if(!set.contains(arr2[i])){
                return false;
            }
        }
       return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[] = {1,2,3,6,5,8};
        int arr2[] = {1,5,3};
        System.out.println(isSubset(arr1,arr2));
    }
}

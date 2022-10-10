public class DublicatInString {

    public static void main(String[] args) {
        String str = "mmymaayyyuurmr";

        StringBuilder sb1 = new StringBuilder();

        char[] arr =str.toCharArray();

        for(int i=0; i< arr.length;i++){
            boolean flag = false;
            for(int j=i+1; j< arr.length; j++){

                if(arr[i] == arr[j]){
                     flag=true;
                }

                }
            if(!flag){
                sb1.append(arr[i]);
            }
        }

            System.out.println(sb1);


      for(int i=0;i< arr.length;i++){


      }


    }
}

package array;

public class ArrayClass3 {


    public static void main(String[] args) {


        int[] myAge;
        myAge = new int[5];
        myAge[0] = 400;
        myAge[1] = 501;
        myAge[2] = 600;
        myAge[3] = 721;
        myAge[4] = 800;

//forword loop

        for (int i = 0; i < myAge.length; i++) {

            if(myAge[i]%2==0)

                System.out.println(myAge[i]);


        }

    }
}

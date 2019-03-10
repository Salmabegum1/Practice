package array;

public class ArrayClass2 {


    public static void main(String[]args){


        int[] myAge;
        myAge=new int[5];
        myAge[0]=400;
        myAge[1]=500;
        myAge[2]=600;
        myAge[3]=700;
        myAge[4]=800;

        int i=0;

        for(;;i++){

            System.out.println(myAge[i]);

            i++;
            if(i>= myAge.length){
                break;
            }
        }

    }
}

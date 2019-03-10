package array;

public class ArrayClass1 {

    public static void main(String[]args){


        int[] myAge;
        myAge=new int[5];
        myAge[0]=400;
        myAge[1]=500;
        myAge[2]=600;
        myAge[3]=700;
        myAge[4]=800;
/*for each loop
        for (int i:myAge){
            System.out.println(i);
        }*/
//forword loop

 /*for(int i=0;i<myAge.length;i++){

     System.out.println(myAge[i]);

*/
        //reverse loop
        for(int i=myAge.length -1;i>=0;i--){

            System.out.println(myAge[i]);

            //every other one

            // for(int i=0;i<myAge.length;i+=2){
            //System.out.println(myAge[i]);
        }

    }
}

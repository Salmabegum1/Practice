package array;

public class ArrayClass {



     /* 1,2,3,4,5 = 5 length
      0,1,2,3,4 = index(length-1)
    */

    public void simpleArray(){
        int [] intArray ={2,5,32,8,10};
        System.out.println(intArray.length);


        int index =intArray.length-3;
        System.out.println(index);


        //because it start from 0
        int position =intArray[4];
        System.out.println(position);

        System.out.println(intArray[2]);

    }
    public void stringArray(){
        String []flower = {"Rose","Lily","Jasmin","Dagy"};

        String str=flower[3];

        System.out.println(str);
        System.out.println(flower[0]);
        System.out.println(flower[1]);
        System.out.println(flower[2]);
        System.out.println(flower[3]);
    }
    public static void initializeArray(){
        int [] a = new int[3];
        a [0]=1;
        a [1]=10;
        a [2]=20;
        // a [3]=30; if i try to print it will give error

        System.out.println(a.length);
        System.out.println(a[1]);
        System.out.println(a[2]);

    }
    public static void arrayWithLoop(){
        int[] intArray1= new int[8];
        intArray1[0]=10;
        intArray1[1]=20;
        intArray1[2]=30;
        intArray1[3]=40;
        intArray1[4]=50;
        intArray1[5]=60;
        intArray1[6]=70;
        intArray1[7]=80;
        intArray1[8]=90;
        intArray1[8]=1000;

        for(int i=0;i<intArray1.length;i++){
            System.out.println(intArray1[i]);
        }
    }
    public  void arrayLoopInsertValue() {
        int[] intArray1 = new int[5];
        for (int i = 0; i < intArray1.length; i++) {
            int x = i + 3;
            intArray1[i] = x;
           /*if & break statement and non static method can access
             static method*/
            if (intArray1[i] == 5) {
                arrayWithLoop();
                break;

            }

        }
        for(int i=0; i<intArray1.length;i++){
            System.out.println(intArray1[i]);
        }
    }
    public static void main(String[] args) {
        ArrayClass obj=new ArrayClass();
        // obj.simpleArray();
        //obj.stringArray();
        //initializeArray();
        // arrayWithLoop();
        obj.arrayLoopInsertValue();





    }
}

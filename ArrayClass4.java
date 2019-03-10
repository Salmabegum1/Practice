package array;

public class ArrayClass4 {


    public static void main(String[] args) {

/*
if the condition does not match do loop only execute one time but
while loop does not execute if the condition is not match
 */
        int i = 0;

       /* do {
            System.out.println(i);
            i++;

        } while (i < 10);
        */
        while (i < 10) {
            if(i== 6)
                break;
            System.out.println(i);
            i++;

        }
    }
}

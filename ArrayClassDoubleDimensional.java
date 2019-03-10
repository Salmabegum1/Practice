package array;

public class ArrayClassDoubleDimensional {


    public static void arrayDDSimple() {
        int[][] x = new int[2][3];
        //[2] row [3] column
        x[0][0] = 10;
        x[0][1] = 20;
        x[0][2] = 30;
        x[1][0] = 40;
        x[1][1] = 50;
        x[1][2] = 60;
        System.out.println(x[1][0]);

    }

    public static void arrayWForLoop() {
        int[][] y = {{1, 2, 3}, {3, 4, 5}, {6, 7, 8}};
        //i for row j for column
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(y[i][j]+"   ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        ArrayClassDoubleDimensional obj1 = new ArrayClassDoubleDimensional();
        arrayDDSimple();
        arrayWForLoop();

    }
}

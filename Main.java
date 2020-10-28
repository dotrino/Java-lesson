import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//     doDimensionArrayDemo();
//     doDemoDiagonals();
//     doDemoTriangle();
//     doDemoDynamicalArray();

    }






    static void doDemoDynamicalArray(){
        Scanner scanner = new Scanner(System.in);
        int [] values = {1,2,3};
        int value = 0;
        System.out.println("Please enter new value...Range [0,N]");
        while ((value = scanner.nextInt()) >= 0) {
            values[values.length] = value;

        }
    }


    static void doDemoTriangle(){
        int [][] numbers = new int [10][10];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <= i; j++) {
   //             if (j <= i)
                    System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }


    static void doDemoDiagonals(){
        int[][] matrix = new int[3][3];
        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
 //             for (int j = 0; j < matrix[i].length; j++)
                matrix[i][i] = 1;
                matrix[i][matrix.length - 1 - i] = 1;
                counter++;
            }
        drawArray(matrix);
        System.out.print("Counter: " + counter);
    }

    static void doDimensionArrayDemo(){
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        drawArray(matrix);
    }


    static void drawArray(int[][] array) {
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length ; j++) {
              System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}

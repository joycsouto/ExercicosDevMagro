package MatrizExercise;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how much lines:");
        int lines = scanner.nextInt();
        System.out.println("Enter how many columns");
        int columns = scanner.nextInt();

        int[][] matriz = new int[lines][columns];


        System.out.println("Enter the numbers in array");
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                int number = matriz[i][j] = scanner.nextInt();

            }
        } //linhas < colunas


        System.out.println("Enter a number of array:");
        Integer num = scanner.nextInt();

        for (int line = 0; line < matriz.length; line++) {
            for (int column = 0; column < matriz.length; column++) {
                if (matriz[line][column] == num) {

                    System.out.println("Position :" + line + ", " + column);
//1 2 3
//4 5 6
//4 6 5                  i > 0
                    if (line > 0) {
                        int up = matriz[line - 1][column];
                        System.out.println("Up :" + up);
                    }
                    if ( line < lines - 1) {
                        int downN = matriz[line + 1][column];
                        System.out.println("Down :" + downN);
                    }
                    if (column < columns - 1) {
                        int right = matriz[line][column + 1];
                        System.out.println("Right :" + right);
                    }
                    if (column > 0) {
                        int leftN = matriz[line][column - 1];
                        System.out.println("Left :" + leftN);
                    }

                }
            }
        }
    }


}


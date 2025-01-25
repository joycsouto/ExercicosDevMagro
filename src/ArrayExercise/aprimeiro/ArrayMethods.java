package ArrayExercise.aprimeiro;

import java.util.Scanner;

public class ArrayMethods {
    Scanner scan = new Scanner(System.in);
    int quantityNumebers ;


    public void loop() {
        System.out.println("How many numbers do you will enter? ");
        quantityNumebers = scan.nextInt();
        int[] num = new int[quantityNumebers];

        for (int i = 0; i < quantityNumebers; i++) {
            System.out.println("Enter a number:");
            num[i] = scan.nextInt();

            for (int numeros : num) {
                if (numeros > 10) {
                    System.out.println("The max value is 10, try again");
                }
            }
        }
        System.out.println("NEGATIVES NUMBERS");
        for (int negativos : num){
           if(negativos < 0){
               System.out.println(negativos);
           }
       }

    }

}



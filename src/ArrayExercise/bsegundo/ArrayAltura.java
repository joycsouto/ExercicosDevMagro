package ArrayExercise.bsegundo;

import java.util.Scanner;

public class ArrayAltura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many persons will be enter?");
        int quantityPerson = scanner.nextInt();

        String[] name = new String[quantityPerson];
        int[] age = new int[quantityPerson];
        double[] height = new double[quantityPerson];

        for (int i = 0; i < quantityPerson; i++) {
            System.out.println("Data off " + i + " person");
            System.out.println("Name:");
            name[i] = scanner.next();
            System.out.println("Age:");
            age[i] = scanner.nextInt();
            System.out.println("Height:");
            height[i] = scanner.nextDouble();
        }


        int cont = 0;
        for (int i = 0; i < quantityPerson; i++) {
            if (age[i] < 16)
                cont = cont + 1;
        }
        int percent = cont * 100 / quantityPerson;
        System.out.println(percent);


        double sum = 0;
        for (int i = 0; i < quantityPerson; i++) {
            sum = sum +height[i];
        }
        double media = sum/quantityPerson;
        System.out.println(media);
    }




        }






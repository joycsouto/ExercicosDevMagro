package ArrayExercise.cterceiro;

import java.util.Scanner;

public class MethodRent {
    Scanner scanner = new Scanner(System.in);
    int quantityRoom;

 Client client = new Client();
Client[] clients = new Client[10];
    public  void collectingData() {
        System.out.println("How many rooms do you wanna rent?");
        quantityRoom = scanner.nextInt();

        for (int j = 0; j < quantityRoom; j++) {

            System.out.println("Rent #" + j);
            System.out.println("Name:");
            client.setName(scanner.next());
            System.out.println("Email:");
            client.setEmail(scanner.next());
            System.out.println("Room:");
          int roomNumber = scanner.nextInt();


        }
        System.out.println(client.getName());
        System.out.println();
    }
}

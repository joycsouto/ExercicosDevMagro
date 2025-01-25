package Order.service;

import ArrayExercise.cterceiro.Client;
import Order.domain.Product;
import RegitrySystem.domain.Products;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Order {
    private Date moment;
    private OrderStatus status;
    private Integer quantity;

Scanner scanner =  new Scanner(System.in);
    ArrayList<Order> orders = new ArrayList<>();


    public void collectingDataClient(){
        Client client = new Client();
        System.out.println("Enter client data:");
        System.out.println("Name:");
        client.setName(scanner.next());
        System.out.println("Email:");
        client.setEmail(scanner.next());
        System.out.println("Birth date (DD/MM/YYYY):");
        client.setBirthDate(scanner.next());
    }
    public void orderData(){
        System.out.println("Enter order data:");
        System.out.println("Status:");
        OrderStatus.valueOf(scanner.next());
        System.out.println("How many items to this order?");
        int run = scanner.nextInt();
        if (run > 0){
        for (int i = 0; i < run ; i++) {
            Product product = new Product();
            System.out.println("Enter #" + i + " item data:");
            System.out.println("Product name:");
            product.setName(scanner.next());
            System.out.println("Product price:");
            product.setPrice(scanner.nextDouble());
            System.out.println("How many products?");
            quantity = scanner.nextInt();
        }
        }else System.out.println("Thanks for visiting the site (:");
    }

}

package Encapsulamento.RegitrySystem.service;

import Encapsulamento.RegitrySystem.domain.Products;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductService {

    Scanner scanner = new Scanner(System.in);
    ArrayList<Products> productsList = new ArrayList<>();
    int option;
    double price;

    public void addProduct() {
        Products product = new Products();
        System.out.println("Whats the name of you  product?");
        product.setName(scanner.next());
        System.out.println("Whats the price of you product?");
        product.setPrice(scanner.nextDouble());
productsList.add(product);

    }

    public void listPdr() {

       if (productsList.isEmpty()){
           System.out.println("No products in the list.");
       }for (Products products : productsList){
            System.out.println(products);
        }


    }

    public void totalProducts() {
        double sum = 0;
        for (Products products : productsList){
            sum += products.getPrice();
        }
        System.out.println("Total price of all products " + sum);
    }


    public void MenuProducts() {
        while (option != 4) {
            System.out.println("1. add a product.");
            System.out.println("2. List of products. ");
            System.out.println("3. Total of all products.");
            System.out.println("4. Out.");
            System.out.println("Choose an option:");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                  addProduct();

                    break;
                case 2:
                    listPdr();
                    break;
                case 3:
                    totalProducts();
                    break;
                case 4 :
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option, try again.");
            }
        }
    }

}

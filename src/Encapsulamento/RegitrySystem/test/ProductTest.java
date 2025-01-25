package Encapsulamento.RegitrySystem.test;

import Encapsulamento.RegitrySystem.service.ProductService;

public class ProductTest {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        productService.MenuProducts();
    }
}

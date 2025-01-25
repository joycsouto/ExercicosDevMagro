package RegitrySystem.test;

import RegitrySystem.service.ProductService;

public class ProductTest {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        productService.MenuProducts();
    }
}

import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the product name:");
        String productName = scanner.next();

        Product product = new Product(productName);

        System.out.println("Product Name: " + product.productName);
        System.out.println("Company Name: " + Product.companyName);
        System.out.println("Product ID: " + product.productID);
    }
}
public class Product {
    static String companyName;
    int productID;
    static int productIDcounter = 1000;
    String productName;

    static {
        companyName = "MyCompany";
    }

    {
        productID = productIDcounter;
        productIDcounter++;
    }

    Product(String productName) {
        this.productName = productName;
    }
}

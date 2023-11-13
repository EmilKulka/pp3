public class Product {
    private String productName;
    private boolean isVegetarian;

    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    public String getProductName() {
        return productName;
    }

    public void setIsVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }

    public boolean getIsVegetarian() {
        return isVegetarian;
    }

    public void displayInfo() {
        System.out.println("Product name is: " + getProductName() + "\n" + "Product is vegetarian: " + (getIsVegetarian() ? "Yes": "No"));
    }

    public static void main(String[] args) {
        Product product1 = new Product();

        product1.setProductName("Kurczak");
        product1.setIsVegetarian(false);
        product1.displayInfo();
    }
}

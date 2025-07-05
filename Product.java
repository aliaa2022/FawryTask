public class Product{
    String name ;
    float price ;
    int quantity;
    boolean isExpired ;
    boolean isShippable;
    
    public Product(String name, float price, int quantity, boolean isExpired, boolean isShippable) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.isExpired=isExpired;
    }
    
    public Product (boolean isExpired, boolean isShippable){
        this.isExpired=isExpired;
        this.isShippable= isShippable;
    }
    
    
}
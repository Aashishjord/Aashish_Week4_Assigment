class Product {
    private String name;
    private double price;

    Product(String name, double price){
        this.name=name;
        this.price=price;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public void displayDetails(){
        System.out.println("Name:"+getName());
        System.out.println("Price:"+getPrice());
    }

}
class Electronics extends Product {
    private int warrantyPeriod;

    Electronics(String name, double price, int warrantyPeriod){
        super(name,price);
        this.warrantyPeriod=warrantyPeriod;
    }

    public int getWarrantyPeriod(){
        return warrantyPeriod;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Warranty Period:"+getWarrantyPeriod()+"yrs");
    }


}

class Clothing extends Product {
    private String size;
    private String materials;

    Clothing(String name, double price,String size,String materials){
        super(name,price);
        this.size=size;
        this.materials=materials;


    }

    public String getSize(){
        return size;
    }

    public String getMaterials(){
        return materials;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Size:"+getSize());
        System.out.println("Materials:"+getMaterials());
    }

}

class Grocery extends Product {
    private String expiryDate;

    Grocery(String name,double price,String expiryDate){
        super(name,price);
        this.expiryDate=expiryDate;
    }

    public String getExpiryDate(){
        return expiryDate;
    }

    @Override 
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Expiry Date:"+getExpiryDate());
    }

}

public class ProductCatalog{
    public static void main(String[] args) {
        Product pr=new Product("Tomato",5000);
        pr.displayDetails();
        System.out.println("-------------");

        Clothing cl=new Clothing("Half-Pant", 3000,"XXL", "Cotton");
        cl.displayDetails();
        System.out.println("------------");


        Electronics el=new Electronics("Refrigerator", 500000, 5);
        el.displayDetails();
        System.out.println("------------");

        Grocery gr=new Grocery("Potato", 40, "2025-06-16");
        gr.displayDetails();
            

    }
}

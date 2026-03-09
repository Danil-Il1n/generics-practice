public class Product extends BaseRecord{
    private double price;

    public Product(String id,  double price) {
        super(id);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return getId() + " " + price;
    }
}

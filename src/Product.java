public class Product extends BaseRecord{
    double price;

    public <T> Product(String id,  double price) {
        super(id);
        this.price = price;
    }
}

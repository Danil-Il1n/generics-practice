public abstract class BaseRecord {
    String id;

    public <T> BaseRecord(String id) {
        this.id = id;
    }
}

import java.util.ArrayList;
import java.util.List;

public class RecordStorage<T extends BaseRecord> {
    private final List<T> list = new ArrayList<>();

    void addRecord(T item) {
        list.add(item);
    }

    public T getRecordById(String id) {
        if (id == null) return null;

        for (T record : list) {
            if (record.getId().equals(id)) {
                return record;
            }
        }
        return null;
    }

    public List<T> getList() {
        return list;
    }
}

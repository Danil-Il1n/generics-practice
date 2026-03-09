public class StorageUtils {
    void printAllIds(RecordStorage<? extends BaseRecord> storage){
        for (BaseRecord recordStorage : storage.getList()){
            System.out.println(recordStorage.id);
        }
    }
}

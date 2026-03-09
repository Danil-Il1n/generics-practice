public class StorageUtils {
    public static void printAllIds(RecordStorage<? extends BaseRecord> storage){
        for (BaseRecord recordStorage : storage.getList()){
            System.out.println(recordStorage.getId());
        }
    }
}

class Main {
    public static void main(String[] args) {
        Product product = new Product("milk", 15.5);
        SupportTicket supportTicket = new SupportTicket("12893", "issue");

        RecordStorage<BaseRecord> recordStorage = new RecordStorage<>();
        recordStorage.addRecord(product);
        recordStorage.addRecord(supportTicket);

        StorageUtils.printAllIds(recordStorage);

        System.out.println(recordStorage.getRecordById("milk"));

    }
}
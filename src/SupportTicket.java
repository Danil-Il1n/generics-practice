public class SupportTicket extends BaseRecord{
    String issueDescription;

    public <T> SupportTicket(String id, String issueDescription) {
        super(id);
        this.issueDescription = issueDescription;
    }
}

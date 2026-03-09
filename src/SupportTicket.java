public class SupportTicket extends BaseRecord{
    private String issueDescription;

    public SupportTicket(String id, String issueDescription) {
        super(id);
        this.issueDescription = issueDescription;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    @Override
    public String toString() {
        return getId() + " " + issueDescription;
    }
}

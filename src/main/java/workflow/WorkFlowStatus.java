package workflow;

public class WorkFlowStatus {
    public static final String OK = "OK";
    public static final String ERROR = "ERROR";
    private String id;
    private String status = OK;
    public WorkFlowStatus(String id, String status) {
        this.id = id;
        this.status = status;
    }
    public boolean isOk() {
        if (OK.equals(status)) {
            return true;
        }
        return false;
    }
}

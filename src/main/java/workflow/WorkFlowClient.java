package workflow;

public class WorkFlowClient {
    public WorkFlowStatus getStatus(String id) {
        // This would use HTTP to get the status.
        return new WorkFlowStatus(id, WorkFlowStatus.OK);
    }
}

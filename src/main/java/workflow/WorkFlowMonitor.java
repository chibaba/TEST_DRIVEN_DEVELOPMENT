package workflow;

public class WorkFlowMonitor {
    private EmailNotifier emailNotifier;
    private WorkFlowClient workflowClient;

    public WorkFlowMonitor(EmailNotifier emailNotifier, WorkFlowClient workflowClient) {
        this.emailNotifier = emailNotifier;
        this.workflowClient = workflowClient;
    }
    public void checkStatus(String id) {
        WorkFlowStatus workflowStatus = workflowClient.getStatus(id);
        if (!workflowStatus.isOk()) {
            emailNotifier.sendFailureEmail(workflowStatus);
        }
    }


}

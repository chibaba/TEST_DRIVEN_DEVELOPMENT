import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import workflow.EmailNotifier;
import workflow.WorkFlowClient;
import workflow.WorkFlowMonitor;
import workflow.WorkFlowStatus;

import static org.mockito.Mockito.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class WorkFlowMonitorTest {

    private EmailNotifier emailNotifier;
    private WorkFlowClient workflowClient;
    private WorkFlowMonitor workflowMonitor;
    @BeforeAll
    public void setUpMocks() {
        emailNotifier = mock(EmailNotifier.class);
        workflowClient = mock(WorkFlowClient.class);
        workflowMonitor = new WorkFlowMonitor(emailNotifier, workflowClient);
    }
    @Test
    public void testSuccess() {
        String id = "WORKFLOW-1";
        WorkFlowStatus workflowStatus = new WorkFlowStatus(id, WorkFlowStatus.OK);
        when(workflowClient.getStatus(id)).thenReturn(workflowStatus);
        workflowMonitor.checkStatus(id);
        verify(emailNotifier, times(0)).sendFailureEmail(workflowStatus);
    }
    @Test
    public void testFailure() {
        String id = "WORKFLOW-1";
        WorkFlowStatus workflowStatus = new WorkFlowStatus(id, WorkFlowStatus.ERROR);
        when(workflowClient.getStatus(anyString())).thenReturn(workflowStatus);
        workflowMonitor.checkStatus(id);
        verify(emailNotifier).sendFailureEmail(workflowStatus);
    }

}

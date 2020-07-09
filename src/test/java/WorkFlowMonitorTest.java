import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import workflow.EmailNotifier;
import workflow.WorkFlowClient;
import workflow.WorkFlowMonitor;

import static org.mockito.Mockito.mock;
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

}

package org.kie.perf.jbpm.constant;

public enum ProcessStorage {

    HumanTask("HumanTask.bpmn2", "org.kie.perf.HumanTask"),
    GroupHumanTask("GroupHumanTask.bpmn2", "org.kie.perf.GroupHumanTask"),
    ParallelGateway("ParallelGateway.bpmn2", "org.kie.perf.ParallelGateway"),
    ParallelGatewayTenTimes("ParallelGatewayTenTimes.bpmn2", "org.kie.perf.ParallelGatewayTenTimes"),
    ParallelGatewayTwoTimes("ParallelGatewayTwoTimes.bpmn2", "org.kie.perf.ParallelGatewayTwoTimes"),
    RuleTask("RuleTask.bpmn2", "org.kie.perf.RuleTask"),
    ScriptTask("ScriptTask.bpmn2", "org.kie.perf.ScriptTask"),
    IntermediateSignal("IntermediateSignal.bpmn2", "org.kie.perf.IntermediateSignal"),
    StartEnd("StartEnd.bpmn2", "org.kie.perf.StartEnd"),
    IntermediateTimer("IntermediateTimer.bpmn2", "org.kie.perf.IntermediateTimer"),
    AsyncPrintTask("AsyncPrintTask.bpmn2", "org.kie.perf.AsyncPrintTask"),
    MultiInstanceSubprocesses("MultiInstanceSubprocesses.bpmn2", "org.kie.perf.MultiInstanceSubprocesses")
    ;
    
    private String path;
    private String processDefinitionId;
    
    private ProcessStorage(String name, String processDefinitionId) {
        this.path = "processes/" + name;
        this.processDefinitionId = processDefinitionId;
    }
    
    public String getPath() {
        return path;
    }
    
    public String getProcessDefinitionId() {
        return processDefinitionId;
    }
    
}

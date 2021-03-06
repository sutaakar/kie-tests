package org.kie.perf.jbpm.constant;

public enum UserStorage {

    PerfUser("perfUser"),
    EngUser("engUser")
    ;
    
    private String userId;
    
    private UserStorage(String userId) {
        this.userId = userId;
    }
    
    public String getUserId() {
        return userId;
    }
    
}

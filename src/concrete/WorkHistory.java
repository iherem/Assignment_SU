package concrete;

public class WorkHistory {
    private int workId;
    private String workName;
    private String workStatus;

    public WorkHistory(int workId, String workName, String workStatus) {
        this.workId = workId;
        this.workName = workName;
        this.workStatus = workStatus;
    }

    
    public int getWorkId() {
        return workId;
    }

    public void setWorkId(int workId) {
        this.workId = workId;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public String getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(String workStatus) {
        this.workStatus = workStatus;
    }
    
}

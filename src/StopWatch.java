import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public StopWatch(){
        this.startTime = new Date();
    }

    public Date getEndTime() {
        return endTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void Start() {
        this.startTime = new Date();
    }

    public void End() {
        this.endTime = new Date();
    }

    public long getElapsedTime() {
        Date endTime = this.getEndTime();
        Date startTime = this.getStartTime();
        return endTime.getTime() - startTime.getTime();
    }


}

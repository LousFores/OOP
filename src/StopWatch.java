public class StopWatch {
    private long startTime;
    private long endTime;
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }
    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    public long getStartTime() {
        return System.currentTimeMillis();
    }
    public long getEndTime() {
        return System.currentTimeMillis();
    }
    public double getElapsedTime() {
        return ( endTime-startTime);
    }
}

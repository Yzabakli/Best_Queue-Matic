public class Desk {

    final private int deskNumber;
    private int deskWaitingTime = 0;

    public int getDeskNumber() {
        return deskNumber;
    }

    public int getDeskWaitingTime() {
        return deskWaitingTime;
    }

    public void setDeskWaitingTime(int deskWaitingTime) {
        this.deskWaitingTime = getDeskWaitingTime() + deskWaitingTime;
    }

    public Desk(int deskNumber) {
        this.deskNumber = deskNumber;
    }
}

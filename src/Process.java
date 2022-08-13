public class Process {

    final private char id;
    final private int processDuration;

    public char getId() {
        return id;
    }

    public int getProcessDuration() {
        return processDuration;
    }

    public Process(char id, int processDuration) {
        this.id = id;
        this.processDuration = processDuration;
    }
}

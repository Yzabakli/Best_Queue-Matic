public class Client {

    private final String name;
    private final Process process;

    public String getName() {
        return name;
    }

    public Process getProcess() {
        return process;
    }

    public Client(String name, Process process) {
        this.name = name;
        this.process = process;
    }
}

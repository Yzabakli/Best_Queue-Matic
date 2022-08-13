import java.util.List;

public class DataGenerator {

    static void createProcess(){

        StaticConstants.PROCESS_LIST.addAll(List.of(new Process('A', 5), new Process('B', 3),
                new Process('C', 7), new Process('D', 10)));
    }

    static void createClient(){

        StaticConstants.CLIENT_QUEUE.addAll(List.of(new Client("Drogba", StaticConstants.PROCESS_LIST.get(0)),
                new Client("Cantona", StaticConstants.PROCESS_LIST.get(0)), new Client("Ronaldinho", StaticConstants.PROCESS_LIST.get(1)),
                new Client("Zidane", StaticConstants.PROCESS_LIST.get(2)), new Client("Cruyff", StaticConstants.PROCESS_LIST.get(3)),
                new Client("Ronaldo", StaticConstants.PROCESS_LIST.get(1)), new Client("Baggio", StaticConstants.PROCESS_LIST.get(2))));
    }

    static void createDesk(){

        StaticConstants.DESK_LIST.addAll(List.of(new Desk(1), new Desk(2), new Desk(3)));
    }
}

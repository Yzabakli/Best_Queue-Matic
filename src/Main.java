public class Main {

    static {

        DataGenerator.createProcess();
        DataGenerator.createClient();
        DataGenerator.createDesk();
    }

    public static void main(String[] args) {

        flow();
    }

    private static void flow() {

        while (!StaticConstants.CLIENT_QUEUE.isEmpty()){

            int leastWaitingTime = 0;

            for (int i = 0; i < StaticConstants.DESK_LIST.size(); i++) {

                if (StaticConstants.DESK_LIST.get(i).getDeskWaitingTime() < StaticConstants.DESK_LIST.get(leastWaitingTime).getDeskWaitingTime()){

                    leastWaitingTime = i;
                }
            }

            if (StaticConstants.CLIENT_QUEUE.size() > 1){

                StaticConstants.DESK_LIST.get(leastWaitingTime).setDeskWaitingTime(StaticConstants.CLIENT_QUEUE.poll().getProcess().getProcessDuration());
            }else {

                StaticConstants.CLIENT_QUEUE.poll();
                System.out.println("Desk " + (leastWaitingTime + 1) + ", " + StaticConstants.DESK_LIST.get(leastWaitingTime).getDeskWaitingTime() + " minutes");
            }
        }
    }
}

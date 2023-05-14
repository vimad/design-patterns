package functional.state;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.logger(System.out::println);
        Logger quite = logger.getQuite();
        Logger chatty = logger.getChatty();

        chatty.warn("chatty warning");
        quite.warn("quite warning");

        chatty.error("chatty error");
        quite.error("quite error");
    }
}

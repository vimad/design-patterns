package functional.adapter;

public class AdapterTester {

    interface Logger {
        void log(String message);
    }

    interface Logger2 {
        void log(String level, String message);

        default Logger level(String level) {
            return msg  -> log(level, msg);
        }
    }

    public static void main(String[] args) {
        Logger2 logger2 = (level, message) -> System.out.println(level + " - " + message);
        Logger logger = logger2.level("info");
        logger.log("Testing");
    }

}

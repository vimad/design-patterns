package functional.state;

import functional.chaining.Consumer;

import java.util.function.Function;

import static java.util.function.Function.identity;

public class Logger {

    private final Consumer<String> error, warning;
    private final Logger quite, chatty;

    public Logger(Consumer<String> error, Consumer<String> warning,
                  Function<Logger, Logger> quiteFactory,
                  Function<Logger, Logger> chattyFactory) {
        this.error = error;
        this.warning = warning;
        quite = quiteFactory.apply(this);
        chatty = chattyFactory.apply(this);
    }

    public Logger getQuite() {
        return quite;
    }

    public Logger getChatty() {
        return chatty;
    }

    public void warn(String msg) {
        warning.accept(msg);
    }

    public void error(String msg) {
        error.accept(msg);
    }

    public static Logger logger(Consumer<String> consumer) {
        return new Logger(consumer, consumer,
                chatty -> new Logger(consumer, msg -> {}, identity(), it -> chatty),
                identity());
    }

}

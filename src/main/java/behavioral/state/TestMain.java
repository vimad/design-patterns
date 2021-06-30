package behavioral.state;

public class TestMain {

    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }

}

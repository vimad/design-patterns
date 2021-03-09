package creational.abstractfactory;

import creational.abstractfactory.concretefactory.MacGUIFactory;
import creational.abstractfactory.concretefactory.WindowsGUIFactory;
import creational.abstractfactory.products.Button;
import creational.abstractfactory.products.CheckBox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestMain {
    public static void main(String[] args) throws IOException {

        int choice;

        GUIAbstractFactory guiFactory = null;

        System.out.println("Enter operating system");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        choice = Integer.parseInt(br.readLine());

        if (choice == 1) {
            guiFactory = new WindowsGUIFactory();
        } else if (choice == 2) {
            guiFactory = new MacGUIFactory();
        } else {
            System.out.println("Wrong selection");
            return;
        }

        Button button = guiFactory.createButton();
        CheckBox checkBox = guiFactory.createCheckBox();

        System.out.println(button);
        System.out.println(checkBox);
    }
}

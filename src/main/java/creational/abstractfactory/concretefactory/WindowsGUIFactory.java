package creational.abstractfactory.concretefactory;

import creational.abstractfactory.GUIAbstractFactory;
import creational.abstractfactory.products.Button;
import creational.abstractfactory.products.CheckBox;
import creational.abstractfactory.products.concreteproducts.WindowsButton;
import creational.abstractfactory.products.concreteproducts.WindowsCheckBox;

public class WindowsGUIFactory extends GUIAbstractFactory {
    public Button createButton() {
        return new WindowsButton();
    }

    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}

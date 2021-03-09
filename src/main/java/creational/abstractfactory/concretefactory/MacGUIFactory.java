package creational.abstractfactory.concretefactory;

import creational.abstractfactory.GUIAbstractFactory;
import creational.abstractfactory.products.Button;
import creational.abstractfactory.products.CheckBox;
import creational.abstractfactory.products.concreteproducts.MacButton;
import creational.abstractfactory.products.concreteproducts.MacCheckBox;

public class MacGUIFactory extends GUIAbstractFactory {
    public Button createButton() {
        return new MacButton();
    }

    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}

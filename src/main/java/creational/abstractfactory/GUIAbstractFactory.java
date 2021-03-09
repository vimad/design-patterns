package creational.abstractfactory;

import creational.abstractfactory.products.Button;
import creational.abstractfactory.products.CheckBox;

public abstract class GUIAbstractFactory {
    public abstract Button createButton();
    public abstract CheckBox createCheckBox();
}

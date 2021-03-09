package creational.factory.concretefactory;

import creational.factory.AbstractFactory;
import creational.factory.product.Product;
import creational.factory.product.ProductOne;
import creational.factory.product.ProductTwo;

public class ProductTwoFactory extends AbstractFactory {
    @Override
    public Product createProduct() {
        return new ProductTwo();
    }
}

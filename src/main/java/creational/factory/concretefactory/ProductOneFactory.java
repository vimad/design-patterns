package creational.factory.concretefactory;

import creational.factory.AbstractFactory;
import creational.factory.product.Product;
import creational.factory.product.ProductOne;

public class ProductOneFactory extends AbstractFactory {
    @Override
    public Product createProduct() {
        return new ProductOne();
    }
}

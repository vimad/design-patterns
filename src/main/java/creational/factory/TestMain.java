package creational.factory;

import creational.abstractfactory.concretefactory.MacGUIFactory;
import creational.abstractfactory.concretefactory.WindowsGUIFactory;
import creational.factory.concretefactory.ProductOneFactory;
import creational.factory.concretefactory.ProductTwoFactory;
import creational.factory.product.Product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestMain {
    public static void main(String[] args) throws IOException {
        int choice;
        AbstractFactory factory = null;
        System.out.println("Enter operating system");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        choice = Integer.parseInt(br.readLine());

        if (choice == 1) {
            factory = new ProductOneFactory();
        } else if (choice == 2) {
            factory = new ProductTwoFactory();
        } else {
            System.out.println("Wrong selection");
            return;
        }

        Product product = factory.createProduct();
        System.out.println(product);

    }
}

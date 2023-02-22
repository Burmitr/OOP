package vending_automat;

import java.net.StandardSocketOptions;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Product cola = new Product("Cola", 23);
        Product mars = new Product("Mars", 34);

        List<Product> mainGoods = new ArrayList<>();
        mainGoods.add(cola);
        mainGoods.add(mars);

        VendingAutomat box = new VendingAutomat();
        box.initProduct(mainGoods);

        System.out.println(box.getGoods());

        box.getProduct("Cola");
    
    }
}

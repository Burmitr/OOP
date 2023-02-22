package vending_automat;

import java.net.StandardSocketOptions;
import java.util.*;

public class VendingAutomat {
    private List<Product> goods = new ArrayList<>();

    public void initProduct(List<Product> product){
        for (Product item: product) {
            goods.add(item);
        }
    }

    public List<Product> getGoods() {
        return goods;
    }

    public void getProduct(String name) {
        for (Product item: goods) {
            if(item.getName().equals(name)) {
                System.out.println(item.getCost());
            }
        }
    }
}

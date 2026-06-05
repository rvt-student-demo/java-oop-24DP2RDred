package rvt.onlineshop;

import java.util.HashMap;
import java.util.Map;

public class shoppingcart{

    Map<String, item> shoppingcart = new HashMap<>();
    int total = 0;
    warehouse isInWarehouse = new warehouse();
    public void add(String product, int price){
           
                if(shoppingcart.containsKey(product)){
                    shoppingcart.get(product).increaseQuantity();
                    total += price;
                }else{
                    item item = new item(product, 1, price);
                    total += item.price();
                    shoppingcart.put(product, item);
                }
       
    }

    public int price(){
        return total;
    }

    public void print(){
        
        for (item product: shoppingcart.values()) {
            System.out.println(product.toString());
        } 
    }
}
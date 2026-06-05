package rvt.onlineshop;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class warehouse {
    Map<String, Integer> products = new HashMap<>();
    Map<String, Integer> products_stock = new HashMap<>();


    public void addProduct(String product, int price, int stock){
        products.put(product, price);
        products_stock.put(product, stock);
    }

    public int price(String product){
        if(products.containsKey(product)){
            return products.get(product);
        }else{
             return -99;
        }
       
    }

    public int stock(String product){
        if(products_stock.containsKey(product)){
            return products_stock.get(product);
        }else{
            return 0;
        }
    }

    public boolean take(String product){
             if (products_stock.containsKey(product) && products_stock.get(product) > 0){
                    products_stock.replace(product, products_stock.get(product)-1);
                    return true;
                }
            else{
                System.out.println("The product is not available or is out of stock");
                return false;
            }
        }

    public Set<String> products(){
        return products.keySet();
    }
    }
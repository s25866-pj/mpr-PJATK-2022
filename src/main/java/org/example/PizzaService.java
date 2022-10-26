package org.example;

import org.example.model.Order;
import org.example.model.Pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaService {
    private Pizza pizza;

    public Order makeOrder(int orderNumber,Pizza pizza){
        return new Order(orderNumber,pizza);
    }
    public static List<Pizza> getAvailablePizzas(){
        List<Pizza> menu=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            menu.add(new Pizza("Pizza"+i,(i+1)*10+5));
        }
        return menu;
    }


}

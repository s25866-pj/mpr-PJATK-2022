package org.example;

import org.example.model.Order;
import org.example.model.Pizza;

import java.util.List;
import java.util.Scanner;

public class Main {
int i;
    public static void main(String[] args) throws PizzaNotFoundException {
        try{
            for (int i = 0; i <PizzaService.getAvailablePizzas().size() ; i++) {
                System.out.println(PizzaService.getAvailablePizzas().get(i).name+"-"+PizzaService.getAvailablePizzas().get(i).cena+"zł.");

            }
            for (int i = 0; i < 4; i++) {
                Order order = new Order(i+1, PizzaService.getAvailablePizzas().get(i+2));
                System.out.println("nr: " + order.numer + ", pizza:" + order.pizza.name + ", cena:" + order.pizza.cena);
            }
        } catch (Exception e) {
            throw new PizzaNotFoundException("brak pizzy z takim numerem");
        }


    }
}
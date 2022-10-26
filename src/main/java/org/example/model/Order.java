package org.example.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@AllArgsConstructor
public class Order {
    @Getter @Setter public int numer;
    @Getter @Setter public Pizza pizza;


    //    public Order(int numer,Pizza pizza){
//        this.numer=numer;
//        this.pizza=pizza;
//    }
}

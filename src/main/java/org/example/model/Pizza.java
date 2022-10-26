package org.example.model;
import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;
import lombok.AllArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
public class Pizza {
    @Getter @Setter public String name;
    @Getter @Setter public int cena;
//    public Pizza(String name,int cena){
//        this.cena=cena;
//        this.name=name;
//    }

}

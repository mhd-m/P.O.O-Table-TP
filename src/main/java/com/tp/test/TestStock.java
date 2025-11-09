package com.tp.test;

import com.tp.basics.Ordi;
import com.tp.basics.Stock;

public class TestStock {

    public static void main(String[] args) {
        // Create some Ordi objects
        Ordi ordi1 = new Ordi("LG", "1", "proc1", 20, 512);
        Ordi ordi2 = new Ordi("Samsung", "2", "proc2", 15, 256);
        Ordi ordi3 = new Ordi("Apple", "3", "proc3", 10, 1024);

        Stock stock = new Stock(10);


        stock.addOrdi(ordi1);
        stock.addOrdi(ordi2);
        stock.addOrdi(ordi3);


        stock.rechercheOrdi("3", "Apple");

         stock.suppOrdi("2", "Samsung");
         stock.rechercheOrdi("2", "Samsung");

    }
}

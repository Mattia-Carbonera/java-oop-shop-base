package org.lessons.java.shop;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;

public class Prodotto {
    // * Attributi
    int code;
    String name;
    String description;
    double price;
    int iva;

    // * costruttore 
    public Prodotto( String name, String description, double price, int iva ){
        Random randomNumber = new Random();

        this.code = randomNumber.nextInt(9999);
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }

    // * Metodi
    // prezzo senza iva
    double priceWithoutIva() {
        return price;
    }

    // prezzo con iva
    double priceWithIva() {
        
        return Math.round(price + (price / 100 * iva));
    }

    // nome per esteso
    String extendedName() {
        return name + code;
    }

}

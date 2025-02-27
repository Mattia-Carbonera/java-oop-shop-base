package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    // * Attributi
    private int code;
    private String name;
    private String description;
    private double price;
    private static int iva = 22;

    // * costruttore 1
    public Prodotto( String name, String description, double price ){
        Random randomNumber = new Random();

        this.code = randomNumber.nextInt(9999);
        this.name = name;
        this.description = description;
        this.price = price;
    }

    // * costruttore 2
    public Prodotto(String name, double price) {
        Random randomNumber = new Random();
        this.code = randomNumber.nextInt(9999);

        this.name = name;
        description = "";
        this.price = price;

    }

    // * Metodi
    // codice
    public int getCode () {
        return code;
    }

    // nome
    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    // descrizione
    public String getDescription() {
        return description;
    }

    public void setDescription( String descriprion ) {
        this.description = descriprion;
    }

    // prezzo
    public double getPrice() {
        return price;
    }

    public void setPrice( double price ) {
        this.price = price;
    }

    // prezzo con iva
    public double getPriceWithIva() {
        return Math.round(price + (price / 100 * iva));
    }

    // nome per esteso
    public String getExtendedName() {
        return name + "-" + code;
    }

}

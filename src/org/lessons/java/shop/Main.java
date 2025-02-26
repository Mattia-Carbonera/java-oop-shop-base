package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto primoProdotto = new Prodotto("nome", "descrizione", 19.99, 22);

        System.out.println(primoProdotto.code);
        System.out.println(primoProdotto.name);
        System.out.println(primoProdotto.description);
        System.out.println(primoProdotto.price);
        System.out.println(primoProdotto.iva);

        System.out.println(primoProdotto.priceWithoutIva() + "€");
        System.out.println(primoProdotto.priceWithIva() + "€");
        System.out.println(primoProdotto.extendedName());


    }
}

package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto primoProdotto = new Prodotto("nome", "descrizione", 19.99);
        Prodotto secondoProdotto = new Prodotto("nomeDue", 14.99);

        System.out.println("Primo prodotto:");
        System.out.println(primoProdotto.getCode());
        System.out.println(primoProdotto.getName());
        System.out.println(primoProdotto.getPrice() + "€");
        System.out.println(primoProdotto.getPriceWithIva() + "€");
        System.out.println(primoProdotto.getExtendedName());

        System.out.println(" ");

        System.out.println("Secondo prodotto:");
        System.out.println(secondoProdotto.getCode());
        System.out.println(primoProdotto.getName());
        System.out.println(secondoProdotto.getPrice() + "€");
        System.out.println(secondoProdotto.getPriceWithIva() + "€");
        System.out.println(secondoProdotto.getExtendedName());

    }
}

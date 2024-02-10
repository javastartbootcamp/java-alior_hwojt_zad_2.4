package pl.javastart.task;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Category garden = new Category("ogród", "niezmiernie ciekawe akcesoia do uprawy i ochrony roślin");
        Category camping = new Category("relaks w ogrodzie", "najprzyjemniejszy relaks na świeżym powietrzu");

        Product hammock = new Product("hamak odrodowy ze stelażem", 1699,
                "na wypasie hamak odrodowy ze stelażem", camping);
        Product umbrella = new Product("parasol hawajski", 159,
                "na wypasie parasol hawajski", camping);
        Product sensor = new Product("czujnik wilgotności gleby", 39,
                "przydatny gadżet pozwala, na dokonanie pomieru", garden);
        Product bag = new Product("torba", 0.5, "aby zapakować zakupy", null);

        SpecialOffer specialOffer = new SpecialOffer(hammock, "posezonowa obniżka", 0.2, LocalDate.of(2024, 2, 2), LocalDate.of(2024, 2, 28));
        System.out.println("informacje o produktach:");
        System.out.println(hammock.toString());
        System.out.println(umbrella.toString());
        System.out.println(sensor.toString());
        System.out.println(bag.toString());
        System.out.println(specialOffer.description + ": " + specialOffer.product.productName + " " + (specialOffer.discount * 100)
                + " % taniej, obowiązuje od " + specialOffer.validityPeriodFrom + " do " + specialOffer.validityPeriodTo);

    }
}

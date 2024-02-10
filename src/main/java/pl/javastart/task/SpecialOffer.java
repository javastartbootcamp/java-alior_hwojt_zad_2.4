package pl.javastart.task;

import java.time.LocalDate;

public class SpecialOffer {
//    reprezentuje ofertę specjalną
    Product product;
    String description;
    double discount; /*od 0 do 1*/
    LocalDate validityPeriodFrom; /*data od*/
    LocalDate validityPeriodTo; /*data do*/

    public SpecialOffer(Product product, String description, double discount, LocalDate validityPeriodFrom, LocalDate validityPeriodTo) {
        this.product = product;
        this.description = description;
        this.discount = discount;
        this.validityPeriodFrom = validityPeriodFrom;
        this.validityPeriodTo = validityPeriodTo;
    }
}

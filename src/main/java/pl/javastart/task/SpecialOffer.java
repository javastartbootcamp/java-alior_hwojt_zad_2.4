package pl.javastart.task;

public class SpecialOffer {
//    reprezentuje ofertę specjalną
    Product product;
    String description;
    double discount; /*od 0 do 1*/
    String validityPeriodFrom; /*data od*/
    String validityPeriodTo; /*data do*/

    public SpecialOffer(Product product, String description, double discount, String validityPeriodFrom, String validityPeriodTo) {
        this.product = product;
        this.description = description;
        this.discount = discount;
        this.validityPeriodFrom = validityPeriodFrom;
        this.validityPeriodTo = validityPeriodTo;
    }
}

package pl.javastart.task;

import java.util.Objects;

public class Product {
    String productName;
    double productPrice;
    String productDescription;
    Category productCategory;

    public Product(String productName, double productPrice, String productDescription, Category productCategory) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
        this.productCategory = productCategory;
    }

    @Override
    public String toString() {
        return productName +
                ", cena: " + productPrice +
                ", opis: " + productDescription +
                ", kategoria: " + (Objects.nonNull(productCategory) ? productCategory.categoryName : "brak");
    }
}

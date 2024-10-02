package org.example;

public class Order {

    Buyer buyer;
    Product product;
    int count;

    public Order(Buyer buyer, Product product, int count) {
        this.buyer = buyer;
        this.product = product;
        this.count = count;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public int getCount() {
        return count;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "Заказ{" +
                "покупатель=" + buyer +
                ", продукт=" + product +
                ", количество=" + count +
                '}';
    }
}

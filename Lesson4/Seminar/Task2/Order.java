package Lesson4.Seminar.Task2;

import Lesson4.Seminar.Task2.Exception.TooMuchSaleException;

import java.util.Random;

public class Order {
    private Customer customer;
    private Product product;
    private Discount discount;
    private int amount;
    private float cost;
    public Order() {

    }

    public Order(Customer customer, Product product, int amount) {
        this.customer = customer;
        this.product = product;
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String toString(){
        return "[ Customer " + this.customer +
                ", Product " + this.product +
                ", Discount " + this.discount +
                ", Amount " + this.amount +
                ", Cost " + this.cost
                + "]";
    }

    public void assignDiscount(Product product) throws TooMuchSaleException {
        discount = Discount.randomDirection();
        float discountPrice;
        if (product.getCategory() == Category.VIP & discount.getNumVal() >= 0.15 ){
            throw new  TooMuchSaleException("Discount for VIP no more than 15% ");
        } else {
            discountPrice = product.getPrice() - (product.getPrice() * (discount.getNumVal()));
            setCost(discountPrice);
        }
    }
}

enum Discount {
    TWENTY(0.2f),
    FIFTEEN(0.15f),
    TEN(0.1f),
    FIVE(0.05f),
    ZERO(0f);
    private float numVal;
    private static final Random PRNG = new Random();

    Discount(float numVal) {
        this.numVal = numVal;
    }

    public float getNumVal() {
        return numVal;
    }

    public static Discount randomDirection() {
        Discount[] directions = values();
        return directions[PRNG.nextInt(directions.length)];
    }

}

package Lesson4.Seminar.Task2;

import Lesson4.Seminar.Task2.Exception.AmountException;
import Lesson4.Seminar.Task2.Exception.CustomerException;
import Lesson4.Seminar.Task2.Exception.ProductException;
import Lesson4.Seminar.Task2.Exception.TooMuchSaleException;

public class Shop {
    static Customer[] customers;
    static Product[] products;


    public static Order makePurchase(String phone, String title, int amount) throws CustomerException, ProductException, AmountException {
        Customer customer = null;
        Product product = null;
        for (Customer custom : customers) {
            if (custom.getPhone().equals(phone)) {
                customer = custom;
            }
        }

        for (Product prod : products) {
            if (prod.getTitle().equals(title)) {
                product = prod;
            }
        }
        if (customer == null) {
            throw new CustomerException("Customer not found");
        }
        if (product == null) {
            throw new ProductException("Product not found");
        }
        if (amount > 100 | amount < 1) {
            throw new AmountException("Product is not corrected");
        }

        return new Order(customer, product, amount);
    }

    public static void main(String[] args) throws TooMuchSaleException {
        Order order = new Order();
        customers = new Customer[]{
                new Customer("Ivan", "Semenov", 25, "89005556677", Gender.MEN),
                new Customer("Eva", "Kolosova", 30, "89705556677", Gender.WOMAN)
        };


        products = new Product[]{
                new Product("Milk", 50f, Category.DEFAULT),
                new Product("Bread", 50f, Category.VIP),
                new Product("Meat", 50f, Category.DEFAULT),
                new Product("Chocolate", 50f, Category.VIP),
                new Product("Tea", 50f, Category.DEFAULT),
        };

        Order[] orders = new Order[5];

        String[] phones = {"89005556677", "89705556677", "89705556677", "89005556677", "89005556677"};
        String[] productTitles = {"Milk", "Bread", "Water", "Chocolate", "Tea"};
        int[] amounts = {4, 5, 101, 0, -1};
        int count = 0;

        for (int i = 0; i <= 4; i++) {
            try {
                orders[i] = makePurchase(phones[i], productTitles[i], amounts[i]);
            } catch (ProductException e) {
                System.out.println(e.getMessage());
            } catch (AmountException e) {
                orders[i] = makePurchase(phones[i], productTitles[i], 1);
                System.out.println(e.getMessage());
            } catch (CustomerException e) {
                System.out.println(e.getMessage());
            }
        }

        for (Order ord : orders) {
            if (ord != null) {
                count++;
            }
        }
        System.out.println("Count Order - " + count);
        System.out.println("-----------------------------------------");
        System.out.println("Discount");

        for (Order or : orders) {
            if (or != null){
                try {
                    or.assignDiscount(or.getProduct());
                    System.out.println(or);
                } catch (TooMuchSaleException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}

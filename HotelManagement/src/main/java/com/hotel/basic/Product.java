package com.hotel.basic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Product {
    public Product(String name, int id) {
        this.name = name;
        this.id = id;
    }

    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        Product anotherProduct = (Product) obj;
        return anotherProduct.getId() == (this.getId()) && anotherProduct.getName().equals(this.getName());
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        Set<Product> products = new HashSet<>();
        products.add(new Product("Sony", 2));
        products.add(new Product("Sony", 1));
        products.add(new Product("Sony Watch", 1));

       /* for (Product product : products) {
            System.out.println(product.getId() +  "-->" +product.getName());
        }*/


        Map<Product, Integer> productMap = new HashMap<>();
        productMap.put(new Product("Sony", 2), 10000);
        productMap.put(new Product("Sony", 1), 20000);
        productMap.put(new Product("Sony", 1), 30000);

        for (Map.Entry<Product, Integer> entry : productMap.entrySet()) {
            Product key = entry.getKey();
            Integer value = entry.getValue();


            System.out.println(key + "-->" + value);

        }



    }
}

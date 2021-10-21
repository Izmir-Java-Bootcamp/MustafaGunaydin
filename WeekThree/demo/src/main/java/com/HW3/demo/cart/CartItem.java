package com.HW3.demo.cart;
import com.HW3.demo.product.Product;
import lombok.Data;

@Data
public class CartItem {
    private Product product;
    private int quantity;

    public double getPrice() {
        return product.getPrice() * quantity;
    }
}

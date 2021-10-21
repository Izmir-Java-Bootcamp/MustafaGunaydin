package com.HW3.demo.cart;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<CartItem> cartItems;

    public Cart(){
        this.cartItems = new ArrayList<>();
    }

    public void addCartItem(CartItem cartItem){
        cartItems.add(cartItem);
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public double getTotal(){
        return cartItems.stream()
                .map(CartItem::getPrice)
                .mapToDouble(price -> price)
                .sum();
    }
}

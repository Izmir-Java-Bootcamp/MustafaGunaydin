package com.HW3.demo.service.discount;

import com.HW3.demo.cart.Cart;
import com.HW3.demo.cart.CartItem;
import org.springframework.stereotype.Service;

@Service
public interface Discount {
    boolean isAcceptable(Cart cart);
    double applyDiscount(CartItem carItem);
}
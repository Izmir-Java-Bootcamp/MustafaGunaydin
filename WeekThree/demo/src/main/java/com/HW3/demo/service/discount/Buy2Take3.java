package com.HW3.demo.service.discount;

import com.HW3.demo.cart.Cart;
import com.HW3.demo.cart.CartItem;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.LOWEST_PRECEDENCE)
public class Buy2Take3 implements Discount {

    @Override
    public double applyDiscount(CartItem cartItem){
        int discountQuantity = cartItem.getQuantity()/3;
        int paidQuantity = cartItem.getQuantity()-discountQuantity;
        return paidQuantity*cartItem.getProduct().getPrice();
    }


    @Override
    public boolean isAcceptable(Cart cart){
        int value = cart.getCartItems().stream()
                .map(CartItem::getQuantity)
                .max(Integer::compare).get();
        return value > 2;
    }
}

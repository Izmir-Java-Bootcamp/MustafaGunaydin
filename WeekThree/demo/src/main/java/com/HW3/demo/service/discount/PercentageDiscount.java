package com.HW3.demo.service.discount;

import com.HW3.demo.cart.Cart;
import com.HW3.demo.cart.CartItem;
import com.HW3.demo.properties.DiscountProperties;
import com.HW3.demo.service.discount.Discount;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class PercentageDiscount implements Discount {
    private DiscountProperties discountProperties;

    @Override
    public double applyDiscount(CartItem cartItem){
        double price = cartItem.getProduct().getPrice()*cartItem.getQuantity();
        double appliedDiscount = price * discountProperties.getPercetange();
        return price - appliedDiscount;
    }

    @Override
    public boolean isAcceptable(Cart cart){
        double totalPrice = cart.getCartItems().stream()
                .map(CartItem::getPrice).mapToDouble(d->d).sum();
    return totalPrice >=1000;
    }


}

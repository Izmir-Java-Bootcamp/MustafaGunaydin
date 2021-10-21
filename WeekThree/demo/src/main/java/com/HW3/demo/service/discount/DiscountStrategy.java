package com.HW3.demo.service.discount;

import com.HW3.demo.cart.Cart;
import com.HW3.demo.cart.CartItem;
import com.HW3.demo.service.discount.Discount;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Stream;

@RequiredArgsConstructor
@Service
public class DiscountStrategy {
    private final List<Discount> discounts;

    public double discount(Cart cart, CartItem cartItem){
        double price=0;
        Stream<Discount> discountStream = discounts.stream()
                .filter(discount -> discount.isAcceptable(cart));
        return discountStream.findFirst().get().applyDiscount(cartItem);
    }
}

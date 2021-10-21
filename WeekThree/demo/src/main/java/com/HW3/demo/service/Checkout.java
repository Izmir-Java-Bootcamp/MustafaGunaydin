package com.HW3.demo.service;

import com.HW3.demo.cart.Cart;
import com.HW3.demo.cart.CartItem;
import com.HW3.demo.checkout.Bill;
import com.HW3.demo.checkout.BillItem;
import com.HW3.demo.service.discount.DiscountStrategy;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Data
@ConfigurationProperties(prefix = "discount")
public class Checkout {
    private int deliveryFee;
    private int deliveryFeeLimit;
    private final DiscountStrategy discountStrategy;

    public Bill checkout(Cart cart){
        List<BillItem> billItems = cart.getCartItems().stream().map(cartItem -> BillItem.builder()
                .productName(cartItem.getProduct().getName())
                .quantity(cartItem.getQuantity())
                .price(cartItem.getPrice())
                .description(cartItem.getProduct().getDescription())
                .discountedPrice(discountStrategy.discount(cart,cartItem)).build())
                .collect(Collectors.toList());

        double totalSum = billItems.stream()
                .map(BillItem::getDiscountedPrice)
                .mapToDouble(d -> d)
                .sum();

        if(totalSum==0){
            totalSum= cart.getTotal();
        }

        if(totalSum<deliveryFeeLimit){
            totalSum=totalSum+deliveryFee;
        }

        return Bill.builder().billItems(billItems).totalPrice(totalSum).build();
    }

}

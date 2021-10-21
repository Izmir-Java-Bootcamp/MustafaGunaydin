package com.HW3.demo.checkout;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class BillItem {
    private String productName;
    private double price;
    private double discountedPrice;
    private int quantity;
    private String description;


}

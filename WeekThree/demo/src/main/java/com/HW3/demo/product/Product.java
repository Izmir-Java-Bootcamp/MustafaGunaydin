package com.HW3.demo.product;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {
        private String name;
        private String description;
        private double price;
}

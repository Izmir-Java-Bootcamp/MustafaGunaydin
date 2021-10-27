package com.kodluyoruz.weekfour.model.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CheckoutDto {
    private int checkout_id;
    private String checkout_name;
    private double checkout_price;

}
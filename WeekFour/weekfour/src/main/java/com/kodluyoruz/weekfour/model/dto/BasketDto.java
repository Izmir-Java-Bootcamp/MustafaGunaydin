package com.kodluyoruz.weekfour.model.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BasketDto {
    private int basket_id;
    private double basket_price;
    private double basket_quantity;
}
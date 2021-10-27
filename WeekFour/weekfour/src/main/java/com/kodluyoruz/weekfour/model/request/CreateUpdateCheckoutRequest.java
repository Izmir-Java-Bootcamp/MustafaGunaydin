package com.kodluyoruz.weekfour.model.request;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.Min;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CreateUpdateCheckoutRequest {
    @Min(value = 0,message = "price 0 olamaz")
    private Double price;
}
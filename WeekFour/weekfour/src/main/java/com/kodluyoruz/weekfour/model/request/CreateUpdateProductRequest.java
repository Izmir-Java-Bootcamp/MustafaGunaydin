package com.kodluyoruz.weekfour.model.request;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CreateUpdateProductRequest {
    @NotBlank(message = "name boş olamaz")
    private String name;
    @NotBlank(message = "description boş olamaz")
    private String description;
    @Min(value = 0,message = "price 0 olamaz")
    private Double price;
    private Integer categoryId;
}

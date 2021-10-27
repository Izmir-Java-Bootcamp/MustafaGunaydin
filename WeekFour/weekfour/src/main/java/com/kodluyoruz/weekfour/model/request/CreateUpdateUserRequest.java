package com.kodluyoruz.weekfour.model.request;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CreateUpdateUserRequest {
    @NotBlank(message = "name boş olamaz")
    private String name;

}
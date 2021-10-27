package com.kodluyoruz.weekfour.model.mapper;
import com.kodluyoruz.weekfour.model.dto.CheckoutDto;
import com.kodluyoruz.weekfour.model.entity.Checkout;
import com.kodluyoruz.weekfour.model.request.CreateUpdateCheckoutRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper(componentModel = "spring")
public interface CheckoutMapper {
    CheckoutMapper CHECKOUT_MAPPER = Mappers.getMapper(CheckoutMapper.class);

    CheckoutDto toCheckoutDto(Checkout checkout);

    List<CheckoutDto> toCheckoutDtoList(List<Checkout> checkouts);

    Checkout createCheckout(CreateUpdateCheckoutRequest request);

    void updateCheckout(@MappingTarget Checkout checkout, CreateUpdateCheckoutRequest request);
}
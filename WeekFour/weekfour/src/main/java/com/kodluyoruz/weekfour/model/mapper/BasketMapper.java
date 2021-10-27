package com.kodluyoruz.weekfour.model.mapper;
import com.kodluyoruz.weekfour.model.dto.BasketDto;
import com.kodluyoruz.weekfour.model.entity.Basket;
import com.kodluyoruz.weekfour.model.request.CreateUpdateBasketRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper(componentModel = "spring")
public interface BasketMapper {
    BasketMapper BASKET_MAPPER = Mappers.getMapper(BasketMapper.class);

    BasketDto toBasketDto(Basket basket);

    List<BasketDto> toBasketDtoList(List<Basket> baskets);

    Basket createBasket(CreateUpdateBasketRequest request);

    void updateBasket(@MappingTarget Basket basket, CreateUpdateBasketRequest request);
}
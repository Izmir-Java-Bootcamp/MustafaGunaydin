package com.kodluyoruz.weekfour.model.mapper;
import com.kodluyoruz.weekfour.model.dto.OrderDto;
import com.kodluyoruz.weekfour.model.entity.Order;
import com.kodluyoruz.weekfour.model.request.CreateUpdateOrderRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderMapper ORDER_MAPPER = Mappers.getMapper(OrderMapper.class);

    OrderDto toOrderDto(Order order);

    List<OrderDto> toOrderDtoList(List<Order> orders);

    Order createOrder(CreateUpdateOrderRequest request);

    void updateOrder(@MappingTarget Order Order, CreateUpdateOrderRequest request);
}

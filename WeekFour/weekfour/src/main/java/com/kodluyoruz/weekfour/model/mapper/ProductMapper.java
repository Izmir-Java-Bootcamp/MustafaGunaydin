package com.kodluyoruz.weekfour.model.mapper;
import com.kodluyoruz.weekfour.model.dto.ProductDto;
import com.kodluyoruz.weekfour.model.entity.Product;
import com.kodluyoruz.weekfour.model.request.CreateUpdateProductRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductMapper PRODUCT_MAPPER = Mappers.getMapper(ProductMapper.class);

    ProductDto toProductDto(Product product);

    List<ProductDto> toProductDtoList(List<Product> products);

    Product createProduct(CreateUpdateProductRequest request);

    void updateProduct(@MappingTarget Product product, CreateUpdateProductRequest request);
}

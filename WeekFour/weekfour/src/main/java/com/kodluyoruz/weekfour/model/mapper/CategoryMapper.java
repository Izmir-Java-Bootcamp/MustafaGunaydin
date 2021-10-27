package com.kodluyoruz.weekfour.model.mapper;

import com.kodluyoruz.weekfour.model.dto.CategoryDto;
import com.kodluyoruz.weekfour.model.entity.Category;
import com.kodluyoruz.weekfour.model.request.CreateUpdateCategoryRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryMapper CATEGORY_MAPPER = Mappers.getMapper(CategoryMapper.class);

    CategoryDto toCategoryDto(Category category);

    List<CategoryDto> toCategoryDtoList(List<Category> category);

    Category createCategory(CreateUpdateCategoryRequest request);

}

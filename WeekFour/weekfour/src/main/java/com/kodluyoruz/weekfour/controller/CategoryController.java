package com.kodluyoruz.weekfour.controller;
import com.kodluyoruz.weekfour.model.dto.CategoryDto;
import com.kodluyoruz.weekfour.model.dto.ProductDto;
import com.kodluyoruz.weekfour.model.request.CreateUpdateCategoryRequest;
import com.kodluyoruz.weekfour.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("categories")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService service;

    @PostMapping
    public CategoryDto createCategory(@RequestBody CreateUpdateCategoryRequest request){
        return service.createCategory(request);
    }

    @GetMapping
    public List<CategoryDto> getCategories(){
        return service.getCategories();
    }

    @GetMapping("{id}/parent")
    public CategoryDto getParentCategory(@PathVariable int id){
        return service.getParentCategory(id);
    }

    @GetMapping("{id}/sub")
    public List<CategoryDto> getSubCategory(@PathVariable int id){
        return service.getSubCategory(id);
    }

    @GetMapping("{id}/products")
    public List<ProductDto> getCategoryProducts(@PathVariable int id) {
        return service.getCategoryProducts(id);
    }
}

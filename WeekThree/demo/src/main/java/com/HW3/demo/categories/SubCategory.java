package com.HW3.demo.categories;

import com.HW3.demo.product.Product;
import java.util.ArrayList;
import java.util.List;

public class SubCategory extends MainCategory{
    private String subCategoryName;
    private List<Product> productList;

    public SubCategory(String mainCategoryName, String subCategoryName) {
        super(mainCategoryName);
        this.subCategoryName = subCategoryName;
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public List<Product> getProductList(){
        return productList;
    }

    public String getSubCategoryName() {
        return subCategoryName;
    }
}

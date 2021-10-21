package com.HW3.demo.categories;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class MainCategory {
    private String mainName;
    private List<SubCategory> subCategoryList=new ArrayList<>();

    public MainCategory(String mainName) {
        this.mainName = mainName;
    }

}

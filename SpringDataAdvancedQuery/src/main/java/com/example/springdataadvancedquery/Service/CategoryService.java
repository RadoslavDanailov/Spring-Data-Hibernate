package com.example.springdataadvancedquery.Service;


import com.example.springdataadvancedquery.entity.Category;

import java.io.IOException;
import java.util.Set;

public interface CategoryService {
    void seedCategories() throws IOException;

    Set<Category> getRandomCategories();
}

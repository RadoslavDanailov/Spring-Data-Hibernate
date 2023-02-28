package com.example.springjsonex.services;

import com.example.springjsonex.entities.categories.CategoryStatsDTO;
import com.example.springjsonex.entities.products.ProductWithoutBuyerDTO;

import java.util.List;

public interface ProductsService {
    List<ProductWithoutBuyerDTO> getProductsInPriceRangeForSell(
            float from, float to);

    List<CategoryStatsDTO> getCategoryStatistics();
}

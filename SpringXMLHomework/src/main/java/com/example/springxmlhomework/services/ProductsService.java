package com.example.springxmlhomework.services;

import com.example.springxmlhomework.entities.products.ExportProductsInRangeDto;

import java.util.List;

public interface ProductsService {
    ExportProductsInRangeDto getInRange(float from, float to);
}

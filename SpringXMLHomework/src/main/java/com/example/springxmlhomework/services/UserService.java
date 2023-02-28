package com.example.springxmlhomework.services;


import com.example.springxmlhomework.entities.users.ExportSellersDTO;
import com.example.springxmlhomework.entities.users.ExportSellersWithCountsDTO;

import java.util.List;

public interface UserService {

    ExportSellersDTO findAllWithSoldProducts();

    ExportSellersWithCountsDTO findAllWithSoldProductsAndCounts();
}
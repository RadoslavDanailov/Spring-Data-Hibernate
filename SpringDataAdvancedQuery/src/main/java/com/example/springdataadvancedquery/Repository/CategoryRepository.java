package com.example.springdataadvancedquery.Repository;

import com.example.springdataadvancedquery.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

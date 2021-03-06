package com.shopmanagement.shopmanagement.dao;

import com.shopmanagement.shopmanagement.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoryRepo extends JpaRepository<Category, UUID> {

}

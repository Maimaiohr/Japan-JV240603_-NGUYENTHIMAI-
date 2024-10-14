package com.ra.model.service.category;

import com.ra.model.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    List<Category> findAll();
    boolean create(Category category);
    Category findById(int id);
    boolean update(Category category);
    void delete(int id);
}

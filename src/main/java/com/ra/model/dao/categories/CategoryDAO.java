package com.ra.model.dao.categories;

import com.ra.model.entity.Category;

import java.util.List;
import java.util.Locale;

public interface CategoryDAO{
    List<Category> findAll();
    boolean create(Category category);
    Category findById(int id);
    boolean update(Category category);
    void delete(int id);
}

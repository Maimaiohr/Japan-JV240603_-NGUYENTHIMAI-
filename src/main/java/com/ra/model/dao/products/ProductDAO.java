package com.ra.model.dao.products;

import com.ra.model.entity.Product;

import java.util.List;

public interface ProductDAO {
    List<Product> findAll();
    boolean create(Product product);
    Product findById(int id);
    boolean update(Product product);
    void delete(int id);
}

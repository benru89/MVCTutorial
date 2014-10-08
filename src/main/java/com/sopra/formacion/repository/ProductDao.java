package com.sopra.formacion.repository;

import java.util.List;

import com.sopra.formacion.domain.Product;

public interface ProductDao {

    public List<Product> getProductList();

    public void saveProduct(Product prod);

}
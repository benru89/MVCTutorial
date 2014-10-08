package com.sopra.formacion.service;

import java.io.Serializable;
import java.util.List;

import com.sopra.formacion.domain.Product;

public interface ProductManager extends Serializable {

    public void increasePrice(int percentage);
    
    public List<Product> getProducts();

}
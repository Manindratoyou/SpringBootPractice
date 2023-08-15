package com.manindra.SpringBootPracticeGithub.service;

import com.manindra.SpringBootPracticeGithub.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {

    public Integer saveProduct(Product p);
    public void updateProduct(Product p);
    public void deleteProduct(Integer id);
    public Optional<Product> getOneProduct(Integer id);
    public List<Product> getAllProduct();
    public boolean isProductExists(Integer id);

}

package com.manindra.SpringBootPracticeGithub.repository;

import com.manindra.SpringBootPracticeGithub.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Integer> {

}

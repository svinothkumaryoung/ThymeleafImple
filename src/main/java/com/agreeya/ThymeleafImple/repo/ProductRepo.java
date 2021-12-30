package com.agreeya.ThymeleafImple.repo;

import com.agreeya.ThymeleafImple.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
}

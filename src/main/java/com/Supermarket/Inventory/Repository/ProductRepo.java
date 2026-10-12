package com.Supermarket.Inventory.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Supermarket.Inventory.Entity.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}

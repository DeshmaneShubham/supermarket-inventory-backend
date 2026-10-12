package com.Supermarket.Inventory.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Supermarket.Inventory.Entity.Product;
import com.Supermarket.Inventory.Repository.ProductRepo;

@Service
public class ProductService {
	@Autowired
	private ProductRepo productRepo;
	
	public Product saveProduct(Product product) {
		return productRepo.save(product);
	}
	
	public List<Product> allProducts(){
		return productRepo.findAll();
	}
	
	public Optional<Product> getproductbyId(Long id) {
		return productRepo.findById(id);
	}
	
	public Product updateProduct(Long id, Product pr) {
		pr.setId(id);
		return productRepo.save(pr);
		
	}
	public String deleteProduct(Long id){
		productRepo.deleteById(id);
		return "Product deleted successfully!";
	}
}

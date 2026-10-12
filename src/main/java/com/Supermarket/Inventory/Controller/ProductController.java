package com.Supermarket.Inventory.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Supermarket.Inventory.Entity.Product;
import com.Supermarket.Inventory.Service.ProductService;

@CrossOrigin(origins = "*")
@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

  
	@PostMapping("/saveProduct")
		public Product productSave(@RequestBody Product pr) {
			return productService.saveProduct(pr); 
		}
	@GetMapping("/allProducts")
		public List<Product> getAllProducts(){
		return productService.allProducts();
	}
	@GetMapping("/product/{id}")
	public Optional<Product> getbyid(@PathVariable Long id){
		return productService.getproductbyId(id); 
	}
	
	@PutMapping("/update/{id}")
	public Product updatedPr(@PathVariable Long id,@RequestBody Product pr) {
		return productService.updateProduct(id, pr);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deletepr(@PathVariable Long id) {
		return productService.deleteProduct(id);
	}
	
	}
	


package io.altar.jeeproject.service;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import io.altar.jeeproject.model.Product;
import io.altar.jeeproject.repository.ProductRepository;

@Named("productService")
@RequestScoped
public class ProductService {

	private ProductRepository productRepository = ProductRepository.getInstance();
	
	public void addProduct(Product product){
		productRepository.addToList(product);
	}
	
	
	public ProductRepository getProductRepository(){
		
		return productRepository;
	}
}

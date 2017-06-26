package io.altar.jeeproject.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import io.altar.jeeproject.model.Product;
import io.altar.jeeproject.repository.ProductRepository;

@Named("productService")
@ApplicationScoped
public class ProductService {

	private ProductRepository productRepository = ProductRepository.getInstance();
	
	public void addProduct(Product product){
		productRepository.addToList(product);
	}
	
	
	public void  getProductRepository(){
		
		List<String> productRepository =  new ArrayList<>();
				
		productRepository = ProductRepository.getInstance();
		
		
	}
}

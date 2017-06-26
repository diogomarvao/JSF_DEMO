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

	private ProductRepository productList = ProductRepository.getInstance();
	
	public void addProduct(Product product){
		productList.addToList(product);
	}
	
	
	public 
}

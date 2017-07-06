package io.altar.jeeproject.service;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import io.altar.jeeproject.model.Product;
import io.altar.jeeproject.repository.ProductRepository;

@Named("productService")
@RequestScoped
public class ProductService extends EntityService<Product>{

	private ProductRepository productRepository = new ProductRepository();
	
	public List<Product> showEntities(ProductRepository productList){
		List<Product> list = productList.getDbProduct();
		return list;
	}
	
	public void addProduct(Product product){
		productRepository.addToDb(product);
	}
	
	
	public ProductRepository getProductRepository(){
		
		return productRepository;
	}
	
	public void editProduct(Product product){
		
			productRepository.alterInDb(product);
	}
	
	
}
package io.altar.jeeproject.service;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.jeeproject.model.Product;
import io.altar.jeeproject.repository.ProductRepository;

@Named("productService")
@RequestScoped
public class ProductService extends EntityService<Product>{

	@Inject
	private ProductRepository productRepository;
	
	public List<Product> showEntities(ProductRepository productRepository){
		List<Product> list = productRepository.getDbProduct();
		return list;
	}
	
	public void addProduct(Product product){
		productRepository.addToDb(product);
	}
	
	public void editProduct(Product product){
			productRepository.alterInDb(product);
	}
	
	
	//getter productRepository
	public ProductRepository getProductRepository(){	
		return productRepository;
	}
	
}
package io.altar.jeeproject.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.jeeproject.model.Product;


@Named("productview")
@SessionScoped

public class ProductView implements Serializable{
	

	private Product product;
	
	private List <Product> products = new ArrayList<>();

	public String addProd(){
		products.add(product);
		
		return null;
	}
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
			
	
	
}

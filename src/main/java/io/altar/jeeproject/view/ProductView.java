package io.altar.jeeproject.view;

import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedProperty;
import javax.inject.Named;

import io.altar.jeeproject.model.Product;


@Named("productView")
@SessionScoped

public class ProductView implements Serializable{
	
	private List<Product> products;
	
	@ManagedProperty(value="#{productChar}")
	
	private Productservice productService
	
	
	

	
}

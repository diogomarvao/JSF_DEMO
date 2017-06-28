package io.altar.jeeproject.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.jeeproject.model.Product;
import io.altar.jeeproject.service.ProductService; 


@Named("productView")
@RequestScoped

public class ProductView implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Product activeProduct;
	
	
	
	public void setActiveProduct(Product activeProduct) {
		this.activeProduct = activeProduct;
	}


	public Product getActiveProduct() {
		return activeProduct;
	}

	@Inject
	private ProductService productService;
	
	Product product = new Product();
	
	
//	Adicionar productos
	
	
	public String addProd(){
		productService.addProduct(product);
		return null;
	}
	
	
//	Produtos na tabela
	

	public List<Product> getProductList(){
		return new ArrayList<Product> ((Collection<Product>)productService.getProductRepository().values());
	}
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}		
	
	
//	editar produtos
	
	public String editProduct(Product product){
		
			productService.editProduct(product);
		
		return null;
	}
	
//	eliminar produtos
	
	public String delProduct(Product product){
			productService.delEntity(productService.getProductRepository(), product);
		return null;
	}
	
}

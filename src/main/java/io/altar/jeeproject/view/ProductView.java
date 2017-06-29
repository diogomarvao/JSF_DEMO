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
	private Product activeProduct = new Product();
	

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
	
	
	public void addProd(){
		productService.addProduct(product);
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
	
	public void editProduct(){
//			setActiveProduct(product);
			productService.editProduct(activeProduct);

	}
	
//	eliminar produtos
	
	public void delProduct(Product product){
			productService.delEntity(productService.getProductRepository(), product);

	}
//	
//	passar elementos do produto activo
	public void passActiveProduct(Product product){


	}
}

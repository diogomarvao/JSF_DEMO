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
	
	private static final long serialVersionUID = 1L;
	
	ArrayList<Integer> pratIdLoc;
	double desconto;
	int iva;
	double pvp;
	
	@Inject
	private Product product;
	
	private static List <Product> products = new ArrayList<>();
	
	static{
		products.add(new Product());
	}

	public String addProd(){
		Product product = new Product();
		product.addProd(this.pratIdLoc,this.desconto,this.iva,this.pvp);
		products.add(product);
		return null;
	}
	
	private void clear(){
		product = new Product();
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

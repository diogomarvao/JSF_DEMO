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
	
//	public Integer getPratIdLoc() {
//		return pratIdLoc;
//	}
//
//	public void setPratIdLoc( Integer pratIdLoc) {
//		this.pratIdLoc = pratIdLoc;
//	}
//
//	public double getDesconto() {
//		return desconto;
//	}
//
//	public void setDesconto(double desconto) {
//		this.desconto = desconto;
//	}
//
//	public int getIva() {
//		return iva;
//	}
//
//	public void setIva(int iva) {
//		this.iva = iva;
//	}
//
//	public double getPvp() {
//		return pvp;
//	}
//
//	public void setPvp(double pvp) {
//		this.pvp = pvp;
//	}
//
//	Integer pratIdLoc;
//	double desconto;
//	int iva;
//	double pvp;
	
	@Inject
	private ProductService productService;
	
//	private static List <Product> products = new ArrayList<>();
	
//	static{
//		products.add(new Product());
//	}
	Product product = new Product();
	
	
//	Adicionar productos
	
	
	public String addProd(){
		productService.addProduct(product);
//		product.addProd(this.pratIdLoc,this.desconto,this.iva,this.pvp);
//		products.add(product);
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
//
//	public List<Product> getProducts() {
//		return products;
//	}
//
//	public void setProducts(List<Product> products) {
//		this.products = products;
//	}
//	
//			
	
	
}

package io.altar.jeeproject.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.jeeproject.model.Product;
import io.altar.jeeproject.repository.ProductRepository;


public class ProductRepository extends EntityRepository<Product>{

private static final ProductRepository INSTANCE = new ProductRepository();
	
	private ProductRepository(){}
	
	public static ProductRepository getInstance(){
		return INSTANCE;
	}
	
	
//	editar valores
	
	public void alterProdElement(Integer id, Integer pratIdLoc, double desconto, int iva, double pvp) {
		((Product) get(id)).setPratIdLoc(pratIdLoc);
		((Product) get(id)).setDesconto(desconto);
		((Product) get(id)).setIva(iva);
		((Product) get(id)).setPvp(pvp);
	}	
	

}

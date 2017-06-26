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
	
//	public void alterProdElement(int id, Integer pratIdLoc, double desconto, int iva, double pvp) {
//		((Product) get(id)).setPratIdLoc(pratIdLoc);
//		((Product) get(id)).setDesconto(desconto);
//		((Product) get(id)).setIva(iva);
//		((Product) get(id)).setPvp(pvp);
//	}	
	
	
//Print valores da tabela do prod (chamado na TextInterface.java)
//	public static void valProduct(){
//
//		for (Integer id : getInstance().keySet()) {
//			 
//		int prat=0;
//		
//		Product p = (Product)ProductRepository.getInstance().get(id);
//		double desconto = p.getDesconto();
//		int iva = p.getIva();
//		double pvp = p.getPvp();
//		
//		
//		}
//		
//	}
}

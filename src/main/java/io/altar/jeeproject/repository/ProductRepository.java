package io.altar.jeeproject.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.Query;
import javax.transaction.Transactional;

import io.altar.jeeproject.model.Product;
import io.altar.jeeproject.repository.ProductRepository;

@Named("productRepository")
@ApplicationScoped
public class ProductRepository extends EntityRepository<Product>{

	public List<Product> getDbProduct() {
		Query query = getDb().createQuery("FROM Product");
		List<Product> dbElements = (List<Product>) query.getResultList();
		return dbElements;
	}
	
	@Override
	@Transactional
	public void removeFromDb(Product product){
		Product activeProduct = getDb().find(Product.class, product.getId());
		getDb().remove(activeProduct);
	}

}

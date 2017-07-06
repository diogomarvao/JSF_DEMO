package io.altar.jeeproject.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.Query;
import javax.transaction.Transactional;

import io.altar.jeeproject.model.Product;
import io.altar.jeeproject.model.Shelf;

@Named("shelfRepository")
@ApplicationScoped
public class ShelfRepository extends EntityRepository <Shelf>{

	public List<Shelf> getDbShelf() {
		Query query = getDb().createQuery("FROM Shelf");
		List<Shelf> dbElements = (List<Shelf>) query.getResultList();
		return dbElements;
	}
	
	@Override
	@Transactional
	public void removeFromDb(Shelf shelf){
		Shelf activeShelf = getDb().find(Shelf.class, shelf.getId());
		getDb().remove(activeShelf);
	}
	
//	private static final ShelfRepository INSTANCE = new ShelfRepository();
////	
//	private ShelfRepository(){}
//	
//	public static ShelfRepository getInstance(){
//		return INSTANCE;
//	}
//
//	
//	
////substituir ou adicionar as caraterisiticas no Linked hash map 
//	
//		public void alterShelfElement(int id,int codigo, int capacidade, Integer produto, double preco) {
//			((Shelf) get(id)).setCod(codigo);
//			((Shelf) get(id)).setCap(capacidade);
//			((Shelf) get(id)).setProd(produto);
//			((Shelf) get(id)).setPreco(preco);
//		}


}
		

		


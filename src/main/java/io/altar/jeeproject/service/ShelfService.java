package io.altar.jeeproject.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.jeeproject.model.Product;
import io.altar.jeeproject.model.Shelf;
import io.altar.jeeproject.repository.EntityRepository;
import io.altar.jeeproject.repository.ProductRepository;
import io.altar.jeeproject.repository.ShelfRepository;

@Named("shelfService")
@RequestScoped
public class ShelfService extends EntityService<Shelf> {
	
	@Inject
	private ShelfRepository shelfRepository;
	
	public List<Shelf> showEntities(ShelfRepository shelfRepository){
		List<Shelf> list = shelfRepository.getDbShelf();
		return list;
	}
	
	public void addShelf(Shelf shelf){
		shelfRepository.addToDb(shelf);
	}

	public void editShelf(Shelf shelf){
		shelfRepository.alterInDb(shelf);
	}
	
	//getter shelfRepository
	public ShelfRepository getShelfRepository(){
		return shelfRepository;
	}
	
}

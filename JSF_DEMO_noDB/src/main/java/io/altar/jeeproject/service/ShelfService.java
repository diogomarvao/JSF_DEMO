package io.altar.jeeproject.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import io.altar.jeeproject.model.Product;
import io.altar.jeeproject.model.Shelf;
import io.altar.jeeproject.repository.ShelfRepository;

@Named("shelfService")
@RequestScoped
public class ShelfService extends EntityService<Shelf> {
	
	private ShelfRepository shelfRepository = ShelfRepository.getInstance();

	
	public void addShelf(Shelf shelf){
		shelfRepository.addToList(shelf);
	}
	
	public ShelfRepository getShelfRepository(){
		return shelfRepository;
	}
	
	public void editShelf(Shelf shelf){
		
		shelfRepository.alterShelfElement(shelf.getId(), shelf.getCod(), shelf.getCap(), shelf.getProd(), shelf.getPreco());
	}
}

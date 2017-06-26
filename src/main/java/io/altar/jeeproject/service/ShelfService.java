package io.altar.jeeproject.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import io.altar.jeeproject.model.Product;
import io.altar.jeeproject.model.Shelf;
import io.altar.jeeproject.repository.ShelfRepository;

@Named("shelfService")
@ApplicationScoped
public class ShelfService {
	
	private ShelfRepository shelfList = ShelfRepository.getInstance();

	
	public void addShelf(Shelf shelf){
		shelfList.addToList(shelf);
	}
}

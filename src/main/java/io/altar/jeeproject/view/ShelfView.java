package io.altar.jeeproject.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.jeeproject.model.Product;
import io.altar.jeeproject.model.Shelf;
import io.altar.jeeproject.service.ShelfService;


@Named("shelfView")
@RequestScoped

public class ShelfView implements Serializable{
		
	private static final long serialVersionUID = 1L;
	
	
	@Inject
	private ShelfService shelfService;
	
	
	Shelf shelf = new Shelf();
	
	
//	adicionar shelfs
	
	public String addShelf(){
		shelfService.addShelf(shelf);
		return null;
	}
	
// imprimir shelf

	public List<Shelf> getShelfList() {
		return new ArrayList<Shelf> ((Collection<Shelf>)shelfService.getShelfRepository().values());
	}

	public Shelf getShelf() {
		return shelf;
	}

	public void setShelf(Shelf shelf) {
		this.shelf = shelf;
	}


		
}

	
	


package io.altar.jeeproject.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.jeeproject.model.Product;
import io.altar.jeeproject.model.Shelf;


@Named("shelfview")
@SessionScoped

public class ShelfView implements Serializable{
		
	private static final long serialVersionUID = 1L;
	
	@Inject
	private Shelf shelf;
	
	private int codigo;
	private int capacidade;
	private Integer produto;
	private double preco;
	
	private static List <Shelf> shelfs = new ArrayList<>();
	
	static{
		shelfs.add(new Shelf());
	}
	
	
	public String addShelf(){
		Shelf shelf = new Shelf();
		shelf.addShelf(this.codigo, this.capacidade, this.produto, this.preco);
		shelfs.add(shelf);
		return null;
	}
	
	private void clear(){
		shelf = new Shelf();
	}
	
	public Shelf getShelf() {
		return shelf;
	}

	public void setShelf(Shelf shelf) {
		this.shelf = shelf;
	}

	public List<Shelf> getShelfs() {
		return shelfs;
	}

	public void setShelfs(List<Shelf> shelfs) {
		this.shelfs = shelfs;
	}

		
}

	
	


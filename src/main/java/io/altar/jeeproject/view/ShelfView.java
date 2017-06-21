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
		

		private Shelf shelf;
		
		private List <Shelf> shelfs = new ArrayList<>();
		
		public String addShelf(){
			shelfs.add(shelf);
			
			return null;
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

	
	


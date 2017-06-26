package io.altar.jeeproject.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.jeeproject.model.Product;
import io.altar.jeeproject.model.Shelf;


@Named("shelfView")
@RequestScoped

public class ShelfView implements Serializable{
		
	private static final long serialVersionUID = 1L;
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public Integer getProduto() {
		return produto;
	}

	public void setProduto(Integer produto) {
		this.produto = produto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	private int codigo;
	private int capacidade;
	private Integer produto;
	private double preco;
	
	@Inject
	private Shelf shelf;
	
	private static List <Shelf> shelfs = new ArrayList<>();
	
	static{
		shelfs.add(new Shelf());
	}
	
	
	public String addShelf(){
		
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

	
	


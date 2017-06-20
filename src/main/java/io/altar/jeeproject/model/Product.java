package io.altar.jeeproject.model;

import java.io.Serializable;
import java.util.ArrayList;

import io.altar.jeeproject.repository.ProductRepository;

public class Product extends Entity{
	
	private ArrayList<Integer> pratIdLoc= new ArrayList<>();
	private double desconto;
	private int iva;
	private double pvp;
	private ProductRepository productRepository = new ProductRepository();
	
	
	public ArrayList<Integer> getPratIdLoc() {
		return pratIdLoc;
	}
	public void setPratIdLoc(ArrayList<Integer> pratIdLoc) {
		this.pratIdLoc = pratIdLoc;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	public int getIva() {
		return iva;
	}
	public void setIva(int iva) {
		this.iva = iva;
	}
	public double getPvp() {
		return pvp;
	}
	public void setPvp(double pvp) {
		this.pvp = pvp;
	}	
	
//  adicionar a parteleira criada ao repositorio shelfRepository

		public Product(ArrayList<Integer> pratIdLoc, double desconto, int iva, double pvp) {
			this.pratIdLoc = pratIdLoc;
			this.desconto = desconto;
			this.iva = iva;
			this.pvp = pvp;
			productRepository.addToList(this);
		}
	
}
		
package io.altar.jeeproject.model;

import java.io.Serializable;
import java.util.ArrayList;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.jeeproject.repository.ProductRepository;
import io.altar.jeeproject.view.ProductView;


public class Product extends Entity implements Serializable{
	
	private Integer pratIdLoc;
	private double desconto;
	private int iva;
	private double pvp;
	
	private static final long serialVersionUID = 1L;
	
	public Integer getPratIdLoc() {
		return pratIdLoc;
	}
	public void setPratIdLoc(Integer pratIdLoc) {
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
	

	
	
}
		
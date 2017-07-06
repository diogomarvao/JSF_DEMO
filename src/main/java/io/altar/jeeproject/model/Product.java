package io.altar.jeeproject.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name="PRODUCTS")
public class Product extends Entity implements Serializable{
	
	@Column(name="Prateleiras")
	private Integer pratIdLoc;
	
	@Column(name="Desconto")
	private double desconto;
	
	@Column(name="IVA")
	private int iva;
	
	@Column(name="PVP")
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
		
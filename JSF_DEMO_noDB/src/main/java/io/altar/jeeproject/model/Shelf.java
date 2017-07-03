package io.altar.jeeproject.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.jeeproject.repository.EntityRepository;
import io.altar.jeeproject.repository.ProductRepository;
import io.altar.jeeproject.repository.ShelfRepository;
import io.altar.jeeproject.util.Utils;
import io.altar.jeeproject.view.ShelfView;

@Named
@SessionScoped
public class Shelf extends Entity implements Serializable {
	
		private int codigo;
		private int capacidade;
		private Integer produto;
		private double preco;

		
		private static final long serialVersionUID = 1L;
	
//setters das variaveis	
		
		public void setCod(int codigo){
			this.codigo=codigo;
		}
		
		public void setCap(int capacidade){
			this.capacidade=capacidade;
		}
		
		public void setProd(Integer produto){
			this.produto=produto;
		}
		
		public void setPreco(double preco){
			this.preco=preco;
		}
	
//getters das variaveis

		public int getCod(){
			return this.codigo;
		}
		
		public int getCap(){
			return this.capacidade;
		}
		
		public Integer getProd(){
			return this.produto;
		}
		
		public double getPreco(){
			return this.preco;
		}
		
		@Inject
		public Shelf(){
			
		}

}
		

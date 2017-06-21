package io.altar.jeeproject.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import io.altar.jeeproject.repository.EntityRepository;
import io.altar.jeeproject.repository.ProductRepository;
import io.altar.jeeproject.repository.ShelfRepository;
import io.altar.jeeproject.util.Utils;

public class Shelf extends Entity {
		private int codigo;
		private int capacidade;
		private Integer produto;
		private double preco;
		private ShelfRepository shelfRepository = new ShelfRepository();
	
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
		
		
//adicionar a parteleira criada ao repositorio shelfRepository

//		public Shelf(int codigo, int capacidade, Integer produto, double preco) {
//			this.codigo = codigo;
//			this.capacidade = capacidade;
//			this.produto = produto;
//			this.preco = preco;
//			shelfRepository.addToList(this);
//		}
}
		
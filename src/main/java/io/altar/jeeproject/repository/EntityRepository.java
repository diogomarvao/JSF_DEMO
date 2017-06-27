package io.altar.jeeproject.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import io.altar.jeeproject.model.Entity;
import io.altar.jeeproject.model.Product;
import io.altar.jeeproject.model.Shelf;
import io.altar.jeeproject.util.Utils;

public class EntityRepository<E extends Entity> {
	private LinkedHashMap <Integer, E> entityList = new LinkedHashMap<>();


//metodo para gerar o id automaticamente
	private int id = 0;
		
	public int getNextId(){	
		return ++id;
	}

//Metodo para adicionar o elemento � lista	(ver Product.java e Shelf.java)
	public void addToList(E entity){
		entity.setId(getNextId());
		entityList.put(entity.getId(), entity);
	}
	
//Indentificar Ids
	//Receber todos os Ids da lista   (vai servir principalmente para inndentificar a 
//										quantidade de shelfs e products no entityList)
		public Set<Integer> keySet(){
			return entityList.keySet();
	}
		
		public Collection<E> values(){
			return entityList.values();
	}
	
	//Verificar se a lista esta vazia	(utilizado para verificar a existencia de produtos
//											ou parteleiras durante a cria�ao dos mesmos)
		public boolean isEmpty(){
			return entityList.isEmpty();
	}
		
	//Receber o id do elemento da lista
		public Entity get(int id){
			return entityList.get(id);
		}
		
//		public Collection<Entity> teste(){
//			return entityList.values();
//		}

// delete do elemento
	public void removElem(int id){
		
			entityList.remove(id);
					
	}	
	
}	



package io.altar.jeeproject.repository;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.UserTransaction;

import io.altar.jeeproject.model.Entity;

//public class EntityRepository<E extends Entity> {
//	private LinkedHashMap <Integer, E> entityList = new LinkedHashMap<>();

public class EntityRepository<E extends Entity> {
	@PersistenceContext(unitName="database")
	private EntityManager em;
	
//	@Resource
//    private UserTransaction userTransaction;
	
	public EntityManager getDb(){
		return em;
	}
	
	@Transactional
	public void addToDb(E entity){
		em.persist(entity);
	}
	
	@Transactional
	public void removeFromDb(E entity){
//		E entityToRemove = em.find((Class<E>) EntityModel.class, entity.getId());
//		em.remove(entityToRemove);
	}
//	
	@Transactional
	public void alterInDb(E newEntity){
//		E dbEntity = em.find(E.class, entity.getId());
		em.merge(newEntity);
	}
	
	
	
	
	//metodo para gerar o id automaticamente
//	private int id = 0;
//		
//	public int getNextId(){	
//		return ++id;
//	}

//Metodo para adicionar o elemento � lista	(ver Product.java e Shelf.java)
//	public void addToList(E entity){
//		entity.setId(getNextId());
//		entityList.put(entity.getId(), entity);
//	}
//	
////Indentificar Ids
//	//Receber todos os Ids da lista   (vai servir principalmente para inndentificar a 
////										quantidade de shelfs e products no entityList)
//		public Set<Integer> keySet(){
//			return entityList.keySet();
//	}
//		
//		public Collection<E> values(){
//			return entityList.values();
//	}
//	
//	//Verificar se a lista esta vazia	(utilizado para verificar a existencia de produtos
////											ou parteleiras durante a cria�ao dos mesmos)
//		public boolean isEmpty(){
//			return entityList.isEmpty();
//	}
//		
//	//Receber o id do elemento da lista
//		public Entity get(int id){
//			return entityList.get(id);
//		}
//		
//
//// delete do elemento
//	public void removElem(int id){
//		
//			entityList.remove(id);
//					
//	}	
	
}	



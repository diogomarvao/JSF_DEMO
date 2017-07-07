package io.altar.jeeproject.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.altar.jeeproject.model.Entity;
import io.altar.jeeproject.repository.EntityRepository;

public class EntityService <E extends Entity> {
	
	public void addEntity(EntityRepository<E> entityList, E entity){
		entityList.addToDb(entity);
	}
	
	public void delEntity(EntityRepository<E> entityList, E entity){
		entityList.removeFromDb(entity);
	}
	
	public void editEntity(EntityRepository<E> entityList, E entity){
		entityList.alterInDb(entity);
	}
	
//	public void delEntity(EntityRepository<E> entityList, E entity){
//		entityList.removElem(entity.getId());
//	}
	
	
	
}

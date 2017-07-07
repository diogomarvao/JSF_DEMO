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

public class EntityRepository<E extends Entity> {
	@PersistenceContext(unitName="database")
	private EntityManager em;
	
	public EntityManager getDb(){
		return em;
	}
	
	@Transactional
	public void addToDb(E entity){
		em.persist(entity);
	}
	
	@Transactional
	public void removeFromDb(E entity){
	}
	
//	
	@Transactional
	public void alterInDb(E newEntity){
		em.merge(newEntity);
	}

	
}	



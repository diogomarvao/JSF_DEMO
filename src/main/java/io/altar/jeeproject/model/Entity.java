package io.altar.jeeproject.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Entity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
//get id produtos

	public Integer getId(){
		return id;
		
	}

//	set id
	
	public void setId(Integer id){
		this.id=id;
		
	}
		
	public Entity(){
		
	}
}


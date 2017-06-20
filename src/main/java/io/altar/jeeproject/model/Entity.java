package io.altar.jeeproject.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

import io.altar.jeeproject.repository.EntityRepository;

public class Entity {
	
	private int id;
	
//get id produtos

	public Integer getId(){
		return id;
		
	}

//	set id
	
	public void setId(int id){
		this.id=id;
		
	}
		
	public Entity(){
		
	}
}


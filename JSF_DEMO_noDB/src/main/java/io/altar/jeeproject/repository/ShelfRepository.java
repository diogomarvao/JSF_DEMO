package io.altar.jeeproject.repository;

import io.altar.jeeproject.model.Shelf;

public class ShelfRepository extends EntityRepository <Shelf>{

	private static final ShelfRepository INSTANCE = new ShelfRepository();
//	
	private ShelfRepository(){}
	
	public static ShelfRepository getInstance(){
		return INSTANCE;
	}

	
	
//substituir ou adicionar as caraterisiticas no Linked hash map 
	
		public void alterShelfElement(int id,int codigo, int capacidade, Integer produto, double preco) {
			((Shelf) get(id)).setCod(codigo);
			((Shelf) get(id)).setCap(capacidade);
			((Shelf) get(id)).setProd(produto);
			((Shelf) get(id)).setPreco(preco);
		}


}
		

		


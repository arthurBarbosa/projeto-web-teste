package com.testeweb.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.testeweb.model.domain.Produto;

public class ProdutoDAOImplem implements ProdutoDAOInterface{
	
	//anotacion criado para informar a interface que estou trabalhando com persistence-unit(unidade de persistencia)
	@PersistenceContext(unitName = "ProjetoWebPersistenceUnit")
	private EntityManager entityManager;
	
	
	@Override
	public Produto salvarProduto(Produto produto) {
		entityManager.persist(produto);
		return produto;
	}

	@Override
	public void alterar(Produto produto) {
		Produto produtoMerge = entityManager.merge(produto);
		entityManager.persist(produtoMerge);
		
	}

	@Override
	public void excluir(Produto produto) {
		Produto produtoRemove = entityManager.merge(produto);
		entityManager.remove(produtoRemove);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Produto> getProdutos() {
		Query query = entityManager.createQuery("from Produto");
		return query.getResultList();
	}

}

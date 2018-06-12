package com.testeweb.model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import com.testeweb.model.dao.ProdutoDAOInterface;
import com.testeweb.model.domain.Produto;

public class ProdutoServiceImplem implements ProdutoServiceInterface {
	
	@Inject
	private ProdutoDAOInterface produtoDAOInterface;
	
	@Override
	@Transactional
	public Produto salvarProduto(Produto produto) {
		// TODO Auto-generated method stub
		return produtoDAOInterface.salvarProduto(produto);
	}

	@Override
	@Transactional
	public void alterar(Produto produto) {
		produtoDAOInterface.alterar(produto);
	}

	@Override
	@Transactional
	public void excluir(Produto produto) {
		produtoDAOInterface.excluir(produto);
	}

	@Override
	public List<Produto> getProdutos() {
		return produtoDAOInterface.getProdutos();
	}

}

package com.testeweb.model.dao;

import java.util.List;

import com.testeweb.model.domain.Produto;

public interface ProdutoDAOInterface {
	
	Produto salvarProduto(Produto produto);
	
	void alterar(Produto produto);
	
	void excluir(Produto produto);
	
	List<Produto> getProdutos();
}

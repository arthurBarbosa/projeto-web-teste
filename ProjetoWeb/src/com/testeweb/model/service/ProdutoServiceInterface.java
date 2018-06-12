package com.testeweb.model.service;

import java.util.List;

import com.testeweb.model.domain.Produto;

public interface ProdutoServiceInterface {

	Produto salvarProduto(Produto produto);

	void alterar(Produto produto);

	void excluir(Produto produto);

	List<Produto> getProdutos();
}

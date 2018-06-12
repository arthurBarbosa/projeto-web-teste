package com.testeweb.model.rest.facade;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.testeweb.model.domain.Produto;
import com.testeweb.model.service.ProdutoServiceInterface;

@Path("/produtos")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Consumes(MediaType.APPLICATION_JSON)
public class ProdutoFacade {

	/*@Inject
	private ProdutoDAOImplem daoImplem;
	
	@GET
	public List<Produto> getProdutos(){
		return daoImplem.getProdutos();
	}*/
	
	@Inject
	private ProdutoServiceInterface produtoServiceInterface;
	
	@GET
	public List<Produto> getProdutos(){
		return produtoServiceInterface.getProdutos();
	}
	
	@POST
	public Produto salvarProduto(Produto produto) {
		return produtoServiceInterface.salvarProduto(produto);
	}
	
	@PUT
	public void atualizar(Produto produto) {
		produtoServiceInterface.alterar(produto);
		
	}
	
	@DELETE
	@Path("/{codigoProduto}")
	public void excluir(@PathParam("codigoProduto")Long codigoProduto) {
		Produto produto = new Produto();
		produto.setCodigo(codigoProduto);
		produtoServiceInterface.excluir(produto);
	}
}











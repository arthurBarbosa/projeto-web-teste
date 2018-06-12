

var produtosModulo = angular.module('produtosModulo',[]);

produtosModulo.controller("produtosController", function($scope, $http){
	
	urlProdutos = "//localhost:8080/ProjetoWeb/rest/produtos";
	
	$scope.listarProdutos = function() {
		$http.get(urlProdutos).success(function(produtos){
			$scope.produtos = produtos;
		
		}).error(function (erro) {
			alert(erro);
		});
	}
	
	$scope.selecionarProduto = function (produtoSelecionado){
		$scope.produto = produtoSelecionado;
	}
	
	$scope.limparCampos = function(){
		$scope.produto = "";
	}
	
	$scope.salvar = function(){
		if($scope.produto.codigo == undefined){
				$http.post(urlProdutos,$scope.produto).success(function(produto){
				$scope.produtos.push($scope.produto);
				$scope.limparCampos();
			}).error (function (erro){
				alert(erro);
			});
		}else {
			$http.put(urlProdutos,$scope.produto).success(function(produto){
				$scope.listarProdutos();
				$scope.limparCampos();
			}).error (function (erro){
				alert(erro);
			});
		}
		
	}
	
	$scope.excluir = function(){
		if($scope.produto.codigo == undefined){
			alert("Código não selecionado. Selecione um registro para exclusão");
		}else{
			$http.delete(urlProdutos+'/'+$scope.produto.codigo).success(function(){
				$scope.listarProdutos();
				$scope.limparCampos();
			}).error (function (erro){
				alert(erro);
			});
		}
	}
	
	$scope.listarProdutos();
});







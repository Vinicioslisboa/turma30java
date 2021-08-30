package com.minhaLojaDeGames.lojaGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaLojaDeGames.lojaGames.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
	

}

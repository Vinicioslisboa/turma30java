package com.farmacia.Farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacia.Farmacia.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	public List<Categoria> findAllByFarmaceuticaContainingIgnoreCase (String farmaceutica);
	
}

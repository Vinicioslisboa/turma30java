package com.minhaLojaDeGames.lojaGames.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaLojaDeGames.lojaGames.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	public Optional<Usuario> findByUsuario(String usuario);
	
}

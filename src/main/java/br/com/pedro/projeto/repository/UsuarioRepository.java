package br.com.pedro.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pedro.projeto.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{

}

package br.com.sada.autenticacaooauth2Jwtversaospringboot1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sada.autenticacaooauth2Jwtversaospringboot1.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}

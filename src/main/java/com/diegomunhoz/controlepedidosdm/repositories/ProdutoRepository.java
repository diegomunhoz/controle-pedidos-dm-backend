package com.diegomunhoz.controlepedidosdm.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.diegomunhoz.controlepedidosdm.domain.Categoria;
import com.diegomunhoz.controlepedidosdm.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

//	Outra forma de se escrever o método de consulta
//	@Query("SELECT DISTINCT obj FROM Produto obj INNER JOIN obj.categorias cat WHERE obj.nome LIKE %:nome% AND cat IN :categorias")
//	Page<Produto> search(@Param("nome") String nome,@Param("categorias") List<Categoria> categorias,Pageable pageRequest);

	@Transactional(readOnly=true)
	public Page<Produto> findDistinctByNomeContainingAndCategoriasIn(String nome, List<Categoria> categorias,Pageable pageRequest);
	
}
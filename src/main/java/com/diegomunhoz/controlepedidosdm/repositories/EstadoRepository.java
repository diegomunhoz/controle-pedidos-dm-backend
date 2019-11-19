package com.diegomunhoz.controlepedidosdm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diegomunhoz.controlepedidosdm.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{

}
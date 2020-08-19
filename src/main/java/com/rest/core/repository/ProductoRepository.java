package com.rest.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.core.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}

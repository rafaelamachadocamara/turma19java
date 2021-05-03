package com.generation.FarmaciaGeneration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.FarmaciaGeneration.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}

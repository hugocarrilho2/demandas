package br.com.demandas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.demandas.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>
{
	
}
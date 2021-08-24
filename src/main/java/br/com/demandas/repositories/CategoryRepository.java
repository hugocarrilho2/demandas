package br.com.demandas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.demandas.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> 
{
	
}
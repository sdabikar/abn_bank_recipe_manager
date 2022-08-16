package com.abn.bank.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.abn.bank.model.Recipe;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long>,JpaSpecificationExecutor<Recipe> {	
	
}

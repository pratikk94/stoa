package com.example.demo.repository;
 
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Recipe;

@Repository
public interface RecipeRepository extends MongoRepository<Recipe, String>{
	
	
	@Query("{\"ingredients\":{$in:[\"?0\"]}}")
	List<Recipe> getByIngredient(String ingredients);
	
	List<Recipe> findByIngredients(List<String> ingredients);
	
	
	
}

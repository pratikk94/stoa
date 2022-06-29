package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Recipe;
import com.example.demo.entity.User;
import com.example.demo.repository.RecipeRepository;
import com.example.demo.repository.UserRepository;

@Service
public class MongoService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	RecipeRepository recipeRepository;
	

	public User createUser(User user) {
		return userRepository.save(user);
	}
	

	public Recipe createRecipe(Recipe recipe) {
		
		return recipeRepository.save(recipe);
	}
	
	public List<Recipe> getAll() {
		return recipeRepository.findAll();
	}
	
	
	public List<Recipe> getRecipeByIngredient(String ingredient) {
		return recipeRepository.getByIngredient(ingredient);
	}
	
}

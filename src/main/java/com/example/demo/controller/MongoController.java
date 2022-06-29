package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Recipe;
import com.example.demo.entity.User;
import com.example.demo.service.MongoService;

@RestController
@RequestMapping("api/mongo")
public class MongoController {
	
	@Autowired
	MongoService mongoService;
	
	@PostMapping("/createUser")
	public ResponseEntity<?> createUser(@RequestBody User user) {
		try {
			mongoService.createUser(user);
			return new ResponseEntity<String>("User created successfully", HttpStatus.OK);	
		}
		catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
		}
	}
	
	@PostMapping("/createRecipe")
	public ResponseEntity<?> createRecipe(@RequestBody Recipe recipe){
		try {
			mongoService.createRecipe(recipe);
			return new ResponseEntity<Recipe>(recipe, HttpStatus.OK);	
		}
		catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
		}
	}
	
	@GetMapping("/all")
	public ResponseEntity<?> getByIngredient(){
		try {
			List<Recipe> recipes = mongoService.getAll();
			return new ResponseEntity<List<Recipe>>(recipes, HttpStatus.OK);	
		}
		catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
		}
	}
	
	
	
	@GetMapping("/sortByIngredient")
	public ResponseEntity<?> getByIngredient(@PathVariable String ingredient){
		try {
			List<Recipe> recipes = mongoService.getRecipeByIngredient(ingredient);
			return new ResponseEntity<List<Recipe>>(recipes, HttpStatus.OK);	
		}
		catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
		}
	}
	
	
	
	
	
}

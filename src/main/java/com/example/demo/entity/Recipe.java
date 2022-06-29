package com.example.demo.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "recipe")
public class Recipe {

	@Id
	String id;
	
	String userMadeById;
	List<String> ingredients;
	List<String> steps;
	List<LikedUser> likedUsers;
	
	
	public List<LikedUser> getLikedUsers() {
		return likedUsers;
	}
	public void setLikedUsers(List<LikedUser> likedUsers) {
		this.likedUsers = likedUsers;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserMadeById() {
		return userMadeById;
	}
	public void setUserMadeById(String userMadeById) {
		this.userMadeById = userMadeById;
	}
	public List<String> getIngredients() {
		return ingredients;
	}
	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}
	public List<String> getSteps() {
		return steps;
	}
	public void setSteps(List<String> steps) {
		this.steps = steps;
	}
	



}


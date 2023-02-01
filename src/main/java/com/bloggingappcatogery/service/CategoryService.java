package com.bloggingappcatogery.service;

import java.util.List;

import com.bloggingappcatogery.controller.CategoryDto;

public interface CategoryService {

	 CategoryDto createCategory(CategoryDto categoryDto) ;

	public CategoryDto updateCategory(CategoryDto categoryDto, Integer catId) ;
	
	public List<CategoryDto> getCategories() ;
		
	public void deleteCategory(Integer catId);

	public CategoryDto getCategory(Integer catId) ;

}

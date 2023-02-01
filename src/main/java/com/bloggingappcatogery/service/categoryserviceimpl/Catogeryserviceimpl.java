package com.bloggingappcatogery.service.categoryserviceimpl;

import java.util.List;

import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloggingappcatogery.controller.CategoryDto;
import com.bloggingappcatogery.entity.Catogery;
import com.bloggingappcatogery.exception.ResourceNotFoundException;
import com.bloggingappcatogery.repository.Ctogeryrepo;
import com.bloggingappcatogery.service.CategoryService;

@Service
public class Catogeryserviceimpl implements CategoryService {

	@Autowired
	private Ctogeryrepo categoryRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	 @Override
	 public CategoryDto createCategory(CategoryDto categoryDto) {
		Catogery cat = this.modelMapper.map(categoryDto, Catogery.class);
		Catogery addedCat = this.categoryRepo.save(cat);
		return this.modelMapper.map(addedCat, CategoryDto.class);
	}
	
	@Override
	public CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId) {
		Catogery cat = this.categoryRepo.findById(categoryId).orElseThrow(()-> new ResourceNotFoundException("Category","category id",categoryId));
		cat.setCategoryTitle(categoryDto.getCategoryTitle());
		cat.setCategoryDescription(categoryDto.getCategoryDescription());
		Catogery updatedCat = this.categoryRepo.save(cat);
		return this.modelMapper.map(updatedCat, CategoryDto.class);
	}
	
	
	@Override
	public void deleteCategory(Integer categoryId) {
		Catogery cat =this.categoryRepo.findById(categoryId).orElseThrow(()-> new ResourceNotFoundException("Category","category id",categoryId));
		this.categoryRepo.delete(cat);
	}
	
	
	@Override
	public CategoryDto getCategory(Integer categoryId) {
		Catogery cat = this.categoryRepo.findById(categoryId).orElseThrow(()->new ResourceNotFoundException("Category","category id",categoryId));		
		return this.modelMapper.map(cat,CategoryDto.class);
	}

	@Override
	public List<CategoryDto> getCategories() {
		List<Catogery> categories = this.categoryRepo.findAll();
		List<CategoryDto> catDtos=categories.stream().map((cat)-> this.modelMapper.map(cat, CategoryDto.class)).collect(Collectors.toList());
		return catDtos;
	}
	
}

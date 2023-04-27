package com.blog.blogappappis.service;

import com.blog.blogappappis.payloads.CategoryDto;

import java.util.List;


public interface CategoryService {

    //create

    public CategoryDto createCategory(CategoryDto categoryDto);

    // update

    public CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryId);

    //delete

    public void deleteCategory(Integer categoryId);


    //get

    public CategoryDto getCategoryById(Integer categoryId);

    //getAll

    public List<CategoryDto> getCategories();

}

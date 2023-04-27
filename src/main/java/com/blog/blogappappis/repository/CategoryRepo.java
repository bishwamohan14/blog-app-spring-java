package com.blog.blogappappis.repository;

import com.blog.blogappappis.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category,Integer> {
}

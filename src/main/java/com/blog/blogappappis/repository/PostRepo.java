package com.blog.blogappappis.repository;

import com.blog.blogappappis.entity.Category;
import com.blog.blogappappis.entity.Post;
import com.blog.blogappappis.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepo extends JpaRepository<Post,Integer> {
    List<Post> findByUser(User user);
    List<Post> findByCategory(Category category);

    List<Post> findByTitleContaining(String title);

}

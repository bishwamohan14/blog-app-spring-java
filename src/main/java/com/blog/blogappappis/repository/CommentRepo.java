package com.blog.blogappappis.repository;

import com.blog.blogappappis.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment,Integer>
{


}

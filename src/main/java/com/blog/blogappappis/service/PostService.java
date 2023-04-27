package com.blog.blogappappis.service;

import com.blog.blogappappis.entity.Post;
import com.blog.blogappappis.entity.User;
import com.blog.blogappappis.payloads.PostDto;
import com.blog.blogappappis.payloads.PostResponse;

import java.util.List;

public interface PostService {

    // create

    PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);

    // update

    PostDto updatePost(PostDto postDto,Integer postId);

    // delete

    void deletePost(Integer postId);

    //getAll

    PostResponse getAllPost(Integer pageNumber, Integer pageSize,String sortBy,String sortDir);


    //getById

    PostDto getPostById(Integer postId);

    //get all post by category
    List<PostDto> getPostsByCategory(Integer categoryId);

     //get all posts by user

    List<PostDto> getPostsByUser(Integer userId);

    // search post

    List<PostDto> searchPosts(String keyword);

}

package com.blog.blogappappis.service.impl;

import com.blog.blogappappis.entity.Comment;
import com.blog.blogappappis.entity.Post;
import com.blog.blogappappis.exception.ResourceNotFoundException;
import com.blog.blogappappis.payloads.CommentDto;
import com.blog.blogappappis.repository.CommentRepo;
import com.blog.blogappappis.repository.PostRepo;
import com.blog.blogappappis.service.CommentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Service;


@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private PostRepo postRepo;

    @Autowired
    private CommentRepo commentRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CommentDto createComment(CommentDto commentDto, Integer postId) {
        Post post=this.postRepo.findById(postId).orElseThrow(()->new ResourceNotFoundException("post","post id",postId));
        Comment comment=this.modelMapper.map(commentDto, Comment.class);
        comment.setPost(post);
        Comment savedComment=this.commentRepo.save(comment);
        return this.modelMapper.map(savedComment,CommentDto.class);
    }

    @Override
    public void deleteComment(Integer commentId) {
        Comment comment=this.commentRepo.findById(commentId).orElseThrow(()->new ResourceNotFoundException("comment","comment id",commentId));
        this.commentRepo.delete(comment);
    }
}



/*
Post post=this.postRepo.findById(postId).orElseThrow(()->new ResourceNotFoundException("Post","post id",postId));
        Comment comment=this.modelMapper.map(commentDto, Comment.class);
        comment.setPost(post);
        Comment savedComment=this.commentRepo.save(comment);
        return this.modelMapper.map(savedComment,CommentDto.class);
 */
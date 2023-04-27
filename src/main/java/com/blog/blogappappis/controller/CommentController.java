package com.blog.blogappappis.controller;

import com.blog.blogappappis.entity.Comment;
import com.blog.blogappappis.payloads.ApiResponse;
import com.blog.blogappappis.payloads.CommentDto;
import com.blog.blogappappis.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class CommentController {

    @Autowired
    private CommentService commentService;


    @PostMapping("/post/{postId}/comments")
    public ResponseEntity<CommentDto> createComment(@RequestBody CommentDto commentDto, @PathVariable Integer postId)
    {
        CommentDto createComment=this.commentService.createComment(commentDto,postId);
        return new ResponseEntity<CommentDto>(createComment, HttpStatus.OK);
    }

   @DeleteMapping("/comments/{commentID}")
    public ResponseEntity<ApiResponse> deleteComment(@PathVariable Integer commentId)
    {
        this.commentService.deleteComment(commentId);
        return new ResponseEntity<>(new ApiResponse("comment deleted successfully",true),HttpStatus.OK );
    }




}

package com.blog.blogappappis.payloads;

import com.blog.blogappappis.entity.Post;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
public class CommentDto {

    private int id;
    private String content;


}

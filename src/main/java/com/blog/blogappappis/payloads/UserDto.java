package com.blog.blogappappis.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {


    private int id;
    @NotEmpty
    @Size(min = 4,message = "Username must be greater than minimum of  4 characters!!!!")
    private String name;

    @Email(message = "your email address is not be valid!!!1")
    private String email;

    @NotEmpty
    @Size(min = 4 , max = 12,message = "password must be less than 10 and greater than 4")
    private String password;

    @NotEmpty
    private String about;

}

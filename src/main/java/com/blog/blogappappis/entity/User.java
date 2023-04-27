package com.blog.blogappappis.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.util.stream.Collectors;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( name = "id",updatable = false, nullable = false)
    private int userId;


    @Column(name = "user_name",nullable = false,length = 100)
    private String name;



    private String email;


    private String password;


    private String about;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Post> posts=new ArrayList<>();


    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",
                joinColumns=@JoinColumn(name = "user",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role",referencedColumnName = "id")
    )
    private Set<Role> roles=new HashSet<>();


}

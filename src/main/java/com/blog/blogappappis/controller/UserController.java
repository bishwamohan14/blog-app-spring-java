package com.blog.blogappappis.controller;

import com.blog.blogappappis.entity.User;
import com.blog.blogappappis.payloads.ApiResponse;
import com.blog.blogappappis.payloads.UserDto;
import com.blog.blogappappis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;
    //Post-create user

    @PostMapping("/")
    public ResponseEntity<UserDto> create(@Valid @RequestBody UserDto userDto)
    {
    UserDto createUserDto=this.userService.createUser(userDto);
    return new ResponseEntity<>(createUserDto,HttpStatus.CREATED);
    }

    //Put -update user

    @PutMapping("/{userId}")
    public ResponseEntity<UserDto> updateUser(@Valid @RequestBody UserDto userDto,@PathVariable("userId") Integer uid)
    {
       UserDto updatedUser= this.userService.updateUser(userDto,uid);
       return ResponseEntity.ok(updatedUser);
    }

    //Delete -delete User

    @DeleteMapping("/{userId}")
    public ResponseEntity<ApiResponse> deleteUser(@PathVariable("userId") Integer uid)
    {
        this.userService.deleteUser(uid);
        return new ResponseEntity<>(new ApiResponse("User deleted successfully",true),HttpStatus.OK);
    }

    //Get - user get

    @GetMapping("/")
    public ResponseEntity<List<UserDto>> getAllUsers()
    {
        return ResponseEntity.ok(this.userService.getAllUsers());
    }



    @GetMapping("/{userId}")
    public ResponseEntity<UserDto> getSingleUser(@PathVariable Integer userId)
    {
        return ResponseEntity.ok(this.userService.getUserById(userId));
    }


}

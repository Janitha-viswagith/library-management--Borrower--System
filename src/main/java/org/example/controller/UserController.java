package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Login;
import org.example.dto.User;
import org.example.entity.UserEntity;
import org.example.service.LoginService;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {

@Autowired
  final UserService service;
  final LoginService loginService;
    @GetMapping("/get-All-User")
    public List<UserEntity> getAllUsers(){
        return service.getAllUsers();

    }

    @PostMapping("/add-user")
    public void addUser(@RequestBody User user){
        service.addUser(user);
        loginService.insertLoginData(new Login(user.getEmail(), user.getPassword()));
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id){
        service.deleteById(id);
    }

    @GetMapping("/find-by-user-name/{username}")
    public User findByUsername(@PathVariable String username){
        return service.findByUsername(username);
    }

    @GetMapping("/is-exists-user/{username}")
    public Boolean isExistsUser(@PathVariable String username){
       return service.isExistsUser(username);
    }
}

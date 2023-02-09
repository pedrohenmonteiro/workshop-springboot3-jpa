package com.educandoweb.course.resources;

import com.educandoweb.course.entities.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

  @GetMapping
  public ResponseEntity<User> findAll() {
    User u = new User(1L, "Pedro", "pedromont436@gmail.com", "43998877665", "12345");
    return ResponseEntity.ok().body(u);
  }

}

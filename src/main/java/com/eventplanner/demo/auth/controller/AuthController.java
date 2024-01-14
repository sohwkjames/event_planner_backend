package com.eventplanner.demo.auth.controller;

import org.springframework.web.bind.annotation.RestController;

import com.eventplanner.demo.auth.model.UserCredentials;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class AuthController {

  @GetMapping("/")
  public String getMethodName() {
    return "Backend works";
  }

  @PostMapping("/login")
  public String postMethodName(@RequestBody UserCredentials userCredentials) {
    return "Some jwt for user " + userCredentials.getEmail();
  }

}

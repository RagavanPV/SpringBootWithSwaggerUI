package com.ragavan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ragavan.dao.UserDAO;
import com.ragavan.modal.User;

@RestController
@RequestMapping("/users")
public class UserController {
  @Autowired
  private UserDAO userDAO;

  @GetMapping
  public List<User> getTasks() {
    return userDAO.findAll();
  }

  @PostMapping
  public void addTask(@RequestBody User user) {
    userDAO.save(user);
  }

  @PutMapping("/{id}")
  public void editTask(@PathVariable long id, @RequestBody User user) {
    User existingUser = userDAO.findOne(id);
    Assert.notNull(existingUser, "Task not found");
    existingUser.setEmailId(user.getEmailId());
    userDAO.save(existingUser);
  }

  @DeleteMapping("/{id}")
  public void deleteTask(@PathVariable long id) {
    userDAO.delete(id);
  }
}

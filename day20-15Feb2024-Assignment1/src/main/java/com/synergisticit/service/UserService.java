package com.synergisticit.service;

import java.util.List;

import com.synergisticit.domain.User;

public interface UserService {
      void save(User user);
      User findById(Long id);
      List<User> findAll();
      
      void update(User user);
      void deleteById(Long id);
}

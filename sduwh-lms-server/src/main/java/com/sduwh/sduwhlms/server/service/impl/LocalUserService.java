package com.sduwh.sduwhlms.server.service.impl;

import com.sduwh.sduwhlms.server.domain.User;
import com.sduwh.sduwhlms.server.mapper.UserDao;
import com.sduwh.sduwhlms.server.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;

public class LocalUserService implements UserService {
  @Autowired private UserDao userDao;

  @Override
  public User findUserByUsername(String username) {
    return userDao.findUserByUsername(username);
  }
}

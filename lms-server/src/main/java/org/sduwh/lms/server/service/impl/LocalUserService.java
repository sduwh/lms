package org.sduwh.lms.server.service.impl;

import org.sduwh.lms.server.domain.User;
import org.sduwh.lms.server.mapper.UserDao;
import org.sduwh.lms.server.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;

public class LocalUserService implements UserService {
  @Autowired private UserDao userDao;

  @Override
  public User findUserByUsername(String username) {
    return userDao.findUserByUsername(username);
  }
}

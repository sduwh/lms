package com.sduwh.sduwhlms.server.service.impl;

import com.sduwh.sduwhlms.server.domain.Pseudonym;
import com.sduwh.sduwhlms.server.mapper.PseudonymsDao;
import com.sduwh.sduwhlms.server.service.PseudonymsService;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.annotation.Resource;

public class LocalPseudonymsService implements PseudonymsService {
  @Resource private PseudonymsDao pseudonymsDao;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    Pseudonym pseudonym = pseudonymsDao.findUserByName(username);
    if (pseudonym == null) {
      throw new UsernameNotFoundException("Not found");
    }
    User.UserBuilder userBuilder = User.withUsername(pseudonym.getUserName());
    userBuilder
        .password(pseudonym.getCryptedPassword())
        .roles(pseudonym.getUser().getRole().toString());
    return userBuilder.build();
  }
}

package org.sduwh.lms.server.service.impl;

import org.sduwh.lms.server.domain.Pseudonym;
import org.sduwh.lms.server.mapper.PseudonymsDao;
import org.sduwh.lms.server.service.PseudonymsService;

import org.springframework.security.core.authority.AuthorityUtils;
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
    return new User(
        pseudonym.getUserName(),
        pseudonym.getCryptedPassword(),
        AuthorityUtils.commaSeparatedStringToAuthorityList(
            pseudonym.getUser().getRole().toString()));
  }
}

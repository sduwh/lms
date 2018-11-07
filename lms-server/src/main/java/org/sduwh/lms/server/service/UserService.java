package org.sduwh.lms.server.service;

import org.sduwh.lms.server.domain.User;

public interface UserService {
    User findUserByUsername(String username);
}

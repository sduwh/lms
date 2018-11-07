package com.sduwh.sduwhlms.server.service;

import com.sduwh.sduwhlms.server.domain.User;

public interface UserService {
    User findUserByUsername(String username);
}

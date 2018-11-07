package org.sduwh.lms.server.controller;

import org.sduwh.lms.server.domain.User;
import org.sduwh.lms.server.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("users")
public class UserController {
  @Autowired private UserService userService;

  @RequestMapping(value = "/new", method = RequestMethod.GET)
  public String createUserPage() {
    return "user_create";
  }

  @RequestMapping(value = "/new", method = RequestMethod.POST)
  public String createUser(
      @RequestParam("username") String username,
      @RequestParam("email") String email,
      @RequestParam("gender") String gender,
      @RequestParam("password") String password,
      @RequestParam("confirmPassword") String confirmPassword) {
    if (password.equals(confirmPassword)) {
      System.out.println(gender);
    }
    return null;
  }

  @RequestMapping(value = "/email/confirm", method = RequestMethod.GET)
  public String confirmEmail(Authentication authentication, HttpServletRequest request) {
    User user = userService.findUserByUsername(authentication.getName());
    request.setAttribute("mail", user.getEmail());
    return "mail_confirm";
  }
}

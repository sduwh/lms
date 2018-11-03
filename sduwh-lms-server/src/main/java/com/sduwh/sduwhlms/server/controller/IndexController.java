package com.sduwh.sduwhlms.server.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
  @RequestMapping(value = "/", method = RequestMethod.GET)
  @ResponseBody
  public String index(Authentication authentication) {
    if (authentication.isAuthenticated()) {
      return "hello " + authentication.getName();
    } else {
      return "bad request";
    }
  }
}

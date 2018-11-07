package org.sduwh.lms.server.controller;

import org.sduwh.lms.server.service.MailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
  @Autowired private MailService mailService;

  @PreAuthorize("isAuthenticated()")
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String index(Authentication authentication) {
    return "index";
  }

  @RequestMapping(value = "/send", method = RequestMethod.GET)
  @ResponseBody
  public String send(
      @RequestParam("to") String to,
      @RequestParam("content") String content,
      Authentication authentication) {
    if (authentication.isAuthenticated()) {
      mailService.sendTextEmail(to, "测试mail", content);
      return "success";
    } else {
      return "bad request";
    }
  }
}

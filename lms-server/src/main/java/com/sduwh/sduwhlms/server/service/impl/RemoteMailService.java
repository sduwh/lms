package com.sduwh.sduwhlms.server.service.impl;

import com.sduwh.sduwhlms.server.service.MailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RemoteMailService implements MailService {
  @Autowired private JavaMailSender javaMailSender;

  @Value("${mail.fromMail.addr}")
  private String from;

  @Override
  public void sendTextEmail(String to, String title, String content) {
    SimpleMailMessage message = new SimpleMailMessage();
    message.setFrom(from);
    message.setTo(to);
    message.setSubject(title);
    message.setText(content);

    try {
      javaMailSender.send(message);
      log.info("mail send success");
    } catch (Exception e) {
      log.error("mail send to {} exception:{}", to, e);
    }
  }
}

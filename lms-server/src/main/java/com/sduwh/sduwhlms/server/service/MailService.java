package com.sduwh.sduwhlms.server.service;

public interface MailService {
  void sendTextEmail(String to, String title, String content);
}

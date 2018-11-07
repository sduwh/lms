package com.sduwh.sduwhlms.server.config;

import com.sduwh.sduwhlms.server.service.MailService;
import com.sduwh.sduwhlms.server.service.impl.LocalPseudonymsService;
import com.sduwh.sduwhlms.server.service.impl.RemoteMailService;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
@MapperScan("com.sduwh.sduwhlms.server.mapper")
public class ApplicationBeanConfig {
  @Bean
  public UserDetailsService getUserDetailsService() {
    return new LocalPseudonymsService();
  }

  @Bean
  public MailService getMailService() {
    return new RemoteMailService();
  }
}

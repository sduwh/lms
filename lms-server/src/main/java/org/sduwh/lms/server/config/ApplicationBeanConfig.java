package org.sduwh.lms.server.config;

import org.sduwh.lms.server.service.MailService;
import org.sduwh.lms.server.service.impl.LocalPseudonymsService;
import org.sduwh.lms.server.service.impl.RemoteMailService;

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

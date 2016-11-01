package org.dubbo.demo.service.initiallizer;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "org.dubbo.demo.component")
@ImportResource("classpath:/META-INF/dubbo-consumer.xml")
public class SpringConfiguration {

}
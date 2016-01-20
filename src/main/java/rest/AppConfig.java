package rest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc //equivalent to mvc:annotation-driven
@ComponentScan(basePackages = "rest") //equivalent to context:component-scan base-package
public class AppConfig {

}

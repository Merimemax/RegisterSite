package edu.mum.registar;

import java.util.Locale; 

import org.springframework.boot.SpringApplication;
<<<<<<< HEAD
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class RegistarsiteApplication implements WebMvcConfigurer    {
=======
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
<<<<<<< HEAD
public class RegistarsiteApplication  {
=======
public class RegistarsiteApplication extends SpringBootServletInitializer {
>>>>>>> 02faf043ef63d586c52b890c63491e1693d1bb20
>>>>>>> 8d592616d9d8dfdc36830c657985ca8ea3ad03cc

    public static void main(String[] args) {
        SpringApplication.run(RegistarsiteApplication.class, args);
    }
<<<<<<< HEAD
    
    
    @Bean
    public SessionLocaleResolver localeResolver() {
      SessionLocaleResolver localeResolver = new SessionLocaleResolver();
      localeResolver.setDefaultLocale(Locale.US);
      return localeResolver;
    }
   
    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor() {
        LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
        lci.setParamName("lang");
        return lci;
    }
    
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(localeChangeInterceptor());
    }
=======

>>>>>>> 02faf043ef63d586c52b890c63491e1693d1bb20
}

package edu.mum.registar;


import java.util.Locale;  

import org.springframework.boot.SpringApplication;
import org.springframework.context.MessageSource;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.util.UrlPathHelper;


import edu.mum.registar.interceptor.CourseInterceptor;



@SpringBootApplication
public class RegistarsiteApplication implements WebMvcConfigurer {



    public static void main(String[] args) {
        SpringApplication.run(RegistarsiteApplication.class, args);
    }

    
    /*This is a place for Internalization message*/

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

    
   
   
    
    /**********This is configuration for  Custom Annotaion  validation and error message files**********/

    @Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource resource = new ResourceBundleMessageSource();

		resource.setBasenames("messages", "errorMessages");
		return resource;
	}
	
	@Bean(name="validator")
	public LocalValidatorFactoryBean validator() {
		LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
		bean.setValidationMessageSource(messageSource());
		return bean;
	}
	
	@Override
	public Validator getValidator() {
		return validator();
	}
	

	/*This is a place for interceptor*/
	@Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
       UrlPathHelper urlPathHelper = new UrlPathHelper();
       urlPathHelper.setRemoveSemicolonContent(false);
       configurer.setUrlPathHelper(urlPathHelper);
    }
    
    @Bean
    CourseInterceptor CourseInterceptor() {
         return new CourseInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(localeChangeInterceptor()); //this is for language
        registry.addInterceptor(CourseInterceptor()).addPathPatterns("/courseList/**");        
        
    }

	
	}
 



//package edu.mum.registar.config;
//
////import edu.mum.registar.interceptor.ValidUserInterceptor;
////import org.springframework.context.annotation.Configuration;
////import org.springframework.web.servlet.config.annotation.*;
////

/*package edu.mum.registar.config;

>>>>>>> 12beef31744c5573088247705f6f2184a4d34833
//import edu.mum.registar.interceptor.ValidUserInterceptor;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.*;
//
<<<<<<< HEAD
//@Configuration
//@EnableWebMvc
//public class WebMvcConfig implements WebMvcConfigurer {
////    @Override
////    public void addInterceptors(InterceptorRegistry registry) {
////        registry.addInterceptor(new ValidUserInterceptor());
////    }
////
////    @Override
////    public void addResourceHandlers(ResourceHandlerRegistry registry) {
////        registry.addResourceHandler("/resources/**")
////                .addResourceLocations("/resources/");
////    }
//}
=======

import edu.mum.registar.interceptor.ValidUserInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new ValidUserInterceptor());
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**")
                .addResourceLocations("/resources/");
    }
}
*/

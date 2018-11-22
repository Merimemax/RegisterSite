package edu.mum.registar.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice(value="edu.mum.registar")
public class AllControllerExceptionHandler {
@ExceptionHandler(IllegalArgumentException.class)
public ModelAndView handleError(HttpServletRequest req, IllegalArgumentException exception) {

ModelAndView mav = new ModelAndView();
mav.addObject("msg", exception.getMessage());
mav.addObject("url", req.getRequestURL() + "?" + req.getQueryString());
mav.setViewName("/admin/exceptionPage");
return mav;
}
}
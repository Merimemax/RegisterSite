package edu.mum.registar.validator;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;



@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy =CourseIdValidator.class)
public @interface CourseCode {
	
	String message() default "{edu.mum.registar.validator.Courseid.message}";
	Class<?>[] groups() default {};
	public abstract Class<? extends Payload>[] payload() default {};


}

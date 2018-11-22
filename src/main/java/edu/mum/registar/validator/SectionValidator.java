package edu.mum.registar.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class SectionValidator  implements ConstraintValidator<InvalidCapacity,Integer> {



	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context ) {
		
		return value<20  ? false : true;
	}
			
		
	@Override
	public void initialize(InvalidCapacity arg0) {
	}
}
	
	
	

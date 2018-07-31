package com.san.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy =CityValidator.class)
@Retention(RUNTIME)
@Target({ TYPE, FIELD })
/**
 * @author Sandip
 *
 */
public @interface IsValidCity {
	
	String listOfCities() default "Mumbai|Pune|Chennai";
	
	String message() default "Please enter valid city;" + "accepted cities are Mumbai,Pune,Chennai";
	
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default{};
	
}

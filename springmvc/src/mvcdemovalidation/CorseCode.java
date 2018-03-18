package mvcdemovalidation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * 
 * @author Srinivasan.S
 * @since springmvc-training
 * CorseCode annotation is used for custom validation
 *
 */
@Constraint(validatedBy=CourseCodeValidataor.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CorseCode {
 //default value
	
	public String value() default "AnnaUniv";
	
 //default method
   
	public String message() default "course code must start with AnnaUniv";
	
//group
	public Class <?>[] groups() default{};
 //payload
	public Class<? extends Payload>[] payload()default{};
}

package mvcdemovalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeValidataor implements ConstraintValidator<CorseCode, String>{
   
	public String prefix;
	@Override
	public void initialize(CorseCode courseCode) {
		prefix = courseCode.value();
	}

	@Override
	public boolean isValid(String userValue, ConstraintValidatorContext constraintValidatorContext) {
		// TODO Auto-generated method stub
		boolean valid = userValue.startsWith(prefix);
		return valid;
	}
	

}

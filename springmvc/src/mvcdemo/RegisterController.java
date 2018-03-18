package mvcdemo;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/register")
public class RegisterController {
    @RequestMapping("/showRegister")
	public String showRegister(Model model){
	   StudentModel student = new  StudentModel();
	   model.addAttribute("student", student);
		return "registration-form";
   }
    @RequestMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("student")StudentModel stumodel,BindingResult bindingResult){
    	System.out.println("the student"+stumodel.getFirstName());
//    	System.out.println(stumodel.getPassword().length());
    	if(bindingResult.hasErrors()){
    		return "registration-form";
    	}else{

    		return "confirm-form";
    	}
    	
    }
    @InitBinder
    public void initBinder(WebDataBinder binder){
    	StringTrimmerEditor editor = new StringTrimmerEditor(true);
    	binder.registerCustomEditor(String.class, editor);
    	
    }
}

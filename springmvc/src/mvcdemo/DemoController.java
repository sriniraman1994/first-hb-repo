package mvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class DemoController {
 @RequestMapping("/")   
	public String viewName(){
    	   return "maindemo";
       }
 @RequestMapping("/showForm")
 public String showForm(){
	 return "login";
 }
 @RequestMapping("/processForm")
 public String processForm(@RequestParam("uname")String name,Model model){
	 model.addAttribute("message", "hi"+name);
	 return "Afterlogin";
 }
       
}

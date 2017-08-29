package harjoitus2.thymeleaf.hello.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import harjoitus2.thymeleaf.hello.domain.Message;

@Controller
public class HelloController {
	
	@RequestMapping("hello")
	public String hello(@RequestParam(name="name")String name,@RequestParam(name="age")int age, Model model){
		model.addAttribute("name",name);
		model.addAttribute("age", age);
		return "hello";
	}

	/*@RequestMapping(value="/hello", method=RequestMethod.GET)
    public String hello(Model model) {
        model.addAttribute("message", new Message());
        return "hello";
    }*/
}
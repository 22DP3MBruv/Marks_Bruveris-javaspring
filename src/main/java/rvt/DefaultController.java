package rvt;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.validation.Valid;

@Controller
public class DefaultController {
    @GetMapping(value = "/")
    ModelAndView index() {
        Student student = new Student();
        List<Student> students = new ArrayList<>();
        students.add(student);
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("students", students);
        modelAndView.addObject("date", new Date().toString());
        return modelAndView;
    }
    @GetMapping(value = "/about")
    ModelAndView about() {
        ModelAndView modelAndView = new ModelAndView("about");

        return modelAndView;
    }



    @GetMapping(value = "/test")
    public ModelAndView testAction() {
        ModelAndView modelAndView = new ModelAndView("test");
        Money Wallet = new Money(5, 55);
        Money Wallet1 = new Money(50);
        Money Wallet2 = new Money();



        modelAndView.addObject("Wallet", Wallet);

        return modelAndView;
    }
    @GetMapping(value = "/register")
    public ModelAndView register() {
        ModelAndView modelAndView = new ModelAndView("register");
        
        
        return modelAndView;
    }
    public ModelAndView registerForm(@ModelAttribute("student") Student student) {
        ModelAndView modelAndView = new ModelAndView("registration/registration-success");


        System.out.println(student.getGroup());
        System.out.println(student.getGender());
        System.out.println(student.isMarried());

        return modelAndView;
    }
    
    @PostMapping(value = "/registration")
    public String registration(@Valid @ModelAttribute("User") User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "registration/registration-page";
        }

      

        // Save Student object to CSV
        

        return "redirect:/register?success";
    }
    
}

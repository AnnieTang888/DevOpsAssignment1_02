package com.synergisticit.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.synergisticit.domain.User;
import com.synergisticit.service.UserService;



@Controller
public class UserController {

    
	//@Qualifier(value = "userService")
	@Autowired
    UserService userService;

    @RequestMapping("userForm")
    public ModelAndView userForm(User user) {
    	System.out.println("====Annie====");
    	ModelAndView mav = new ModelAndView("userForm");
        List<User> users = userService.findAll();
        mav.addObject("users", users);
    	return mav;
    }
    
   
    @RequestMapping("/saveUser")
    public ModelAndView saveTheUser(User user) {
    	ModelAndView mav = new ModelAndView("redirect:userForm");
    	userService.save(user);
    	
    	return mav;
    }
    
    @RequestMapping("updateUser")
    public ModelAndView updateUser(User user) {
    	ModelAndView mav = new ModelAndView("userForm");;
    	User retrivedUser = userService.findById(user.getUserId());
    	System.out.println("retrievedUser: " +retrivedUser);
    	mav.addObject("user", retrivedUser);
    	
    	List<User> users = userService.findAll();
    	mav.addObject("users",users);
    	return mav;
    }
    
//    @RequestMapping("deleteUser")
//    public ModelAndView deleteTheUser(User user) {
//    	ModelAndView mav = new ModelAndView("redirect:userForm");
//    	System.out.println("deleteTheUser() user: "+user.getUserId());
//    	userService.deleteById(user.getUserId());
//    	return mav;
//    }
 
}


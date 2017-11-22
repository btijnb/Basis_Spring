package com.spring.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/** Handles requests for the application home page. */
@Controller
public class HomeController {

  private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

  /** Simply selects the home view to render by returning its name. */
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String home(Locale locale, Model model) {
    logger.info("Welcome home! The client locale is {}.", locale);

    Date date = new Date();
    DateFormat dateFormat =
        DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

    String formattedDate = dateFormat.format(date);

    model.addAttribute("serverTime", formattedDate);

    return "home";
  }

  @RequestMapping("member/test1")
  public String test(HttpServletRequest httpServletRequest, Model model) {
    String name = httpServletRequest.getParameter("name");
    String id = httpServletRequest.getParameter("id");

    model.addAttribute("name", name);
    model.addAttribute("id", id);

    return "member/test1";
  }

//  @RequestMapping("member/join")
//  public String personInfo(
//      @RequestParam("name") String name,
//      @RequestParam("id") String id,
//      @RequestParam("address") String address,
//      @RequestParam("email") String email,
//      Model model) {
//    Person person = new Person();
//    person.setName(name);
//    person.setId(id);
//    person.setAddress(address);
//    person.setEmail(email);
//
//    model.addAttribute("personInfo", person);
//    return "member/join";
//  }
  
  
  @RequestMapping("member/join")
  public String personInfo(Person person){
	  return "member/join";
	  
  }
}

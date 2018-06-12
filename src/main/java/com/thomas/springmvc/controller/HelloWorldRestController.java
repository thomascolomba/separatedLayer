package com.thomas.springmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thomas.businessLayer.businessObject.Message;
import com.thomas.businessLayer.businessUseCase.ReadMessageUseCase;
 
 
@RestController
public class HelloWorldRestController {

	//example based on : http://websystique.com/springmvc/spring-4-mvc-rest-service-example-using-restcontroller/
	
    @RequestMapping("/")
    public String welcome() {//Welcome page, non-rest
        return "Welcome to RestTemplate Example.";
    }
 
    @GetMapping("/message/{name}")
    public Message readMessage(@PathVariable String name) {//Welcome page, non-rest
        return ReadMessageUseCase.readMessage(name);
    }

    @PutMapping("/message")
    public void putMessage(@PathVariable Message message) {//Welcome page, non-rest
    	ReadMessageUseCase.writeMessage(message);
    }
//    @RequestMapping("/hello/{player}")
//    public Message message(@PathVariable String player) {//REST Endpoint.
// 
//        Message msg = new Message(player, "Hello " + player);
//        return msg;
//    }
}

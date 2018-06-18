package com.thomas.springmvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
 
    @RequestMapping(value = "/message/{name}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Message> readMessage(@PathVariable String name) {
        return new ResponseEntity<Message>(ReadMessageUseCase.readMessage(name), HttpStatus.OK);
    }

    @RequestMapping(value = "/message", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void putMessage(@RequestBody Message message) {
    	ReadMessageUseCase.createOrUpdateMessage(message);
    }
}

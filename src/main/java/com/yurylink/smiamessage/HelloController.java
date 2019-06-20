package com.yurylink.smiamessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Properties prop;

    @Value("${localmessage}")
    private String localmessage;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ResponseEntity testMessage(){
        return ResponseEntity.ok("localname: " + localmessage + ", configuration server message: " + prop.getCoolMessage());
    }
}

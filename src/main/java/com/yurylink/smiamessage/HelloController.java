package com.yurylink.smiamessage;

import com.yurylink.smiamessage.domain.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${message}")
    private String coolMessage;

    @Value("${localmessage}")
    private String localmessage;

    @Autowired
    private BillRepository billRepository;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ResponseEntity testMessage(){
        return ResponseEntity.ok("localname: " + localmessage + ", configuration server message: " + coolMessage);
    }

    @RequestMapping(value = "/bill", method = RequestMethod.GET)
    public ResponseEntity getAllBills(){
        return ResponseEntity.ok(billRepository.findAll());
    }
}

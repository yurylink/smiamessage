package com.yurylink.smiamessage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Properties {

    @Value("${message}")
    private String coolMessage;

    public String getCoolMessage() {
        return coolMessage;
    }
}

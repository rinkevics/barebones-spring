package org.kaspars.web;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class MyBean {

    public String method() {
        return "bean/method";
    }
}

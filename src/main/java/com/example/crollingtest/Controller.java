package com.example.crollingtest;


import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
@org.springframework.stereotype.Controller
@Log4j2
public class Controller {
    @GetMapping("/testpage")
    public String testPage() {
        return "testpage";
    }
    @GetMapping("/socket")
    public String chatGET(){

        log.info("@ChatController, chat GET()");

        return "socket";
    }
}

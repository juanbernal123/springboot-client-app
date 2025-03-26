package org.juan.springboot.security.client.controllers;

import org.juan.springboot.security.client.models.Message;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
//@RequestMapping("/api")
public class AppController {

    @GetMapping("/list")
    public List<Message> list() {
        return Collections.singletonList(new Message("Test List"));
    }

    @PostMapping("/create")
    public Message create(@RequestBody Message message) {
        System.out.println("mensaje: " + message);
        return message;
    }

    @GetMapping("/authorized")
    public Map<String, String> authorized(@RequestParam  String code) {
        return Collections.singletonMap("code", code);
    }
}

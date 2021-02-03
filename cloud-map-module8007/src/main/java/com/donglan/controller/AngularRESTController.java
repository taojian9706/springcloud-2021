package com.donglan.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TAOJIAN
 * @version 1.0
 * @since 2021-02-02 19:25:39
 */
@RestController
@RequestMapping("/rest")
public class AngularRESTController {

    @RequestMapping(path = "/resource",method = RequestMethod.GET)
    public Map<String, Object> home() {
        Map<String, Object> model = new HashMap<>();
        model.put("id", UUID.randomUUID().toString());
        model.put("content", "Hello World");
        return model;
    }
}

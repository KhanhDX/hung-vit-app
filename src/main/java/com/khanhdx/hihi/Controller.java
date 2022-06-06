package com.khanhdx.hihi;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/khanhdx")
public class Controller {
    @GetMapping("/hello")
    public ResponseEntity<List<Object>> hello (){
        Object object1 = new Object(1,"DM thang Hung Vit");
        Object object2 = new Object(2,"DM thang Hung Vit lan 2");
        List<Object> objects = new ArrayList<>();
        objects.add(object1);
        objects.add(object2);
        return new ResponseEntity<>(objects, HttpStatus.OK);
    }
}

class Object{
    public Integer code;
    public String message;

    public Object(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}

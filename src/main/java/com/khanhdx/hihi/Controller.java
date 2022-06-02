package com.khanhdx.hihi;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/khanhdx")
public class Controller {
    @GetMapping("/hello")
    public ResponseEntity<Object> hello (){
        Object object = new Object(1,"DM thang Hung Vit");
        return new ResponseEntity<>(object, HttpStatus.OK);
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

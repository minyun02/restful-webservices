package com.restfulwebservices.home.restfulwebservices.helloworld;

import com.restfulwebservices.home.restfulwebservices.helloworld.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Controller vs RestController?
@RestController
public class HelloWorldController {

    // GET
    //URI - /hello-world
    //method = "Hello World"
    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "Hello World~";
    }

    //hellor-world-bean
    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World~Bean");
    }

    //hello-world-path-variable/zzang
    @GetMapping(path = "/hello-world-path-variable/{name}")
    public HelloWorldBean helloWorldPathVarible(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World???, %s", name));
    }
}

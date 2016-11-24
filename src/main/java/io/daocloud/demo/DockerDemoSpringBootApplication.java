package io.daocloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerDemoSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerDemoSpringBootApplication.class, args);
    }

    @RequestMapping("")
    public String hello(){
        return "<b>Hello! yeeson 2 ! this is your Docker!</b>";
    }
}

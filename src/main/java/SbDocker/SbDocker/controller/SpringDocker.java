package SbDocker.SbDocker.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api/v1")
public class SpringDocker {


    @RequestMapping(value="/docker/test",method = RequestMethod.GET,produces= MediaType.APPLICATION_JSON_VALUE)
    public String doctest(
            @Valid @RequestHeader(value="user") String user){

        return "Hello Docker "+user;
    }
}

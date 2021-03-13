package SbDocker.SbDocker.controller;

import SbDocker.SbDocker.modelEntity.User;
import SbDocker.SbDocker.modelEntity.UserData;
import SbDocker.SbDocker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api/v1")
public class SpringDocker {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value="/docker/test",method = RequestMethod.GET,produces= MediaType.APPLICATION_JSON_VALUE)
    public String doctest(
            @Valid @RequestHeader(value="user") String user){

        return "Hello Docker "+user;
    }


    @RequestMapping(value = "/add",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public void addAge(
            @Valid @NotNull  @RequestBody UserData data){

        User user = new User();
        user.setAge(data.getAge());
        user.setName(data.getName());
        user.setPlace(data.getPlace());
        user.setPhone_number(data.getPhone_number());


        userRepository.save(user);

    }


    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }


}

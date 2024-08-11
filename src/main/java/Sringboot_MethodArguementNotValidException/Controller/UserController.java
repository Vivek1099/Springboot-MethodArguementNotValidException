package Sringboot_MethodArguementNotValidException.Controller;

import Sringboot_MethodArguementNotValidException.Entity.User;
import Sringboot_MethodArguementNotValidException.Repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController
{
    @Autowired
    UserRepository userRepository;

    @GetMapping("/test")
    public String test()
    {
        return "This is Method Arguement Not Valid Exception Test";
    }

    @PostMapping("/save")
    public User savedata(@Valid @RequestBody User user)
    {
         userRepository.save(user);
         return user;
    }

    @GetMapping("/show")
    public List<User> showdata()
    {
        return userRepository.findAll();
    }

}

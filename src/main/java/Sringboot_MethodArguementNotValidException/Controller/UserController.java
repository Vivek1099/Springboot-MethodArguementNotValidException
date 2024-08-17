package Sringboot_MethodArguementNotValidException.Controller;

import Sringboot_MethodArguementNotValidException.Entity.User;
import Sringboot_MethodArguementNotValidException.Repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/byid/{userId}")
    public Optional<User> ById(@Valid @PathVariable int userId)
    {
        return userRepository.findById(userId);
    }

    @GetMapping("/byname/{name}")
    public List<User> ByName(@Valid @PathVariable String name)
    {
        return userRepository.findByName(name);
    }

    @PutMapping("/update/{userId}")
    public User updateById(@Valid @PathVariable int userId, @RequestBody User user)
    {
        User u = userRepository.findById(userId).get();
        u.setName(user.getName());
        u.setAge(user.getAge());
        u.setEmail(user.getEmail());
        u.setGender(user.getGender());
        u.setNationality(user.getNationality());
        u.setMobile(user.getMobile());
        return userRepository.save(user);
    }

    @DeleteMapping("/delete/{userId}")
    public String deleteById(@Valid @PathVariable int userId)
    {
        userRepository.deleteById(userId);
        return "user data deleted";
    }
}

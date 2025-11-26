package rw.reskilla_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rw.reskilla_backend.model.User;
import rw.reskilla_backend.services.UserService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:3000")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/save")
    public ResponseEntity<User> createUser(@RequestBody User user){
        User saveUser = userService.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(saveUser);
    }

    @GetMapping("/list")
    public ResponseEntity <List<User>> getUserList(){
        List<User> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/uuid")
    public User getUserById(@PathVariable UUID id){
        return userService.getUser(id);
    }

}

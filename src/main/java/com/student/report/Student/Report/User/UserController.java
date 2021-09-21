package com.student.report.Student.Report.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    private UserService userService;

    @Autowired
    UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> findAll() {
        return userService.findAll();
    }

    @PostMapping("/users")
    public User create(@RequestBody User user) {
        User createdUser = userService.create(user);
        return createdUser;
    }

    @PutMapping("/users")
    public User update(@RequestBody User user) {
        User updatedUser = userService.update(user);
        return updatedUser;
    }

    @DeleteMapping("/users/{userId}")
    public int delete(@PathVariable int userId) {
        return userService.delete(userId);
    }

}

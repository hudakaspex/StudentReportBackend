package com.student.report.Authentication.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User create(User user) {
        user.setId(0);
        User createdUser = userRepository.save(user);
        return createdUser;
    }

    public User update(User user) {
        User userUpdated = userRepository.save(user);
        return userUpdated;
    }

    public int delete(int userId) {
        try {
            userRepository.deleteById(userId);
            return userId;
        }
        catch (Error err){
            throw new RuntimeException(err.getMessage());
        }
    }
}

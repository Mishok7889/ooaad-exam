package com.mishok.ooad.service;

import com.mishok.ooad.model.User;
import com.mishok.ooad.repository.UserRepository;

public class UserService {
    private UserRepository userRepository;

    public User addUser(User user) {
        return userRepository.addUser(user);
    }

    public User getUser(long id) {
        return userRepository.getUser(id);

    }

    public User deleteUser(long id) {
        return userRepository.deleteUser(id);

    }

    public User updateUser(User user) {
        return userRepository.updateUser(user);

    }
}

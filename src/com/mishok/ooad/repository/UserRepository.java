package com.mishok.ooad.repository;

import com.mishok.ooad.model.User;

/**
 * Implementation for user repository.
 * Here we make direct queries to db or use framework capabilities.
 */
public class UserRepository {

    /**
     * Add user to db and return it.
     */
    public User addUser(User user) {
        return new User();
    }

    public User updateUser(User user) {
        return new User();
    }

    public User getUser(long id) {
        return new User();
    }

    public User deleteUser(long id) {
        return new User();
    }
}

package com.mishok.ooad.controllers;

import com.mishok.ooad.model.User;
import com.mishok.ooad.response.HTTPResponse;
import com.mishok.ooad.service.UserService;

public class UserController {
    private UserService userService;

    /**
     * GET /api/user/{id}
     *
     * Get user.
     */
    public HTTPResponse getUser(String request){
        //Get id from request
        long id = 0;
        User user = userService.getUser(id);
        return new HTTPResponse("User returned");
    }

    /**
     * POST /api/user
     *
     * Add user and return its id.
     */
    public HTTPResponse addUser(String request){
        //Get user from request
        User user = new User();
        User returned = userService.addUser(user);
        return new HTTPResponse("Id returned");
    }

    /**
     * DELETE /api/user/{id}
     *
     * Delete user and return its id.
     */
    public HTTPResponse deleteUser(String request){
        //Get id from request
        long id = 0;
        User returned = userService.deleteUser(id);
        return new HTTPResponse("Deleted");
    }

    /**
     * PUT /api/user/{id}
     *
     * Update user and return its id.
     */
    public HTTPResponse updateUser(String request){
        //Get id and new user information from request
        long id = 0;
        User user = new User();
        userService.updateUser(user);
        return new HTTPResponse("Updated");
    }
}

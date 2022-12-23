package com.mishok.ooad.service;

import com.mishok.ooad.model.User;

public class BlockingService {
    UserService userService;

    /**
     * Block user logic.
     */
    public void blockUser(User user){
        //Set user to suspended and update in DB.
    }
}

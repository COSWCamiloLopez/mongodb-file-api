package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.User;

import java.util.List;

/**
 * @author Santiago Carrillo
 * 8/21/17.
 */
public interface UserService {

    /**
     * @return
     */
    List<User> getUsers();

    /**
     * @param id
     * @return
     */
    User getUser(String id);

    /**
     * @param user
     * @return
     */
    void createUser(User user);

    /**
     * @param email
     * @return
     */
    User findUserByEmail(String email);

    /**
     * @param email
     * @param password
     * @return
     */
    User findUserByEmailAndPassword(String email, String password);

    /**
     * @param username
     * @return
     */
    User findUserByUsername(String username);
}
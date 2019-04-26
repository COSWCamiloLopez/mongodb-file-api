package com.eci.cosw.springbootsecureapi.controller;

import com.eci.cosw.springbootsecureapi.model.User;
import com.eci.cosw.springbootsecureapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import java.util.List;

/**
 * @author Santiago Carrillo
 * 8/21/17.
 */
@RestController
@CrossOrigin("*")
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("id/{idUser}")
    @ResponseBody
    public User getUserById(@PathVariable("idUser") String idUser) throws ServletException {
        if (userService.getUser(idUser) != null) {
            return userService.getUser(idUser);
        } else {
            throw new ServletException("Doesn't exist an user whit this id");
        }
    }

    @GetMapping("username/{userName}")
    @ResponseBody
    public User getUserByUserName(@PathVariable("userName") String userName) throws ServletException {
        if (userService.findUserByUsername(userName) != null) {
            return userService.findUserByUsername(userName);
        } else {
            throw new ServletException("Doesn't exist an user whit this username");
        }
    }

    @GetMapping("email/{email}")
    @ResponseBody
    public User getUserByEmail(@PathVariable("email") String email) throws ServletException {
        if (userService.findUserByUsername(email) != null) {
            return userService.findUserByEmail(email);
        } else {
            throw new ServletException("Doesn't exist an user whit this email");
        }
    }

    @GetMapping("all")
    @ResponseBody
    public List<User> getAll() throws Exception {
        return userService.getUsers();
    }

}

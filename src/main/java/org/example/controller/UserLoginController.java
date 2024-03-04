package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Login;
import org.example.service.LoginService;
import org.example.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/login")
@RequiredArgsConstructor
public class UserLoginController {
    final LoginService loginService;
    @PostMapping("/request-login")
    public boolean validateLogin(@RequestBody Login login){
    return loginService.validateLogin(login);
    }
}

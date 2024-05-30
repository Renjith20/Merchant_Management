package com.example.Merchant_management.Controller;
import com.example.Merchant_management.Service.AuthenticationService;
import com.example.Merchant_management.model.Admin;
import com.example.Merchant_management.model.LoginResponseDTO;
import com.example.Merchant_management.model.RegistrationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;





@RestController
@RequestMapping("/auth")
public class AuthenticationController {


    @Autowired
    private AuthenticationService authenticationService;


    @PostMapping("/register")
    public Admin registerUser(@RequestBody RegistrationDTO body){
        return authenticationService.registerUser(body.getUsername(), body.getPassword());
    }

    @PostMapping("/login")
    public LoginResponseDTO loginUser(@RequestBody RegistrationDTO body){
        return authenticationService.loginUser(body.getUsername(), body.getPassword());
    }
}
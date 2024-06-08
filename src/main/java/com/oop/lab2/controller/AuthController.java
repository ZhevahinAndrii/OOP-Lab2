package com.oop.lab2.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.oop.lab2.dto.AuthDTO;
import com.oop.lab2.dto.LoginDTO;
import com.oop.lab2.service.AuthService;
import com.oop.lab2.service.JsonParser;

import java.util.Optional;

@RestController
@RequestMapping(value = "/auth")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173/")
public class AuthController {
    private final AuthService authService;
    @PostMapping
    private String auth(@RequestBody LoginDTO loginDto) throws Exception {
        Optional<AuthDTO> response = authService.auth(loginDto);
        if(response.isEmpty()){
            return "[]";
        }
        return JsonParser.toJsonObject(response.get());
    }

}

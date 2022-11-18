package ru.carpooling.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequiredArgsConstructor
public class AuthController {

    @PostMapping("/login")
    private ResponseEntity login(
            @RequestBody String username) {

        Random rnd = new Random();
        return rnd.nextDouble() >= 0.5 ? ResponseEntity.status(HttpStatus.BAD_REQUEST).body(HttpStatus.BAD_REQUEST.getReasonPhrase())
                : ResponseEntity.status(HttpStatus.OK).body(HttpStatus.OK.getReasonPhrase());
    }

}

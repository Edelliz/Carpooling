package controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Random;

@Controller("/auth")
@RequiredArgsConstructor
public class AuthController {
    @PostMapping("/login")
    private HttpStatus login(
            @Param("username") String username,
            @Param("password") String password) {

        Random rnd = new Random();

        return rnd.nextDouble() >= 0.5? HttpStatus.FORBIDDEN : HttpStatus.OK;
    }

}

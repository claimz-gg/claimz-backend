package org.claimz.controller;

import jakarta.ws.rs.core.Response;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/auth")
public class AuthenticationController {

    @PostMapping("/signup")
    public Response signUp() {
        return Response.ok("OK: User signed up").build();
    }

    @PostMapping("/signin")
    public Response signIn() {
        return Response.ok("OK: User signed in").build();
    }

    @PostMapping("/refresh")
    public Response refreshToken() {
        return Response.ok("OK: Token refreshed").build();
    }

    @PostMapping("/logout")
    public Response logout() {
        return Response.ok("OK: User logged out").build();
    }
}

package org.claimz.controller;

import jakarta.ws.rs.core.Response;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserManagementController {

    @GetMapping("/profile")
    public Response getProfile() {
        return Response.ok("OK: User profile retrieved").build();
    }

    @PutMapping("/profile")
    public Response updateProfile() {
        return Response.ok("OK: User profile updated").build();
    }
}
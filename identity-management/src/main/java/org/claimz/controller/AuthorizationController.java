package org.claimz.controller;

import jakarta.ws.rs.core.Response;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth/access")
public class AuthorizationController {

    @GetMapping("/check")
    public Response checkAccess() {
        return Response.ok("OK: Access control check performed").build();
    }
}